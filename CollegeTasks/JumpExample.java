class JumpExample
{

	public static void main(String args[])
	{
	for (int i=1;i<=10;i++)
	{
		if(i==5)
		{
		break;
		}
	System.out.println(i);
	}
	System.out.println("The above output has come out by using break statement !");
	System.out.println("");
	for (int i=1; i<=10; i++)
	{
		if(i==5)
		{
		continue;
		}
	System.out.println(i);
	}
	System.out.println("The above output has come out by using Continue statement !");
	}
}