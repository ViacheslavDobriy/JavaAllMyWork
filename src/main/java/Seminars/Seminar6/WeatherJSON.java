package Seminars.Seminar6;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class WeatherJSON {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        String str;

        try {

            JsonNode jsonNode = mapper
                    .readTree(GetString("src/main/resources/wetherJSON.txt")) // ���� ���� ��������
                    .at("/DailyForecasts"); // �� ������

            Map<String, Map<String, String>> weather = new HashMap<>();

            if (jsonNode.isArray()) {
                for (JsonNode arrayItem : jsonNode) {
                    Date date = (new SimpleDateFormat("yyyy-MM-dd")).parse(arrayItem.get("Date").asText());
                    String result = (new SimpleDateFormat("dd.MM.yyyy")).format(date);
                    System.out.println(result);
                        // ���� ����� for ��� ������������ � ���������������� ����

                    String minimum = convertCelsiumToFahrenheit(arrayItem.get("Temperature")
                            .get("Minimum")
                            .get("Value")
                            .asText());
                    System.out.println(minimum);
                    // �������� ����������� �����������

                    String maximum = convertCelsiumToFahrenheit(arrayItem.get("Temperature")
                            .get("Maximum")
                            .get("Value")
                            .asText());
                    System.out.println(maximum);
                    // �������� ������������ �����������

                    weather.put(result, new HashMap<String , String >());  // ������� � ���� result
                    weather.get(result).put("Minimum", minimum);  // ������� � ���� �������
                    weather.get(result).put("Maximum", maximum);  // ������� � ���� ��������
                }
                for(Map.Entry<String , Map<String , String >> item : weather.entrySet()){  // ���������� ����

                        System.out.printf("%s - ����, %s - ������������ �����������, %s - ����������� �����������\n",item.getKey(), item.getValue().get("Maximum"), item.getValue().get("Minimum"));
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        str = GetString("src/main/resources/wetherJSON.txt");
//        System.out.println(str); // ������� ���� JSON ����
    }

    /**
     * GetString ��������� ���� � ���������� String �� ���� JSON ������
     * @param str
     * @return
     */
    public static String GetString(String str) {
        String string = "";
        String result = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(str))) {

            while ( (string = reader.readLine()) != null){
                result = result + string + "\n";
            }


        } catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * ������������ ���������� � �������
     * @param faren
     * @return
     */
    public static String convertCelsiumToFahrenheit(String faren) {
        double TF = Double.parseDouble(faren);
        double TC = ((TF - 32)*5)/9;
        return Double.toString(TC);
    }

}
