package hello;
import java.util.*;
public class Human 
{  public static int population;
   public static boolean is_mammal  = true;
   public  int height;
   public  int book =6;
   protected int width;
   public static int getPopulation()
    {
	   return Human.population;
    }
   public void breath() 
	{
		System.out.println("hu...hu...hu...");
	}
    public int getHeight()
    {
	return this.height ;
    }
    public void growHeight(int n)
    {
	this.height+=n;
    }
   private void repeatBreath(int rep)
   {
	for(int i = 0;i<rep;i++)
		this.breath();
   }
   Human(int h)
   {
	   this.height  = h;
	   this.width = h/2;
	   System.out.println("I'm born");
	   Human.population+=1;
   }
   Human(int h,String s)
   {
	   this.height = h;
	   System.out.println("Ne zha:I'm born,"+s);
	   Human.population+=1;
   }
  void drink(Cup aCup,int w)
  {
	  aCup.drinkWater(w);
  }
  
  
}
