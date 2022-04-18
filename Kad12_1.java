/*******************************
*課題名：Kad12_1
*作成者：劉宥希
*作成日：2021/06/08
********************************/

public class Kad12_1{
	enum Month{
		JANUARY, FEBRUARY, MARCH,
		APRIL, MAY, JUNE,
		JULY, AUGUST, SEPTEMBER,
		OCTOBER, NOVEMBER, DECEMBER
	}
	public static void main(String[] args){
		System.out.println("*** 列挙型定数を拡張for文で表示 ***");
		Month type= Month.JANUARY;
		int month = 1;	
		for(Month m :Month.values() ){
    		System.out.println (month + "月 = " + m);
   	        month++;
		}
	}
}