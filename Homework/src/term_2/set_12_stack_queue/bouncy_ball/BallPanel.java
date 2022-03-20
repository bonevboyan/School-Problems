package term_2.set_12_stack_queue.bouncy_ball;

import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.PriorityQueue;

import javax.swing.JPanel;

class BallPanel extends JPanel {
    private int delay = 10;
    private PriorityQueue<Ball> balls = new PriorityQueue<Ball>();
    // Create a timer with the initial delay
    protected Timer timer = new Timer(delay, new TimerListener());

    private class TimerListener implements ActionListener {
        @Override
        /** Handle the action event */
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    public BallPanel() {
        timer.start();
    }

    public void add() {
        balls.add(new Ball());
    }

    public void subtract() {
        balls.poll();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Ball ball : balls) {
            //Ball ball = (Ball) balls.get(i); // Get a ball
            g.setColor(ball.color); // Set ball color
            // Check boundaries
            if (ball.x < 0 || ball.x > getWidth())
                ball.dx = -ball.dx;
            if (ball.y < 0 || ball.y > getHeight())
                ball.dy = -ball.dy;
            // Adjust ball position
            ball.x += ball.dx;
            ball.y += ball.dy;
            g.fillOval(ball.x - ball.radius, ball.y - ball.radius, ball.radius * 2, ball.radius * 2);
        }
    }

    public void suspend() {
        timer.stop();
    }

    public void resume() {
        timer.start();
    }

    public void setDelay(int delay) {
        this.delay = delay;
        timer.setDelay(delay);
    }
}