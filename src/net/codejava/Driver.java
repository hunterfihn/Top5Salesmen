package net.codejava;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		//Creating the ArrayList and instances of class salesmen
		ArrayList<Salesmen> list = new ArrayList<Salesmen>();
		Salesmen s1 = new Salesmen("John" , 15);
		Salesmen s2 = new Salesmen("Ryan" , 43);
		Salesmen s3 = new Salesmen("George" , 25);
		Salesmen s4 = new Salesmen("Steve" , 32);
		Salesmen s5 = new Salesmen("Alex" , 12);
		Salesmen s6 = new Salesmen("Rick" , 8);
		Salesmen s7 = new Salesmen("Jake" , 22);
		Salesmen s8 = new Salesmen("Calvin" , 90);
		
		
		//adding class instances to ArrayList
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8); 
		
		
		orderSalesmen(list);
		System.out.println("The Top 5 Salesmen");
		System.out.println("------------------");
		displayList(list);
		
		
		
	}
	
	
	
	
	//Function to order the ArrayList
	public static void orderSalesmen(ArrayList<Salesmen> list)
	{
		int n = list.size();
		Salesmen temp = new Salesmen("empty" , -1);
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - i- 1; j++)
			{
				if(list.get(j).getSalesTotal() < list.get(j + 1).getSalesTotal())
				{
					
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					
				}
			}
		}
		
			
	}
	
	
	//Function to display the ArrayList
	public static void displayList(ArrayList<Salesmen> input)
	{
		for(int i = 0; i < 5; i++)
		{
			System.out.println(input.get(i).getName() + " : " + input.get(i).getSalesTotal());
		}
	}

}
