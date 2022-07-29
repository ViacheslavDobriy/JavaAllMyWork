package HomeWorks.HomeWork4;

import java.util.Objects;
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
        if (Objects.equals(member, "Captain")) {
            this.leadership = line.nextInt();
        }

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
