package HomeWorks.HomeWork4;

public class Competition {

    public static void main(String[] args) {

        People sportsmen1 = new People() {
            @Override
            public String GetName() {
                return super.GetName();
            }

            @Override
            public int GetAge() {
                return super.GetAge();
            }

            @Override
            public int SetPower() {
                return super.SetPower();
            }
        };
        System.out.printf("%s is %d years old and with %d power",sportsmen1.GetName(), sportsmen1.GetAge(), sportsmen1.SetPower());
    }
}
