package term_2.set_07_fractals;

import java.awt.*;

import javax.swing.JPanel;

public class SierpinskiTrianglePanel extends JPanel {
		private int order = 0;

		public void setOrder(int order) {
			this.order = order;
			repaint();
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Point p1 = new Point(getWidth() / 2, 10);
			Point p2 = new Point(10, getHeight() - 10);
			Point p3 = new Point(getWidth() - 10, getHeight() - 10);
			displayTriangles(g, order, p1, p2, p3);
		}

		private static void displayTriangles(Graphics g, int order, Point p1, Point p2, Point p3) {
			if (order == 0) {
				g.drawLine(p1.x, p1.y, p2.x, p2.y);
				g.drawLine(p1.x, p1.y, p3.x, p3.y);
				g.drawLine(p2.x, p2.y, p3.x, p3.y);

				g.setColor(new Color((int)(Math.random() * 0xFFFFFF)));

				g.fillPolygon(new int[]{p1.x, p2.x, p3.x}, new int[]{p1.y, p2.y, p3.y}, 3);
			} else {
				Point p12 = midpoint(p1, p2);
				Point p23 = midpoint(p2, p3);
				Point p31 = midpoint(p3, p1);

				displayTriangles(g, order - 1, p1, p12, p31);
				displayTriangles(g, order - 1, p12, p2, p23);
				displayTriangles(g, order - 1, p31, p23, p3);
			}
		}

		private static Point midpoint(Point p1, Point p2) {
			return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
		}
	}