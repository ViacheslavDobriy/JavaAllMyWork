package HomeWorks.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class People {

    private String name;
    private int age;
    private int power;

    private int leadership;

    public People(String member) {

        System.out.println("Insert name of " + member + ":");
        Scanner line = new Scanner(System.in);
        this.name = line.nextLine();
        SetAge();
        SetPower();

    }

    public People() {

        System.out.println("Insert name of captain: ");
        Scanner line = new Scanner(System.in);
        this.name = line.nextLine();
        SetLeadership();

    }

    public void SetAge () {
        Random Age = new Random();
        this.age = Age.nextInt(18, 50);
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

    public void SetLeadership() {

        Random quality = new Random();
        this.leadership = quality.nextInt(1, 6);

    }

    public String GetName () {

        return name;
    }

    public int GetAge () {
        return age;
    }


    public int GetPower () {
        return power;
    }

    public int GetLeadership () {

        return this.leadership;

    }

    public void DecreasePower (int powerRequirements, int resistanceDecrease) {

        this.power = this.power - powerRequirements + resistanceDecrease;
//        System.out.printf("%s - %d\n", this.name, this.power);

    }
}
