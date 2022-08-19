package Seminars.SeminarOOP4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Описываем наш лист
 */
public class MyList<T> {
    private Object[] myList;
    private int lastEmpty;

    public MyList(int size) {

        this.myList = new Object[size];

    }

    public void add(T object1) {

        if (lastEmpty >= myList.length) {
            myList = fullList();
        }
        myList[lastEmpty] = object1;
        lastEmpty++;
    }

    public T getByIndex(int index){
        return (T) myList[index];
    }

    public Object removeByIndex(int index) {
        Object forReturn = myList[index];
        for (int i = index; i < lastEmpty; i++) {
            myList[i] = myList[i+1];
        }
        lastEmpty--;
        return forReturn;
    }

    public Object removeByElement(T o1) {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i]==o1) {
                return removeByIndex(i);
            }
        }
        return null;
    }

    public void set(T o, int index) {
        myList[index] = o;
    }

    public int indexOf(T o) {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i]==o) {
                return i;
            }
        }
        System.out.println("Not found");
        return -1;
    }

    public boolean contains(T o) {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i]==o) {
                return true;
            }
        }
        return false;
    }

    public int size(){
        return lastEmpty;
    }
    public void addAll(MyList<T> secondList) {
        for (int i = 0; i < secondList.size(); i++) {
            add(secondList.getByIndex(i));
        }
    }

    public void removeAll(MyList<T> secondList) {
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (myList[i]==secondList.getByIndex(j)) {
                    myList[i]=null;
                }
            }
        }
    }

    public void sort() {
        Arrays.sort(myList,0,lastEmpty);
    }


    private Object[] fullList() {

        Object[] newList = new Object[myList.length*2];
        for (int i = 0; i < myList.length ; i++) {
            newList[i] = myList[i];
        }
        lastEmpty = myList.length;
        return newList;
    }

    @Override
    public String toString() {
        return Arrays.toString(myList);
    }
}
