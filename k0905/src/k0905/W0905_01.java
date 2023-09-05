package k0905;

import java.util.Scanner;

public class W0905_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random()*100)+1;
		int[] snum = new int[10];
		System.out.println(random);
		int i=0;
		
		while(i<10) {
			System.out.println("1부터 100 사이의 숫자를 입력하세요.>>");
			int num = scan.nextInt();
			snum[i] = num;
			if(random==num) {
				System.out.println("정답입니다.");
				break;
			}else if(random>num) {
				System.out.println("입력한 숫자보다 큰 수입니다.");
			}else {
				System.out.println("입력한 숫자보다 작은 수입니다.");
			}
			if(i==9) {
				break;
			}
			i++;
		}//while
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 입력 숫자 : %d ",i,snum[i]);			
		}
		
	}//main

}//class
