package term_2.set_11_linked_list.bouncy_ball;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

class Ball {
    int x = 0;
    int y = 0; // Current ball position
    int dx = 2; // Increment on ball's x-coordinate
    int dy = 2; // Increment on ball's y-coordinate
    int radius = 15; // Ball radius
    Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));


    public Ball checkForCollision(ArrayList<Ball> balls) {
        for (int i = balls.size() - 1; i >= 0; i--) {
            Ball ball = balls.get(i);
            if(ball == this){
                return null;
            }
            int distSq = (ball.x - this.x) * (ball.x - this.x) + (ball.y - this.y) * (ball.y - this.y);
            int radSumSq = (ball.radius + this.radius) * (ball.radius + this.radius);

            if (radSumSq >= distSq) {
                this.radius += ball.radius;
                return ball;
            }
        }
        return null;
    }

    public boolean checkIfIn(int x, int y, int r) {
        int distSq = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        int radSumSq = (r + this.radius) * (r + this.radius);

        return radSumSq >= distSq;
    }
}