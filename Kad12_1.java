/*******************************
*Ûè¼FKad12_1
*ì¬ÒF«Gó
*ì¬úF2021/06/08
********************************/

public class Kad12_1{
	enum Month{
		JANUARY, FEBRUARY, MARCH,
		APRIL, MAY, JUNE,
		JULY, AUGUST, SEPTEMBER,
		OCTOBER, NOVEMBER, DECEMBER
	}
	public static void main(String[] args){
		System.out.println("*** ñ^èðg£for¶Å\¦ ***");
		Month type= Month.JANUARY;
		int month = 1;	
		for(Month m :Month.values() ){
    		System.out.println (month + " = " + m);
   	        month++;
		}
	}
}