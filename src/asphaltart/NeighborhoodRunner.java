package asphaltart;

import org.code.neighborhood.*;

public class NeighborhoodRunner {
    public static void main(String[] args) {

        TrophyPainter T = new TrophyPainter();
        //navigates to starting position and paints background.
        T.startingPosition();
        T.paintBall("black", "crimson", "white", "silver");


    }
}