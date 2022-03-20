package term_2.set_12_stack_queue.bouncy_ball;

import java.awt.Color;

class Ball implements Comparable<Ball> {
	int x = 0;
	int y = 0; // Current ball position
	int dx = 2; // Increment on ball's x-coordinate
	int dy = 2; // Increment on ball's y-coordinate
	int radius = 5; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

	public Ball() {
		this.radius = (int) (Math.random() * 18) + 2;
	}

	@Override
	public int compareTo(Ball o) {
		return o.radius - this.radius;
	}
}