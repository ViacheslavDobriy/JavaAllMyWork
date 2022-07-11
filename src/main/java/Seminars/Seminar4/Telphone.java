//package Seminars.Seminar4;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Telephone{
//
//    private Map<People, String> telephoneMap = new HashMap<>();
//
//    public void addNewPeople(People people, String number) {
//        telephoneMap.put(people, number);
//    }
//
//    public String getNumber(String name) {
//
//        for (People people : telephoneMap.keySet()) {
//
//            if(people.getName().equals(name)) {
//                return telephoneMap.get(people);
//            }
//        }
//    }
//
//}
