package pices;

import javafx.scene.image.Image;

public enum Pieces {
    PAWN("Pawn"), KNIGHT("Knight"), ROOK("Rook"),
    BISHOP("Bishop"), QUEEN("Queen"), KING("King");

    private String piece;

    Pieces(String piece) {
        this.piece = piece;
    }

    public String getPiece() {
        return piece;
    }

    @Override
    public String toString() {
        return "piece = " + piece;
    }
}
