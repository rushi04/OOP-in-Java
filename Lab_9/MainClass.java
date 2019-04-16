
import java.util.*;
public class MainClass {

	public static void main(String args[])
	{	
		
		Scanner input = new Scanner(System.in);
		boolean f=true;
		while(f)
		{
			System.out.println("Enter 1 for Decoy Duck");
			System.out.println("Enter 2 for Mallard Duck");
			System.out.println("Enter 3 for Red Head Duck");
			System.out.println("Enter 4 for Rubber Duck");
			System.out.println("Enter 5 to exit\n");
			System.out.println("Enter your choice\n");
			int a=input.nextInt();
			Duck d;
			switch(a)
			{
			case 1:  d=new DecoyDuck();
			         d.display();
			         break;
			
			case 2:  d=new MallardDuck();
					 d.display();
					 break;
					 
			case 3:  d=new RedHeadDuck();
			         d.display();
					 break;
			case 4:  d=new RubberDuck();
					 d.display();
					 break;
					 
			case 5: f=false;
					break;
		}
	}
}
}
