/*******************************
*�ۑ薼�FKad07_1
*�쐬�ҁF���G��
*�쐬���F2021/05/18
********************************/
import java.util.Scanner;

public class Kad07_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int oddSum = 0;	//����v
		int evenSum = 0;	//�������v
		System.out.println("1~100�̊���v�Ƌ������v�����߂܂��B");
		//i��1����100�����̊�2��������
		for(int i = 1; i < 100; i += 2){
			oddSum +=i;
			evenSum +=i+1;
		}
		System.out.println("����v�F"+oddSum);
		System.out.println("�������v�F"+evenSum);	
	}		
}
