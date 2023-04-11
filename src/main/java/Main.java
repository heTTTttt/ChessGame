import board.Coordinate;
import pices.ColorType;
import pices.Pawn;

public class Main {
    public static void main(String[] args) {
        Coordinate coordinateH2 = Coordinate.H2;
        Coordinate coordinateH7 = Coordinate.H7;
        Coordinate coordinateG2 = Coordinate.G2;
        Coordinate coordinateG7 = Coordinate.G7;

        Pawn pawnWhiteH2 = new Pawn(ColorType.WHITE, coordinateH2);
        System.out.println("Pawn H2: \n" + pawnWhiteH2.getListOfPossibleMoves());

        Pawn pawnWhiteG2 = new Pawn(ColorType.WHITE, coordinateG2);
        System.out.println("Pawn G2: \n" + pawnWhiteG2.getListOfPossibleMoves());

        Pawn pawnBlackG7 = new Pawn(ColorType.BLACK, coordinateG7);
        System.out.println("Pawn G7: \n" + pawnBlackG7.getListOfPossibleMoves());

        Pawn pawnBlackH7 = new Pawn(ColorType.BLACK, coordinateH7);
        System.out.println("Pawn H7: \n " + pawnBlackH7.getListOfPossibleMoves());
    }
}
