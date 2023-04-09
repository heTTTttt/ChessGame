package pices;

import board.Coordinate;
import chessGame.Controller;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Controller implements Piece {

    private static Pieces type = Pieces.PAWN;
    private final ColorType colorType;
    private Coordinate coordinate;

    public Pawn(ColorType colorType, Coordinate coordinate) {
        this.colorType = colorType;
        this.coordinate = coordinate;
    }

    //TODO: реализовать ход пешек только вперёд.
    //TODO: РЕАЛИЗОВАТЬ что пешка со старта могла ходить на два поля вперёд.
    //TODO: если перед пешкой стоит фигура - то она не ходит вперёд.
    public List<Coordinate> getListOfPossibleMoves() {
        List<Coordinate> possibleMoves = new ArrayList<>();
        int x = coordinate.getCoordinateX();
        int y = coordinate.getCoordinateY() - 1;
        Coordinate possibleMove = Coordinate.getCoordinate(x, y);
        possibleMoves.add(possibleMove);
        return possibleMoves;
    }

    //TODO: реализовать передвижение(обновлялись координаты при каждом ходе).
    @Override
    public void move(Coordinate coordinate) {

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

