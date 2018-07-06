package Collection;
interface Cup
{
	void addwater(int w);
	void drinkwater(int w);
}
interface Musicplay
{
	void play();
	}
interface MetricCup extends Cup
{
	int WaterContent();
	
	  }
interface MusicCup extends Cup,Musicplay
{
	void display();
	}
public class Mucup implements Cup,Musicplay {
	 private int water = 0;
	 public void addwater(int w)
	 {
		 this.water+=w;
		 
	 }
	public void drinkwater(int w)
	{
		this.water-=w;
	}
	public void play()
	{
		System.out.println("la...la...la");
	}
	public int content()
	{
		return this.water;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
    Mucup c = new Mucup();
    c.addwater(5);
    c.drinkwater(2);
    System.out.println(c.content());
	}*/

    
}

