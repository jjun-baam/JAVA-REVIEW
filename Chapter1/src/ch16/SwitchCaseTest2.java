package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1~12�� �Է��ϼ��� : ");
		int month = scanner.nextInt();
		int day = switch(month){
					case 1,3,5,7,8,10,12->
						31;
					case 2-> 
						28;	
					case 4,6,9,11-> 
						30;		
					default-> {
						System.out.println("�������� �ʴ� ���Դϴ�.");
						yield -1;
					}	
		};
		
		if( (1 <= month) && (month <= 12) ) {
			System.out.println(month + "���� " + day + "�ϱ��� �ֽ��ϴ�." );	
		}
		
	}

}