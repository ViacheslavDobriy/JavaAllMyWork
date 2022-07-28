package HomeWorks.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class People {

    private String name;
    private int age;
    private int power;

    public People(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }
    public People() {

        System.out.println("Insert name of sportsmen: ");
        Scanner line = new Scanner(System.in);
        this.name = line.nextLine();
        SetAge();
        SetPower();

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
        this.age = age1.nextInt(18, 50);
    }

    public int GetAge () {
        return age;
    }

    public void SetPower () {

        if(this.age<=25) {

            this.power = 100;

        } else if (this.age<=40) {

            this.power = 90;

        } else {

            this.power = 75;

        }
    }

    public int GetPower () {
        return power;
    }

    public void DecreasePower (int powerRequirements) {
        this.power = this.power - powerRequirements;
    }

    public void ShowInfo() {

        System.out.printf("%s %d %d\n", this.name, this.age, this.power);

    }
}
