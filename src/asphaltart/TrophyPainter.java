package asphaltart;
import org.code.neighborhood.*;

public class TrophyPainter extends MuralPainter {

    public TrophyPainter (){


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