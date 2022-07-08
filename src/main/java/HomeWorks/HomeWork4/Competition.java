package HomeWorks.HomeWork4;

public class Competition {

    public static void main(String[] args) {

        People sportsmen1 = new People(){};
        People sportsmen2 = new People("Nastya"){};
        People sportsmen3 = new People("Roman"){};
        People sportsmen4 = new People("Gleb"){};
        People sportsmen5 = new People("Sergey"){};
        People sportsmen6 = new People("Mihail"){};

        System.out.printf("%s is %d years old and with %d power\n",sportsmen1.GetName(), sportsmen1.GetAge(), sportsmen1.SetPower());
        System.out.printf("%s is %d years old and with %d power\n",sportsmen2.GetName(), sportsmen2.GetAge(), sportsmen2.SetPower());
        System.out.printf("%s is %d years old and with %d power\n",sportsmen3.GetName(), sportsmen3.GetAge(), sportsmen3.SetPower());
        System.out.printf("%s is %d years old and with %d power\n",sportsmen4.GetName(), sportsmen4.GetAge(), sportsmen4.SetPower());
        System.out.printf("%s is %d years old and with %d power\n",sportsmen5.GetName(), sportsmen5.GetAge(), sportsmen5.SetPower());
        System.out.printf("%s is %d years old and with %d power\n",sportsmen6.GetName(), sportsmen6.GetAge(), sportsmen6.SetPower());
    }
}
