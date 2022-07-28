package HomeWorks.HomeWork4;

import java.util.Random;

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
        this.age = GetAge();
        this.power = GetPower();
    }
    public String GetName () {

        return name;
    }

    public void SetAge () {
        Random age1 = new Random();
        age = age1.nextInt(18, 75);
    }

    public int GetAge () {
        return age;
    }

    public void SetPower () {
        Random power1 = new Random();
        power = power1.nextInt(10, 100);
    }

    public int GetPower () {
        return power;
    }

    public void DecreasePower (int powerRequirements) {
        this.power = this.power - powerRequirements;
    }

}
