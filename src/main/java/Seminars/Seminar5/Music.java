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
        Map<String, Integer> songRates = CreateSongNames();
        Map<String, Map<String, Integer>> playList = FillMap(genres, songRates);
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

    public static Map<String, Integer> CreateSongNames() {

        Map<String, Integer> songNames = new HashMap<>();
        songNames.put("Boshki Dymyatsa", (int) ((Math.random() * 1001) + 1));
        songNames.put("Sinimi Zheltymi Krasnymi", (int) ((Math.random() * 1001) + 1));
        songNames.put("Highway To Hell", (int) ((Math.random() * 1001) + 1));
        songNames.put("Sonet", (int) ((Math.random() * 1001) + 1));
        songNames.put("Rayda", (int) ((Math.random() * 1001) + 1));
        songNames.put("Since U Been Gone", (int) ((Math.random() * 1001) + 1));
        songNames.put("La Grange", (int) ((Math.random() * 1001) + 1));
        songNames.put("My Heart", (int) ((Math.random() * 1001) + 1));
        songNames.put("Someday", (int) ((Math.random() * 1001) + 1));
        songNames.put("Shape Of You", (int) ((Math.random() * 1001) + 1));
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
}
//    public static void Sort(Map<String, Map<String, Integer>> noSorted) {
//        List<String> howManyListened = new ArrayList<>();
//        for (Map.Entry<String, Map<String, Integer>> item:noSorted.entrySet()) {
//            String[] music = item.getValue().keySet().toArray(new String[item.getValue().keySet().size()]);
//            for (String str: music) {
//                System.out.println(str);
//            }
//            int temp = 0;
//            for (int i = 0; i < music.length; i++) {
//                for (int j = i; j < music.length; j++) {
//                    int max = item.getValue().get(music[j]);
//                    if(max<item.getValue().get(music[j])) {
//
//                        temp = j;
//                        max = item.getValue().get(music[j]);
//
//
//                    } else {
//
//                    }
//                }
//                howManyListened.add(music[temp]);
//            }
//        }
//        System.out.println(howManyListened);
//    }

