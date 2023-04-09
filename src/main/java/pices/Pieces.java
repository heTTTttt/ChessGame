package pices;

import board.Coordinate;

public interface Pieces {
    void move(Coordinate coordinate);
    Coordinate position();
}
