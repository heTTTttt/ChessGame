package board;

import javafx.fxml.FXML;

import java.util.Arrays;

public enum Coordinate {
    @FXML
    A1(1,1), A2(1,2), A3(1,3), A4(1,4),
    A5(1,5), A6(1,6), A7(1,7), A8(1,8),
    B1(2,1), B2(2,2), B3(2,3), B4(2,4),
    B5(2,5), B6(2,6), B7(2,7), B8(2,8),
    C1(3,1), C2(3,2), C3(3,3), C4(3,4),
    C5(3,5), C6(3,6), C7(3,7), C8(3,8),
    D1(4,1), D2(4,2), D3(4,3), D4(4,4),
    D5(4,5), D6(4,6), D7(4,7), D8(4,8),
    E1(5, 1), E2(5, 2), E3(5, 3), E4(5, 4),
    E5(5, 5), E6(5, 6), E7(5, 7), E8(5, 8),
    F1(6, 1), F2(6, 2), F3(6, 3), F4(6, 4),
    F5(6, 5), F6(6, 6), F7(6, 7), F8(6, 8),
    G1(7, 1), G2(7, 2), G3(7, 3), G4(7, 4),
    G5(7, 5), G6(7, 6), G7(7, 7), G8(7, 8),
    H1(8, 1), H2(8, 2), H3(8, 3), H4(8, 4),
    H5(8, 5), H6(8, 6), H7(8, 7), H8(8, 8);

    @FXML
//    private final Rectangle square;
    private int coordinateX;
    private int coordinateY;

    Coordinate(int coordinateY, int coordinateX) {
//        this.square = null;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

//    public Rectangle getSquare() {
//        return square;
//    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
        return coordinateY;
    }

    public int setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
        return coordinateX;
    }

    public boolean isOutOfBounds() {
        return getCoordinateX() >= 1 && getCoordinateX() <= 8 && getCoordinateY() >= 1 && getCoordinateY() <= 8;
    }


    //TODO: оптимізувати метод для виявлення усіх можливих координат.

    // метод повертає координату на якому полі знаходиться фігура.
    public static Coordinate getCoordinate(int coordinateY, int coordinateX) {
        return Arrays.stream(values())
                .filter(coordinate -> coordinateY == coordinate.coordinateY && coordinateX == coordinate.coordinateX)
                .findFirst().get();

//        System.out.println(coordinateY + " " + coordinateX);
//        for (int i = 1; i <= coordinateY; i++) {
//            for (int j = 1; j <= coordinateX; j++) {
//                if (i == coordinateY && j == coordinateX) {
//                    System.out.println("Coordinates of square = " + coordinateY + " " + coordinateX);
//                }
//            }
//        }
//        return null;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
//                "square=" + square +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}
