import board.Coordinate;
import pices.ColorType;
import pices.ImpossibleMoveException;
import pices.Rook;

public class ChessGame {
    public static void main(String[] args) throws ImpossibleMoveException {

//        Pawn pawnWhiteH2 = new Pawn(ColorType.WHITE, Coordinate.H2);
//        System.out.println("Pawn H possible moves: " + pawnWhiteH2.getListOfPossibleMoves() + "\n");
//        pawnWhiteH2.move(Coordinate.H4);
//
//        System.out.println("Pawn H move to: " + pawnWhiteH2);
//        System.out.println("Possible moves after move: ");
//        System.out.println(pawnWhiteH2.getListOfPossibleMoves());

//        Pawn pawnWhiteG2 = new Pawn(ColorType.WHITE, coordinateG2);
//        System.out.println("Pawn G2 possible moves: " + pawnWhiteG2.getListOfPossibleMoves() + "\n");
//
//        Pawn pawnBlackG7 = new Pawn(ColorType.BLACK, Coordinate.G7);
//        System.out.println("Pawn G possible moves: " + pawnBlackG7.getListOfPossibleMoves() + "\n");
//        pawnBlackG7.move(Coordinate.G5);
//
//        System.out.println("Pawn G move to: " + pawnBlackG7);
//        System.out.println("Possible moves after move: ");
//        System.out.println(pawnBlackG7.getListOfPossibleMoves());

//        System.out.println(Coordinate.getCoordinate(5, 5));

//        Pawn pawnBlackH7 = new Pawn(ColorType.BLACK, coordinateH7);
//        System.out.println("Pawn H7 possible moves: " + pawnBlackH7.getListOfPossibleMoves() + "\n");
//        System.out.println("===============================");
//        Rook rookA1 = new Rook(Coordinate.A1, ColorType.WHITE);
//        System.out.println("Rook A1 : \n" + rookA1.getListOfPossibleMoves());
        Rook rookH1 = new Rook(Coordinate.H1, ColorType.WHITE);
        System.out.println("Rook H1 : \n" + rookH1.getListOfPossibleMoves());
        rookH1.move(Coordinate.F1);
    }
}
