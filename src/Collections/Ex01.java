package Collections;
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<amazonProd> aList=new ArrayList<amazonProd>();
		
		aList.add(new amazonProd("Shirt", "A Quality","X"));
		aList.add(new amazonProd("Shirt", "B Quality","XL"));
		aList.add(new amazonProd("Shorts", "D Quality","X"));
		aList.add(new amazonProd("Shirt", "A Quality","XLL"));
		aList.add(new amazonProd("Tracks", "B Quality","XLL"));
		aList.add(new amazonProd("Cap", "A Quality","X"));
		aList.add(new amazonProd("Cap", "B Quality","XL"));
		aList.add(new amazonProd("Suite", "A Quality","XL"));
		aList.add(new amazonProd("Shirt", "B Quality","X"));
		
		Set<String> dressTypes=new TreeSet<String>();
		Set<String> dressQuality=new TreeSet<String>();
		Set<String> dressSize=new TreeSet<String>();
		
		for(amazonProd s:aList) {
			dressTypes.add(s.getProdName());
			dressQuality.add(s.prodQuality);
			dressSize.add(s.prodSize);
		}
		/*
		for(amazonProd s:aList) {
			dressQuality.add(s.prodQuality);
		}
		for(amazonProd s:aList) {
			dressSize.add(s.prodSize);
		}
		*/
		System.out.println("Avaiable Dress Type");
		System.out.println("--------------------");
		for(String sr:dressTypes)
			System.out.println(sr);
		
		System.out.println("Avaiable Dress Quality");
		System.out.println("--------------------");
		for(String sr:dressQuality)
			System.out.println(sr);
		
		System.out.println("Avaiable Dress Size");
		System.out.println("--------------------");
		for(String sr:dressSize)
			System.out.println(sr);
		
		
		

	}

}
class amazonProd{
	String prodName;
	String prodQuality;
	String prodSize;
	
	amazonProd(String prodName, String prodQuality, String prodSize){
		this.prodName=prodName;
		this.prodQuality=prodQuality;
		this.prodSize=prodSize;
		
	}
	public String getProdName() {
		//System.out.println("The Product Name is :"+this.prodName);
		return this.prodName;
	}
	public String getProdQuality() {
		//System.out.println("The quality of the product is :"+
		return this.prodQuality;
		
	}
	public String getProdSize() {
		//System.out.println("The size of the product is :"+
	  return this.prodSize;
	}
}