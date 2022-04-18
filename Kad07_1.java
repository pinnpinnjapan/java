/*******************************
*課題名：Kad07_1
*作成者：劉宥希
*作成日：2021/05/18
********************************/
import java.util.Scanner;

public class Kad07_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int oddSum = 0;	//奇数合計
		int evenSum = 0;	//偶数合計
		System.out.println("1~100の奇数合計と偶数合計を求めます。");
		//iが1から100未満の間2ずつ増える
		for(int i = 1; i < 100; i += 2){
			oddSum +=i;
			evenSum +=i+1;
		}
		System.out.println("奇数合計："+oddSum);
		System.out.println("偶数合計："+evenSum);	
	}		
}
