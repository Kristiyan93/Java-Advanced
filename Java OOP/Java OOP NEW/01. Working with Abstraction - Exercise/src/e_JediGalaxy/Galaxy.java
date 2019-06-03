package e_JediGalaxy;

public class Galaxy {
    private Stars[][] stars;

    public Galaxy(int rows, int cols) {
        this.stars = new Stars[rows][cols];
        this.fillStars();
    }

    private void fillStars() {
        int stratValue = 0;

        for (int i = 0; i < this.stars.length; i++) {
            for (int j = 0; j < this.stars[i].length; j++) {
                this.stars[i][j] = new Stars(stratValue++);
            }
        }
    }

    public int getRow() {
        return this.stars.length;
    }

    public int getCol(int row) {
        return this.stars[0].length;
    }

    public void setStar(int row, int col, Stars stars) {
        if (isInRange(row, col)) {
            this.stars[row][col] = stars;
        }
    }

    private boolean isInRange(int row, int col) {
        return row >= 0 && row < this.stars.length
                && col >= 0 && col < this.stars[row].length;
    }

    public int getStartValue(int row, int col) {
        if (isInRange(row, col)) {
            return this.stars[row][col].getValue();
        }

        return 0;
    }
}
