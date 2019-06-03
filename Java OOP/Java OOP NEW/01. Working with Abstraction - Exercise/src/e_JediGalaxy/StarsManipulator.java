package e_JediGalaxy;

public class StarsManipulator {
    private Galaxy galaxy;

    public StarsManipulator(Galaxy galaxy) {
        this.galaxy = galaxy;
    }


    public void destroyStarts(int[] enemyPostions) {
        int enemyRow = enemyPostions[0];
        int enemyCol = enemyPostions[1];

        while (enemyRow >= 0 && enemyCol >= 0) {
            if (isInRange(enemyRow, enemyCol)) {
                this.galaxy.setStar(enemyRow, enemyCol, new Stars(0));
            }

            enemyRow--;
            enemyCol--;
        }
    }

    private boolean isInRange(int enemyRow, int enemyCol) {
        return enemyRow >= 0 && enemyRow < this.galaxy.getRow()
                && enemyCol >= 0 && enemyCol < this.galaxy.getCol(enemyRow);
    }

    public long sumStars(int[] playerPositions) {
        int row = playerPositions[0];
        int col = playerPositions[1];
        int sum = 0;

        while (row >= 0 && col <= this.galaxy.getCol(0)) {
            if (isInRange(row, col)) {
                sum += this.galaxy.getStartValue(row, col);
            }

            row--;
            col++;
        }

        return sum;
    }
}
