package Enum;

import Enum.Tester.Test;

public class enum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester a= new Tester();
		//a.checkTest(Test.A);
		System.out.println();
		for(Test t:Test.values())
		{
			String enum1=t.toString()=="A" ? "yes":"no";
			System.out.println("--------------"+enum1);
			String enum2=t.toString()=="C" ? "yes":"no";
			System.out.println("---------"+enum2);
		}
	}

}
 class Tester{
	public enum Test{A, B, C}
	public static void checkTest(Test test) {
		switch(test) {
		case A:
				System.out.println(Test.A.equals(Test.B));
		case B:
				System.out.println(Test.B.equals(Test.B));
		case C:
			  System.out.println(Test.C==Test.C);
		}
	}
}
