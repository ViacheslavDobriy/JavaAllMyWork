package HomeWorks.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public abstract class People {

    private String name;
    private int age;
    private int power;

    private People(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public People() {
        this("Slava", 26, 100);
    }
    public String GetName () {

//        Scanner name1 = new Scanner(System.in);
//        return name1.nextLine();
        return name;
    }

    public int GetAge () {

//        Scanner age = new Scanner(System.in);
//        return age.nextInt();
        return age;
    }

    public int SetPower () {
        Random power = new Random();
        return power.nextInt(10, 100);
    }

}
