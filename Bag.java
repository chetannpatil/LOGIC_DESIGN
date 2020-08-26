package batch81lab;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.rtf.RTFEditorKit;

/*
There are Bags. Bags have a name and hold a number of Items. 
You can add/retrieve items from the bag. An item has a name and a price. 
Caps, notebooks, pens, lipstick are all items. 
A bag can be used to search/remove a given item.
You can request the bag to give you the total of prices of all the items in the bag.
Write a tester class to test creation of bags, items, then store items in the bags and 
invoke the various api methods of bag to test how to search, retrieve, get total,
get individual price of items.*/
class Item
{
	String name ;
	double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

	public boolean equals(Item i) 
	{
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(i.name.equalsIgnoreCase(this.name) == true )
			return true ;
		else
			return false ;
	}
	
	
	
}
class Cap extends Item
{
	
}
class NoteBook extends Item
{
	
}
class LipStick extends Item
{
	
}
public class Bag
{
	String name;
	Collection<Item> itemsColl = new ArrayList<Item>();
	void search(Item i)
	{
		if(this.itemsColl != null)
		{
			for(Item it :itemsColl)
			{
				if( it.name.equalsIgnoreCase(i.name.trim()) == true)
				{
					System.out.println("yes "+i.name+" exists in bag & its details are ");	
					System.out.println(it);
				}
					
			}
		}
	}
	
	void remove(Item i)
	{
		if(this.itemsColl != null)
		{
			
		}
	}
	
	
	double getCostOfBag()
	{
		double cost =0 ;
		if(this.itemsColl != null)
		{
			for(Item i:itemsColl)
			{
				cost = cost + i.price ;
			}
		}
		
		return cost ;
	}
	
	public boolean addItem(Item i)
	{
		if(i != null)
		{
			if(this.itemsColl.add(i) == true )
				return true ;
			else
				return false ;
		}
		return false ;
	}
	
	@Override
	public String toString() {
		return "Bag [name=" + name + ", itemsColl=" + itemsColl + "]";
	}

	void displayAllItem()
	{
		if(this.itemsColl != null )
		{
			for(Item i:itemsColl)
			{
				System.out.println(i.name+" = "+i.price);
			}
		}
	}
	public static void main(String ... a)
	{
		Bag b1 =new Bag();
		Item i1 =new LipStick() ;
		i1.name ="x lipsticks";
		
		i1.price = 55.75;
		Item i2 = new Cap();
		i2.name ="nike";
		i2.price = 400;
		Item i3 = new NoteBook();
		i3.price = 85;
		i3.name ="camle";
		
		b1.addItem(i1);
		b1.addItem(i2);
		b1.addItem(i3);
		System.out.println("total price = "+b1.getCostOfBag());
		
		System.out.println("search item lipstic x lipstics");
		b1.search(i1);
		System.out.println("removing noteboook ");
		b1.remove(i3);
		System.out.println("aftr remal of ntbook the bag contains ");
		b1.displayAllItem();
		
		
	}
}