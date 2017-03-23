package com.jejunu;

/**
 * Created by blue on 2017-03-23.
 *
 *
 * 입력을 받지 않는 계산기 만들기
 * 소스코드 단에서 숫자 2개를 임의 지정해서 더하기 빼기 나누기 곱하기 나머지 를 구해서 출력한다.
 * 다른 문제는 신경쓰지 말고 문제해결만 해도 된다.
 *
 */
public class main {
    public static void main(String[] args){
        int a = 23;
        int b = 5;

        System.out.println("더하기 : "+ (a+b));
        System.out.println("빼기 : " + (a-b));
        System.out.println("나누기 : " + ((float)a/(float)b));
        System.out.println("곱하기 : " + (a*b));
        System.out.println("나머지 : " + (a%b));
    }
}
