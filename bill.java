import java.util.*;
import java.io.*;

class bill
{
	
	String nm;
	long mobile;
	
	int subprice;
	int[] qty=new int[10];
	int subtotal;
	double Total;
	int i=0;
	String ch;
	double tax;
	int[] select=new int[10];
	
	String[] product = {"0.Pulses","1.Wheat","2.Rice  ","3.Corn  "};
	int[] priceitem = {50,35,20,60};
	void create()
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("\n\t Enter Name: ");
		nm = s1.next();
		System.out.print("\n\t Enter Mobile No.: ");
		mobile = s1.nextLong();
		
		do 
		{
			System.out.println("\n\tProducts Available ");
			Arrays.stream(product).forEach(System.out::println);
			System.out.print("\n\tSelect Product : ");
			select[i]=s1.nextInt();
			System.out.print("\n\tEnter Quantity:");
			qty[i]=s1.nextInt();
			System.out.print("\n\tWant to add more product(yes/no):");
			ch=s1.next();
			i++;
		}while(ch.equalsIgnoreCase("yes"));
		

	}
 
    void show()
	{
		System.out.println("\n\n\t     Recipt of Bill");
		System.out.println("\n\t Name:"+nm);
		System.out.println("\n\t Mobile No.:"+mobile);
		System.out.println("\n\t Purchased Products:");
		System.out.println("\n\t Product\t\tPrice \t\tQuantity\t Total");
		for(int j=0;j<i;j++)
		{
			subprice = qty[j]*priceitem[select[j]];
			System.out.println("\n\t"+product[select[j]]+" \t\t"+priceitem[j]+" \t\t "+qty[j]+" \t\t"+subprice);
			subtotal=subtotal+subprice;
		}
		tax=subtotal * 0.05;
		Total=tax+subtotal;
		System.out.println("\n\tTax 5%");
		System.out.println("\n\tTotal Bill:"+Total);
	}
	
	public static void main( String[] args) throws IOException,ClassNotFoundException
	{
		bill b1 = new bill();
		
		b1.create();
		
		b1.show();
	
	}

}