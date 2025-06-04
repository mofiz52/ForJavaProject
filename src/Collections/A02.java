package Collections;
import java.util.*;
public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Amazon> amazonlist=new ArrayList<Amazon>();
		amazonlist.add(new Amazon("Yoga Mat", 43.22, 2));
		amazonlist.add(new Amazon("Samsung 55 Inch TV", 500.50, 0));
		amazonlist.add(new Amazon("Cleaning Liquid", 10.00, 9));
		for(Amazon a:amazonlist)
			a.validateQuantity();
		
	}

}

class Amazon{
	String productName;
	double price;
	int quantityRemaining;
	Amazon(String productName, double price, int quantityRemaining){
		this.productName=productName;
		this.price=price;
		this.quantityRemaining=quantityRemaining;
	}
	public void validateQuantity() {
		if (this.quantityRemaining==0) {
			System.out.println(this.productName+"  item is not available");
		}
		else if((this.quantityRemaining>=1)&&(this.quantityRemaining<=5))
			System.out.println(this.productName+"  item is running short");
		else
			System.out.println(this.productName+" item is available");
	}
}