package Seminars.Seminar1OOP;

import java.util.Comparator;

public class ChildrenComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o2.howManyChildren() - o1.howManyChildren();
    }
}
