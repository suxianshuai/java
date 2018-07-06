package hello;
class Woman extends Human
{public int  height;
public int book=3;
	Woman(int h) {
		super(h);
		// TODO Auto-generated constructor stub
		height =  h;
	}

	public Human giveBirth()
	{
		System.out.println("Given birth");
		return (new Human(20));
	}
	public void breath()
	{
		System.out.println("su...");
	}
	public int getwidth()
	{
		return super.width;
	}
	public int getHeight()
	{
		return this.height;
	}
	}