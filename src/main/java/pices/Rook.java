package pices;

import board.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Rook implements Piece {

    //TODO: реализовать ладью.

    private final static Pieces pieceType = Pieces.ROOK;
    private Coordinate coordinate;
    private final ColorType colorType;
    private boolean startPosition = true;

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
    public List<Coordinate> getListOfPossibleMoves() throws ImpossibleMoveException{
        List<Coordinate> possibleMoves = new ArrayList<>();
        if (coordinate.getCoordinateX() == this.coordinate.getCoordinateX()) {
            for (int i = 1; i <= 8; i++) {
                if (coordinate.isOutOfBounds()) {
                    possibleMoves.add(Coordinate.getCoordinate(this.coordinate.getCoordinateY() + i, this.coordinate.getCoordinateX()));
                }
            }
        } else {
            throw new ImpossibleMoveException("Impossible move");
        }
        if (coordinate.getCoordinateY() == this.coordinate.getCoordinateY()) {
            for (int i = 1; i <= 8; i++) {
                if (coordinate.isOutOfBounds()) {
                    possibleMoves.add(Coordinate.getCoordinate(this.coordinate.getCoordinateY() + i, this.coordinate.getCoordinateX()));
                }
            }
        } else {
            throw new ImpossibleMoveException("Impossible move");
        }

        return possibleMoves;
    }
    @Override
    public void move(Coordinate coordinate) throws ImpossibleMoveException {
        List<Coordinate> possibleMoves = getListOfPossibleMoves();
        if (possibleMoves.contains(coordinate)) {
            this.coordinate = coordinate;
            startPosition = false;
        } else {
            throw new ImpossibleMoveException("Impossible move");
        }
    }

    @Override
    public Coordinate position() {
        return null;
    }
}
