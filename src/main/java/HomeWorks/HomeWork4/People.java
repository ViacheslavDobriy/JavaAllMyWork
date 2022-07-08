package HomeWorks.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public abstract class People {

    private String name;
    private int age;
    private int power;

    public People(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public People() {
        this("Slava", 26, 100);
    }

    public People(String name) {
        this.name = name;
    }
    public String GetName () {

        return name;
    }

    public int GetAge () {
        Random age = new Random();
        return age.nextInt(18, 75);
    }

    public int SetPower () {
        Random power = new Random();
        return power.nextInt(10, 100);
    }

}
