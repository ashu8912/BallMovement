package GameFramesAndBoard;

import javax.swing.JFrame;

import GameUtils.GameConstants;


public class Frames extends JFrame implements GameConstants {
public Frames()
{
	setSize(GAME_WIDTH, GAME_HEIGHT);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setTitle(TITLE);
	setLocationRelativeTo(null);	
	Board board=new Board();
	add(board);
	setVisible(true);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frames frames=new Frames();
	}

}
