package board;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;

public enum Coordinate {
    @FXML
//    A1, A2, A3, A4,
//    A5, A6, A7, A8,
//    B1, B2, B3, B4,
//    B5, B6, B7, B8,
//    C1, C2, C3, C4,
//    C5, C6, C7, C8,
//    D1, D2, D3, D4,
//    D5, D6, D7, D8,
//    E1, E2, E3, E4,
//    E5, E6, E7, E8,
//    F1, F2, F3, F4,
//    F5, F6, F7, F8,
//    G1, G2, G3, G4,
//    G5, G6, G7, G8,
    H1(8,8), H2(7,8), H3(6,8), H4(5,8),
    H5(4,8), H6(3,8), H7(2,8),H8(1, 8);

    @FXML
    private final Rectangle square;
    private final int coordinateX;
    private final int coordinateY;

    Coordinate(int coordinateY, int coordinateX) {
        this.square = null;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Rectangle getSquare() {
        return square;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    //TODO: оптимізувати метод для виявлення усіх можливих координат.
    public static Coordinate getCoordinate(int x, int y) {
        System.out.println(y + " " + x);
        if (x == 8 && y ==6) {
            return H3;
        }
        if (x == 8 && y == 1){
            return H8;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "square=" + square +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }
}