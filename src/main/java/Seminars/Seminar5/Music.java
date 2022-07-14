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
        playList = Sort(playList);
        System.out.println(playList);
        System.out.println("Which playlist do you want listen?");
        System.out.println("Insert 1 if dance playlist is interested for you.");
        System.out.println("Insert 2 if dream playlist is interested for you. Music for sleep.");
        Scanner choice = new Scanner(System.in);
        switch (choice.nextInt()) {
            case (1):
                System.out.println(DancePlaylist(playList));
                break;
            case (2):
                System.out.println(SongsForDream(playList));
                break;
            default:
                System.out.println("Next time insert legal number!");
        }
    }

    public static List<String> CreateGenres() {

        List<String> genres = new ArrayList<>();
        genres.add("Pop");
        genres.add("Hip-Hop");
        genres.add("Rap");
        genres.add("Classic");
        genres.add("Rock");
        genres.add("DupStep");
        genres.add("Relax");
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
                playList.put(genres.get((int) (Math.random() * genres.size())), temp);
            } else {
                boolean find = false;
                int forListGenre = (int) (Math.random() * genres.size());
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

        }
        return result;
    }

    public static List<String> DancePlaylist (Map<String ,Map<String , Integer>> MusicData) {
        Map<String , Integer> hipHop = new LinkedHashMap<>(MusicData.get("Hip-Hop"));
        List<String> listKeysHipHop = new ArrayList<>(hipHop.keySet());
        List<Integer> listValuesHipHop = new ArrayList<>(hipHop.values());

        Map<String , Integer> pop = new LinkedHashMap<>(MusicData.get("Pop"));
        List<String> listKeysPop = new ArrayList<>(pop.keySet());
        List<Integer> listValuesPop = new ArrayList<>(pop.values());

        List<String> result = new ArrayList<>();

        int countForHipHop = 0;
        int countForPop = 0;
        for (int i = 0; i < (listValuesPop.size() + listValuesHipHop.size())/2 ; i++) {
            if(listValuesHipHop.get(countForHipHop)>=listValuesPop.get(countForPop)) {
                result.add(listKeysHipHop.get(countForHipHop));
                countForHipHop++;
            } else {
                result.add(listKeysPop.get(countForPop));
                countForPop++;
            }
        }
        System.out.println("Top of the dance music:");
        return result;
    }

    static public List<String> SongsForDream (Map<String , Map<String , Integer>> map) {

        Map<String , Integer> relax = new LinkedHashMap<>(map.get("Relax"));
        List<String> listKeysRelax = new ArrayList<>(relax.keySet());
        List<Integer> listValuesRelax = new ArrayList<>(relax.values());

        Map<String , Integer> classic = new LinkedHashMap<>(map.get("Classic"));
        List<String> listKeysClassic = new ArrayList<>(classic.keySet());
        List<Integer> listValuesClassic = new ArrayList<>(classic.values());

        List<String> result = new ArrayList<>();

        int countForClassic = 0;
        int countForRelax = 0;
        for (int i = 0; i < (listValuesRelax.size() + listValuesClassic.size())/2 ; i++) {
            if(listValuesClassic.get(countForClassic)>=listValuesRelax.get(countForRelax)) {
                result.add(listKeysClassic.get(countForClassic));
                countForClassic++;
            } else {
                result.add(listKeysRelax.get(countForRelax));
                countForRelax++;
            }
        }
        System.out.println("Top of the music for sleep:");
        return result;
    }

}
