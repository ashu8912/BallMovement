package GameFramesAndBoard;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.Timer;

import GameUtils.GameConstants;
import GameUtils.GameUtils;

public class Board extends JPanel implements GameConstants {
	GameUtils gameutils=new GameUtils(20);
	public Board()
	{
		setBackground(Color.yellow);
           gameLoop();	
	}
 int xspeed=20;
 int yspeed=10;
	private Timer timer;
	private int x=100;
	private int y=50;
	public void gameLoop()
	{
		timer=new Timer(Game_Speed,(e)->{
			repaint();
	        move();
	        changeDirection();
		});
	timer.start();
	}

		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
		
		g.setColor(Color.BLUE);
	    //g.fillRoundRect(40, 60, 80,90, 10, 5);
	    //g.setColor(Color.red);
		
	    g.fillOval(x, y, 30,30);
	    //System.out.println("x is "+x+"y is"+y);
	    
		}
public void move()
{
	x+=xspeed;
	y+=yspeed;
}
public void changeDirection()
{if(x>=GAME_WIDTH-40)
xspeed=-gameutils.getRandomNumber();
if(x<=0)
	xspeed=gameutils.getRandomNumber();
if(y>=GAME_HEIGHT-50)
	yspeed=-gameutils.getRandomNumber();
if(y<=0)
	yspeed=gameutils.getRandomNumber();
}

}
