package kr.ac.jejunu;

import java.util.Scanner;

/**
 * Created by blue on 2017-03-23.
 */
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("첫번째 숫자");
        int a = sc.nextInt();

        System.out.println("두번째 숫자");
        int b = sc.nextInt();

        System.out.println("기능선택");

        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 나누기");
        System.out.println("4. 곱하기");
        System.out.println("5. 나머지");
        int c = sc.nextInt();


        switch (c) {
            case 1 :
                System.out.println("더하기 : "+ (a+b));
                break;
            case 2:System.out.println("빼기 : " + (a-b));
                break;
            case 3:System.out.println("나누기 : " + ((float)a/(float)b));
                break;
            case 4:System.out.println("곱하기 : " + (a*b));
                break;
            case 5:System.out.println("나머지 : " + (a%b));
                break;

                default:System.out.println("잘못된 선택");
                    break;
        }
    }
}
