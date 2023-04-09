package pices;

public class PositionOfPieces {
    private char coordinateY;
    private int coordinateX;

    public PositionOfPieces(char coordinateY, int coordinateX) {
        this.coordinateY = coordinateY;
        this.coordinateX = coordinateX;
    }

    public char getCoordinateY() {
        return coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }
}
