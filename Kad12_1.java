/*******************************
*�ۑ薼�FKad12_1
*�쐬�ҁF���G��
*�쐬���F2021/06/08
********************************/

public class Kad12_1{
	enum Month{
		JANUARY, FEBRUARY, MARCH,
		APRIL, MAY, JUNE,
		JULY, AUGUST, SEPTEMBER,
		OCTOBER, NOVEMBER, DECEMBER
	}
	public static void main(String[] args){
		System.out.println("*** �񋓌^�萔���g��for���ŕ\�� ***");
		Month type= Month.JANUARY;
		int month = 1;	
		for(Month m :Month.values() ){
    		System.out.println (month + "�� = " + m);
   	        month++;
		}
	}
}