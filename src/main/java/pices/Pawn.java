package pices;

import board.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements Piece {

    private final static Pieces type = Pieces.PAWN;
    private final ColorType colorType;
    private Coordinate coordinate;
    private boolean startPosition = true;     // використати цей прапорець для виявлення стартової позиції.

    public Pawn(ColorType colorType, Coordinate coordinate) {
        this.colorType = colorType;
        this.coordinate = coordinate;
    }

    //TODO: реализовать ход пешек только вперёд.
    //TODO: РЕАЛИЗОВАТЬ что пешка со старта могла ходить на два поля вперёд.
    //TODO: если перед пешкой стоит фигура - то она не ходит вперёд.

    // метод повертає список можливих ходів.
    public List<Coordinate> getListOfPossibleMoves() {
        List<Coordinate> possibleMoves = new ArrayList<>();

        if (ColorType.isBlack(colorType) && coordinate.isOutOfBounds()) {
            if (startPosition) {
                possibleMoves.add(Coordinate.getCoordinate(this.coordinate.getCoordinateY(), this.coordinate.getCoordinateX() - 2));
            }
                possibleMoves.add(Coordinate.getCoordinate(this.coordinate.getCoordinateY(), this.coordinate.getCoordinateX() - 1));
        }
        if (ColorType.isWhite(colorType) && coordinate.isOutOfBounds()) {
            if (startPosition) {
                possibleMoves.add(Coordinate.getCoordinate(this.coordinate.getCoordinateY(), this.coordinate.getCoordinateX() + 2));
            }
                possibleMoves.add(Coordinate.getCoordinate(this.coordinate.getCoordinateY(), this.coordinate.getCoordinateX() + 1));
        }
        return possibleMoves;
    }

    //TODO: реализовать передвижение(обновлялись координаты при каждом ходе).

    // метод дозволяє пішаку ходити.
    @Override
    public void move(Coordinate coordinate) throws ImpossibleMoveException {
        List<Coordinate> possibleMoves = getListOfPossibleMoves();
            if (possibleMoves.contains(coordinate)) {
                this.coordinate = coordinate;
                startPosition = false;             // використати цей прапорець для виявлення стартової позиції.
            } else {
                throw new ImpossibleMoveException("Impossible move");
            }
    }

    @Override
    public Coordinate position() {
        return null;
    }


    @Override
    public String toString() {
        return "Pawn{" +
                "colorType=" + colorType +
                ", coordinate=" + coordinate +
                '}';
    }
}

