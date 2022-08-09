package a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//문제1) 수를 입력받고 입력 받은 값이 홀수인지 짝수인지 판별하시오
		
//		Scanner in= new Scanner(System.in);
//		int num = in.nextInt();
//		System.out.println(num+"을(를)입력하셧습니다");
//		if(num%2==0) {
//			System.out.println("입력한수는짝수입니다");
//		}else {
//			System.out.println("입력한수는홀수입니다");
//		}
		
//		//문제2) 배열변수5개를 선언하고 반복문을 활용하여 10,20...,50을 입력하세요
//		
//		int arr[]= new int[5];
//		
//		System.out.println("배열의길이는:"+arr.length);
//		for(int i=0; i<=arr.length; i++) {
//			System.out.println(arr[i]=(i+1)*10);	
//		}
//		
		//문제3)숫자를 입력받고 입력받은 숫자의 10자리만 표시하시오 예)87->8, 184->18
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num/10);
		
		//문제4) 1에서 100까지의 수 중 홀수, 짝수의 합을 각각 구하시오
		int hol=0; //합을 구해야하기때문에 변수를 선언해줘서 저장해놔야한다.
		int jjak=0;
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				hol+=i;
			}else {
				jjak+=i;
			}
		}
		
		//문제5)
		
//		Scanner in= new Scanner(System.in);
//		int num1 = in.nextInt();
//		int num2 = in.nextInt();
//		if(su1>su2) {
//			System.out.println();
//		}
		
		//문제6 *많이사용)
		
		Scanner in= new Scanner(System.in);
		int num1 = in.nextInt(); //초기값
		int num2 = in.nextInt(); //제어값
		
		
		//문제7)
		String hp="01044442222";
		
		//문제8)int[] su={31,44,67,11,45};
				//위 배열의 최대값과 최소값을 구하시오.
		
		int[] su = {31,44,67,11,45};
	}

}
