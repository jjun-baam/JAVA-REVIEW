package ch16;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1~12를 입력하세요 : ");
		int month = scanner.nextInt();
		int day = switch(month){
					case 1,3,5,7,8,10,12->
						31;
					case 2-> 
						28;	
					case 4,6,9,11-> 
						30;		
					default-> {
						System.out.println("존재하지 않는 달입니다.");
						yield -1;
					}	
		};
		
		if( (1 <= month) && (month <= 12) ) {
			System.out.println(month + "월은 " + day + "일까지 있습니다." );	
		}
		
	}

}
