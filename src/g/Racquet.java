package g;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Racquet {
	int x = 10;
	int xa = 2;
	int y = 10;
	int ya = 0;
	private Game game;

	public Racquet(Game game) {
		this.game= game;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60)
			x = x + xa;
		if (y + ya > 0 && y + ya < game.getHeight()-60)
			y = y + ya;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, y, 60, 60);
	}

	public void keyReleased(KeyEvent e) {
		xa = 2;
		ya = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -2;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 2;
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
			ya = -1;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			ya = 1;
		if (e.getKeyCode() == KeyEvent.VK_A)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_D)
			xa = 1;
		
		if (e.getKeyCode() == KeyEvent.VK_W)
			ya = -1;
		if (e.getKeyCode() == KeyEvent.VK_S)
			ya = 1;
	}
}