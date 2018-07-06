package composition;

import composition.Battry.Torch;
public class Test3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		 Torch aTorch = new Torch();
//		 System.out.println("Charge: 2 hours");
//	     aTorch.charge(2);
//	     System.out.println("First Turn On: 3 hours");
//	     aTorch.turnon(3);
//	     System.out.println("Second Turn On: 3 hours");
//	     aTorch.turnon(3);
       Battry bat = new Battry();
       bat.chargBattry(0.5);
       bat.useBattery(-0.5);
       }

}
