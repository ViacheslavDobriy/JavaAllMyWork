/**
 * Жанр
 * Название песни
 * количество прослушиваний
 * <p>
 * Дай мне список популярной для сна музыки
 * <p>
 * List<Music>
 * - Название
 * - Автор
 * - Количество прослушиваний
 */

package Seminars.Seminar5;

import java.util.*;

public class Music {

    public static void main(String[] args) {

        List<String> genres = CreateGenres();
        String[] allSongs = new String[] {"Boshki Dymyatsa","Sinimi Zheltymi Krasnymi","Highway To Hell","Sonet","Rayda","Since U Been Gone","La Grange","My Heart","Someday","Shape Of You","A cap","Passport","Controller","Notebook","Troubles","Phone","Ring","Glass water","Lemonade","A ram zam zam","MicroWave","Room","Alone","Alies","Table face","Door opening","bedroom","Bless you","Young and brave","Simple","Programming"};
        Map<String, Integer> songRates = CreateSongNames(allSongs);
        Map<String, Map<String, Integer>> playList = FillMap(genres, songRates);
        System.out.println(playList);
        playList = Sort(playList);
        System.out.println(playList);

    }

    public static List<String> CreateGenres() {

        List<String> genres = new ArrayList<>();
        genres.add("Pop");
        genres.add("Hip-Hop");
        genres.add("Rap");
        genres.add("Classic");
        genres.add("Rock");
        genres.add("DupStep");
        return genres;

    }

    public static Map<String, Integer> CreateSongNames(String[] songs) {

        Map<String, Integer> songNames = new HashMap<>();
        for (int i = 0; i < songs.length; i++) {
            songNames.put(songs[i],(int) ((Math.random() * 1001) + 1));
        }

        return songNames;

    }

    public static Map<String, Map<String, Integer>> FillMap(List<String> genres, Map<String, Integer> songRates) {

        Map<String, Map<String, Integer>> playList = new HashMap<>();

        for (int i = 0; i < songRates.size(); i++) {

            List<String> keyList = new ArrayList<>(songRates.keySet());
            List<Integer> valueList = new ArrayList<>(songRates.values());
            Map<String, Integer> temp = new HashMap<>();

            List<String> keyPlayList = new ArrayList<>(playList.keySet());
            temp.put(keyList.get(i), valueList.get(i));

            if (playList.isEmpty()) {
                playList.put(genres.get((int) (Math.random() * 6)), temp);
            } else {
                boolean find = false;
                int forListGenre = (int) (Math.random() * 6);
                for (int j = 0; j < playList.size(); j++) {

                    if (Objects.equals(genres.get(forListGenre), keyPlayList.get(j))) {

                        playList.get(genres.get(forListGenre)).put(keyList.get(i), valueList.get(i));
                        find = true;
                    }
                }
                if (!find) {
                    playList.put(genres.get(forListGenre), temp);
                }
            }
        }
        return playList;
    }

    public static Map<String, Map<String, Integer>> Sort(Map<String, Map<String, Integer>> noSorted) {

        Map<String, Map<String, Integer>> sorted = new LinkedHashMap<>();
        List<String> stringList = new ArrayList<>(noSorted.keySet());
        int count = 0;
        for (Map.Entry<String, Map<String, Integer>> item : noSorted.entrySet()) {

            List<String> listOfKeys = new ArrayList<>(item.getValue().keySet());
            List<Integer> listOfValues = new ArrayList<>(item.getValue().values());
            Map<String , Integer> songs = new LinkedHashMap<>(SortLists(listOfKeys, listOfValues));
            List<String> newListOfKeys = new ArrayList<>(songs.keySet());
            List<Integer> newListOfValues = new ArrayList<>(songs.values());
            if(sorted.containsKey(stringList.get(count))) {
                sorted.get(stringList.get(count)).put(newListOfKeys.get(count),newListOfValues.get(count));
            } else {
                sorted.put(stringList.get(count), songs);
            }

            count++;
        }
        return sorted;
    }

    public static Map<String , Integer> SortLists(List<String> keys, List<Integer> values) {

        Map<String , Integer> result = new LinkedHashMap<>();
        List<String> newKeys = new ArrayList<>();
        List<Integer> newValues = new ArrayList<>();

        while (!values.isEmpty()) {

            int max = values.get(0);
            int indexMax = 0;

            for (int i = 0; i < values.size(); i++) {

                if (max < values.get(i)) {
                    max = values.get(i);
                    indexMax = i;
                }
            }
            newValues.add(max);
            newKeys.add(keys.get(indexMax));
            values.remove(indexMax);
            keys.remove(indexMax);
        }

        for (int i = 0; i < newValues.size(); i++) {
            result.put(newKeys.get(i), newValues.get(i));
            System.out.println(result);
        }
        return result;
    }

}
