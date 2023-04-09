package board;

import javafx.scene.shape.Rectangle;

public class Board {

    private Rectangle square;
    private char coordinateX;
    private int coordinateY;

    public Board(Rectangle square, char coordinateX, int coordinateY) {
        this.square = square;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Rectangle getSquare() {
        return square;
    }

    public char getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }
}
