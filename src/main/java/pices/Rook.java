package pices;

import board.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Rook implements Piece{

    //TODO: реализовать ладью.

    private final static Pieces pieceType = Pieces.ROOK;
    private final Coordinate coordinate;
    private final ColorType colorType;

    public Rook(Coordinate coordinate, ColorType colorType) {
        this.coordinate = coordinate;
        this.colorType = colorType;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }


    public ColorType getColorType() {
        return colorType;
    }

    //TODO: реалізувати метод виявлення можливих ходів для тури.
    public List<Integer> getListOfPossibleMoves() {
        List<Integer> possibleMoves = new ArrayList<>();
        int coordinateY = coordinate.getCoordinateY();
        int coordinateX = coordinate.getCoordinateX();
        for (int i = 1; i <= 8; i++) {
            coordinateY--;
            coordinateX--;
//            int possibleMove = coordinate.getCoordinate(coordinateY, coordinateX);
//            possibleMoves.add(possibleMove);
        }
        return possibleMoves;
    }
    @Override
    public void move(Coordinate coordinate) {

    }

    @Override
    public Coordinate position() {
        return null;
    }
}
