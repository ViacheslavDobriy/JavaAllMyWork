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
                    .readTree(GetString("src/main/resources/wetherJSON.txt")) // сюда путь воткнуть
                    .at("/DailyForecasts"); // не менять

            Map<String, Map<String, String>> weather = new HashMap<>();

            if (jsonNode.isArray()) {
                for (JsonNode arrayItem : jsonNode) {
                    Date date = (new SimpleDateFormat("yyyy-MM-dd")).parse(arrayItem.get("Date").asText());
                    String result = (new SimpleDateFormat("dd.MM.yyyy")).format(date);
                    System.out.println(result);
                        // выше после for для вытаскивания и преобразовывания даты

                    String minimum = convertCelsiumToFahrenheit(arrayItem.get("Temperature")
                            .get("Minimum")
                            .get("Value")
                            .asText());
                    System.out.println(minimum);
                    // вытащили минимальную температуру

                    String maximum = convertCelsiumToFahrenheit(arrayItem.get("Temperature")
                            .get("Maximum")
                            .get("Value")
                            .asText());
                    System.out.println(maximum);
                    // вытащили максимальную температуру

                    weather.put(result, new HashMap<String , String >());  // занесли в мапу result
                    weather.get(result).put("Minimum", minimum);  // занесли в мапу минимум
                    weather.get(result).put("Maximum", maximum);  // занесли в мапу максимум
                }
                for(Map.Entry<String , Map<String , String >> item : weather.entrySet()){  // показываем мапу

                        System.out.printf("%s - Дата, %s - максимальная температура, %s - минимальная температура\n",item.getKey(), item.getValue().get("Maximum"), item.getValue().get("Minimum"));
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        str = GetString("src/main/resources/wetherJSON.txt");
//        System.out.println(str); // покажет весь JSON файл
    }

    /**
     * GetString считывает файл и вовзращает String со всем JSON файлом
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
     * Конвертируем ФАРЕНГЕЙТЫ в ЦЕЛЬСИИ
     * @param faren
     * @return
     */
    public static String convertCelsiumToFahrenheit(String faren) {
        double TF = Double.parseDouble(faren);
        double TC = ((TF - 32)*5)/9;
        return Double.toString(TC);
    }

}
