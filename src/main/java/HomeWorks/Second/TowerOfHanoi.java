/**
 * Написать программу, показывающую последовательность действий для игры "Ханойская башня".
 */
package HomeWorks.Second;

public class TowerOfHanoi {
    public static void main(String[] args) {

        int nRings = 3;
        String StepsToSolution = MoveRings(nRings,1,3);

        for(String step : StepsToSolution.split(";")){
            System.out.println(step);
        }
    }

    public static String MoveRings(int nRings, int fromPeg, int toPeg) {
        if(nRings == 1) {
            return fromPeg + "->" + toPeg + ";";
        } else {
            String sol1, sol2, sol3;
            int helpPeg = 6 - fromPeg - toPeg;
            sol1 = MoveRings(nRings - 1, fromPeg, helpPeg);
            sol2 = fromPeg + "->" + toPeg + ";";
            sol3 = MoveRings(nRings - 1, helpPeg, toPeg);

            return sol1 + sol2 + sol3;

        }


        }
}
