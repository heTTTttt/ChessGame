import board.Coordinate;
import pices.ColorType;
import pices.Pawn;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinateH2 = Coordinate.H2;
        Coordinate coordinateH7 = Coordinate.H7;
        System.out.println(coordinateH2);

        Pawn pawnWhite = new Pawn(ColorType.WHITE, coordinateH2);
        System.out.println(pawnWhite);
        System.out.println(pawnWhite.getListOfPossibleMoves());
        Pawn pawnBlack = new Pawn(ColorType.BLACK, coordinateH7);
        System.out.println(pawnBlack.getListOfPossibleMoves());
    }
}
