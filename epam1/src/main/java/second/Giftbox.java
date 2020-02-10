package second;

import java.util.*;

public class Giftbox {
	
	
	public static void main(String args[])
	{
		int n,nc,ns;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of chacolates in gift items");
		nc=sc.nextInt();
		System.out.println("Enter number of sweets in gift items");
		ns=sc.nextInt();
		
		int candies=0;
		int choco=0;
		int sweets=0;
		
		int sweetlevel=10;
		
		int chocolevel=5;
		
		Chocalates[] ch=new Chocalates[nc];
		
		Sweets[] sw=new Sweets[ns];
		
		for (int i=0;i<nc;i++)
		{
			int weight=sc.nextInt();
			int sweetness=sc.nextInt();
			int cost=sc.nextInt();
			String name=sc.next();
			ch[i]=new Chocalates();
			ch[i].namethem(weight, sweetness, cost, name);
		}
		
		
		for (int i=0;i<ns;i++)
		{
			int weight=sc.nextInt();
			int sweetness=sc.nextInt();
			int cost=sc.nextInt();
			String name=sc.next();
			sw[i]=new Sweets();
			sw[i].namethem(weight, sweetness, cost, name);
		}
		
		for (int i=0;i<ns;i++)
		{
			if (sw[i].showsugar()<sweetlevel)
			{
				candies=candies+sw[i].weight;
			}
			else
			{
				sweets=sweets+sw[i].weight;
			}
		}
		
		for (int i=0;i<ns;i++)
		{
			if (ch[i].showsugar()>chocolevel)
			{
				candies=candies+sw[i].weight;;
			}
			else
			{
				choco=choco+ch[i].weight;
			}
		}
		
		
		System.out.println("Number of candies weight="+candies);
		
		System.out.println("Sweets Weight="+sweets);
		System.out.println("Chocolates weight="+choco);
		
		
		
		
	}

}
