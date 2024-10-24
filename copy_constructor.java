package Constructor;

class clg
{
	int cid;
	String cname;
	
	clg(int x,String y)
	{
		cid=x;
		cname=y;

	}
	
	clg(clg c)
	{
		cid=c.cid;
		cname=c.cname;
	}
	
	void display()
	{
		System.out.println("College id is :"+cid);
		System.out.println("College name is :"+cname);

	}
}
public class Copy_constructor 
{

	public static void main(String[] args) 
	{

		clg c1=new clg(101,"pvp");
		c1.display();
		
		clg c2=new clg(c1);
		c2.display();

		clg c3=new clg(c2);
		c3.display();


		
	}

}
