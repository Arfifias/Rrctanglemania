public class myController {
    public int row;
    public int column;

    public myController() {
        this.row = 1;
        this.column = 1;
    }

    public void resetPosition() {
        this.row = 1;
        this.column = 1;
    }



    public void moveUp() {
        if (inRange(row - 1)) {
            row--;
        }
    }

    public void moveDown() {
        if (inRange(row + 1)) {
            row++;
        }
    }

    public void moveLeft() {
        if (inRange(column - 1)) {
            column--;
        }
    }

    public void moveRight() {
        if (inRange(column + 1)) {
            column++;
        }
    }


    private boolean inRange(int s) {
        final int MIN = 1;
        final int MAX = 6;
        return (s >= MIN && s <= MAX);
    }

}
