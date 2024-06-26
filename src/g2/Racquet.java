package g2;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Racquet {
	int x = 0;
	int xa = 0;
	int y = 0;
	int ya = 0;
	private Game game;

	public Racquet(Game game) {
		this.game= game;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60)
			x = x + xa;
		if (y + ya > 0 && y + ya < game.getWidth()-60)
			y = y + ya;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, y, 60, 10);
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
		ya = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
			ya = -1;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			ya = 1;
	}
}