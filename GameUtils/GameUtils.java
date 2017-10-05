package GameUtils;

import java.util.Random;

public class GameUtils {
int range;
Random r=new Random();
public GameUtils(int range)
{
	this.range=range;
	r=new Random(range);
	
}
public int getRandomNumber()
{
	
	return r.nextInt(this.range);
}

}
