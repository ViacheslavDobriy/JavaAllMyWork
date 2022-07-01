/**
 * Написать программу, показывающую последовательность действий для игры "Ханойская башня".
 */
package HomeWorks.Second;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int maxRingCount = 3;
        int[] towers = new int[]{maxRingCount,0,0};
        MoveRing(towers, maxRingCount, 0, 1,2,0);
    }

    public static void MoveRing(int[] tower, int maxRingCount, int topColumn, int buferColumn, int nextTop, int rootColumn) {

        if (tower[1]!=maxRingCount || tower[2]!=maxRingCount) {
            System.out.printf("Move from %d to %d\n", topColumn, buferColumn);
            tower[topColumn] = tower[topColumn] - 1;
            tower[buferColumn] = tower[buferColumn] + 1;
            System.out.printf("Move from %d to %d\n", topColumn, nextTop);
            tower[topColumn] = tower[topColumn] - 1;
            tower[nextTop] = tower[nextTop] + 1;
            System.out.printf("Move from %d to %d\n", buferColumn, nextTop);
            tower[buferColumn] = tower[buferColumn] - 1;
            tower[nextTop] = tower[nextTop] + 1;
            if(tower[rootColumn]==1 && tower[buferColumn]==0){
                System.out.printf("Move from %d to %d\n", rootColumn, buferColumn);
                tower[rootColumn] = tower[rootColumn] - 1;
                tower[buferColumn] = tower[buferColumn] + 1;
                rootColumn = buferColumn;
            }
            MoveRing(tower, maxRingCount, nextTop, topColumn, buferColumn, rootColumn);

            }
        }
}
