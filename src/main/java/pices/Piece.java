package pices;

import board.Coordinate;

public interface Piece {
    void move(Coordinate coordinate);
    Coordinate position();
}
