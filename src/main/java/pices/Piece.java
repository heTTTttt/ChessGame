package pices;

import board.Coordinate;

public interface Piece {
    void move(Coordinate coordinate) throws ImpossibleMoveException;
    Coordinate position();
}
