package hello;

import java.util.Date;

class Obj implements Cloneable
{
	private int aInt=0;
	private Date birth =new Date();
	public Date getBirth()
	{
		return this.birth;
	}
	public void setBirth(Date birth)
	{
		this.birth=birth;
	}
	public void changeDate()
	{
		this.birth.setMonth(5);
	}
	public int getAInt()
	{
		return aInt;
	}
	
	public void changeInt()
	{
		this.aInt=1;
	}
	public Object clone()
	{
		Obj o =null;
		try
		{
			o=(Obj)super.clone();
			
		}catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		o.birth=(Date) this.getBirth().clone();
		return o;
	}
	
	
}
public class Clone {
	
	private int aInt=0;

	public int getAInt()
	{
		return aInt;
	}
	
	public void changeInt(int inInt)
	{
		inInt=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Obj a=new Obj();
		 Obj b=(Obj) a.clone();
		 b.changeDate();
		System.out.println(a.getBirth());
		System.out.println(b.getBirth());
	}

}
