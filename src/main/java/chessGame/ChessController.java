package chessGame;

import board.Coordinate;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import pices.DraggableMarker;
import pices.Pieces;


public class ChessController {

// @FXML
// Rectangle squareH8 = Coordinate.H8.getSquare();
// @FXML
// Rectangle squareH7 = Coordinate.H7.getSquare();
// @FXML
// Rectangle squareH6 = Coordinate.H6.getSquare();
// @FXML
// Rectangle squareH5 = Coordinate.H5.getSquare();
// @FXML
// Rectangle squareH4 = Coordinate.H4.getSquare();
// @FXML
// Rectangle squareH3 = Coordinate.H3.getSquare();
// @FXML
// Rectangle squareH2 = Coordinate.H2.getSquare();
// @FXML
// Rectangle squareH1 = Coordinate.H1.getSquare();
 @FXML
 ImageView whitePawnH;
 DraggableMarker draggableMarker = new DraggableMarker();

 @FXML
 public void mouseClickPawn(MouseEvent actionEvent) {
  System.out.println("It`s a piece "+ Pieces.PAWN.getPiece() + " " + actionEvent.getX() + " " + actionEvent.getY());
//  System.out.println(squareH8);
  System.out.println("Scene coordinate " + whitePawnH.yProperty() + " " + whitePawnH.xProperty());
 }

 @FXML
 public void mouseClickSquare(MouseEvent actionEvent) {
  System.out.println("It`s a square " + actionEvent.getX() + " " + actionEvent.getY());
//  System.out.println(squareH8);
 }
// @FXML
// public void mouseClickH7(MouseEvent actionEvent) {
//  System.out.println(squareH7.toString());
// }
 @FXML
 public void onMouseDragReleased() {
  draggableMarker.makeDraggable(whitePawnH);
  System.out.println("U drag the pawn");
 }
}
