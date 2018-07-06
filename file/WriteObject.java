package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class Teacher implements java.io.Serializable
{
	private String name;
	private Person student;
	public Teacher(String name,Person student)
	{
		this.name=name;
		this.student=student;
	}
	public Person getStudent()
	{
		return this.student;
	}
	}
class Person implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	public String getname()
	{
		return this.name;
		
	}
	public int getage()
	{
		return this.age;
		
	}
}

public class WriteObject {
	

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\su\\eclipse-workspace\\java\\src\\file\\object.txt")))
		{
			Person per = new Person("su",24);
			Teacher t1 = new Teacher("ÌÆÉ®",per);
			Teacher t2 = new Teacher("ÆÐÌá×æÊ¦",per);
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
			Teacher t11=(Teacher)ois.readObject();
			Teacher t22=(Teacher)ois.readObject();
			Person p =(Person)ois.readObject();
			Teacher t33=(Teacher)ois.readObject();
			System.out.println(p.getname());
			System.out.println(t11.getStudent()==p);
			System.out.println(t22.getStudent()==p);
			System.out.println(t22==t33);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		}

	}


