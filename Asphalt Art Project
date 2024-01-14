import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

 TrophyPainter T = new TrophyPainter();
    T.startingPosition();
    T.paintBall("black", "crimson", "white", "silver");

    
  }
}

import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Choice A: Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Choice B: Moves forward while a Painter object can move
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  // Choice C: Paints and moves while the Painter object has paint
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }

  // Choice D: Moves, turns, and paints in a donut shape
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
    }
  }
  
}

import org.code.neighborhood.*;

public class TrophyPainter extends MuralPainter {

public TrophyPainter (){

  
}
 
  
  public void paintBall(String black, String red, String white, String gray){
    //layer 1
    paintLine("SlateGray", 5);
    paintLine(black, 4);
    paintLine("SlateGray", 1);

    turnRight();
    move();
    turnRight();
    //layer 2
    paintLine(black, 2);
    paintLine(red, 4);
    paintLine(black, 2);
   
    turnLeft();
    move();
    turnLeft();
    //layer 3
    paintLine(black, 1);
    paintLine(red, 8);
    paintLine(black, 1);
  
    turnRight();
    move();
    turnRight();
    //layer 4
    paintLine(black, 2);
    paintLine(red, 6);
    paintLine(white, 1);
    paintLine(red, 2);
    paintLine(black, 1);
    
    turnLeft();
    move();
    turnLeft();
    move();
    //layer 5
    paintLine(black, 1);
    paintLine(red, 1);
    paintLine(white, 1);
    paintLine(red, 8);
    paintLine(black, 1);

    turnRight();
    move();
    turnRight();
    //layer 6
    paintLine(black, 1);
    paintLine(red, 12);
    paintLine(black, 1);

     turnLeft();
    move();
    turnLeft();
    move();
    //layer 7
    paintLine(black, 3);
    paintLine(red, 4);
    paintLine(black, 3);
    paintLine(red, 3);
    paintLine(black, 1);

    turnRight();
    move();
    turnRight();
    move();

    //layer 8
paintLine(black, 1);
    paintLine(red, 2);
    paintLine(black, 1);
    paintLine(white, 3);
    paintLine(black, 1);
    paintLine(red, 2);
    paintLine(black, 4);

    turnLeft();
    move();
    turnLeft();
    move();

    //layer 9
    paintLine(black, 1);
    paintLine(gray, 1);
    paintLine(white, 2);
    paintLine(black, 3);
    paintLine(white, 3);
    paintLine(black, 4);

    turnRight();
    move();
    turnRight();
    move();
    move();

    //layer 10
    paintLine(black, 1);
    paintLine(white, 1);
    paintLine(black, 1);
    paintLine(white, 3);
    paintLine(black, 2);
    paintLine(white, 3);
    paintLine(black, 1);

    turnLeft();
    move();
    turnLeft();
    move();

    //layer 11
    paintLine(black, 1);
    paintLine(gray, 1);
    paintLine(white, 4);
    paintLine(black, 3);
    paintLine(white, 2);
    paintLine(black, 1);
    
    turnRight();
    move();
    turnRight();
    move();
    move();

    //layer 12
    paintLine(black, 1);
    paintLine(white, 7);
    paintLine(gray, 1);
    paintLine(black, 1);

    turnLeft();
    move();
    turnLeft();
    move();
    move();
    

    //layer 13
    paintLine(black, 2);
    paintLine(gray, 2);
    paintLine(white, 2);
    paintLine(black, 2);

    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    
    //layer 14
    paintLine(black, 4);
  }// end paint top

  public void startingPosition(){
    paintBackground("SlateGray", 20);
    //returns to initial corner after painting background
    turnAround();
    
    while(canMove()){
      move();
    }
    turnLeft();
    while(canMove()){
      move();
    }
    //navigates to start of drawing
    turnAround();
    move();
    turnRight();
    move();
    turnLeft();
    
    
  }
  
}

import org.code.neighborhood.*;

/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class MuralPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintLine(color, size);
      turnToWest();

      if (canMove("south")) {
        paintLine(color, size);
        turnToEast();
      }
    }

    paintLine(color, size);
    turnAround();
    moveToCorner();
  }

  /*
   * Paints a line with the color where the length
   * of the line is specified by spaces
   */
  public void paintLine(String color, int spaces) {
    setPaint(spaces);

    while (hasPaint()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face west if it is currently facing east
   */
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }

  /*
   * Turns the MuralPainter to the next row to
   * face east if it is currently facing west
   */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  /*
   * Turns the MuralPainter around to face the opposite direction
   */
  public void turnAround() {
    turnLeft();
    turnLeft();
  }

  /*
   * Resets the MuralPainter object to the starting location
   */
  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }

  /*
   * Moves the MuralPainter to the bottom right corner
   */
  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
  
}
