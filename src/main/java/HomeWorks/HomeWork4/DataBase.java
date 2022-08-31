package HomeWorks.HomeWork4;

import java.util.HashMap;
import java.util.Map;

public class DataBase {

    private Map<String, Integer> databaseRunning;

    public DataBase() {

        this.databaseRunning = DatabaseForRunning();

    }

    private Map<String, Integer> DatabaseForRunning() {

        Map<String, Integer> result = new HashMap<>(4);

        int[] distance = new int[] {100, 300, 1000, 5000};
        String[] difficulties = new String[] {"Easy", "Medium", "Hard", "Impossible"};

        for (int i = 0; i < distance.length; i++) {

            result.put(difficulties[i], distance[i]);

        }
        return result;
    }

    public int GetDistance (String difficult) {

        return databaseRunning.get(difficult);

    }
}
