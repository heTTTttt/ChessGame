package pices;

import board.Coordinate;
import chessGame.ChessController;

import java.util.ArrayList;
import java.util.List;

import static pices.ColorType.BLACK;
import static pices.ColorType.WHITE;

public class Pawn implements Piece {

    private final static Pieces type = Pieces.PAWN;
    private final ColorType colorType;
    private final Coordinate coordinate;
    // використати цей прапорець для виявлення стартової позиції.
    private final boolean startPosition = true;

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
        int coordinateX = coordinate.getCoordinateX();
        int coordinateY = coordinate.getCoordinateY(); // -1
        if (BLACK.isColorTypeBlack()) {
            if (startPosition){
                coordinateY += 2;
                if (!startPosition){
                    coordinateY += 1;
                }
            }
        }else if (WHITE.isColorTypeWhite()) {
            if (startPosition) {
                coordinateY -= 2;
                if (!startPosition) {
                    coordinateY -= 1;
                }
            }
        }

        Coordinate possibleMove = coordinate.getCoordinate(coordinateX, coordinateY);
        possibleMoves.add(possibleMove);
        return possibleMoves;
    }

    //TODO: реализовать передвижение(обновлялись координаты при каждом ходе).

    // метод дозволяє пішаку ходити.
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

