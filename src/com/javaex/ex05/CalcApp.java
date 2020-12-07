package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	String calc;
    	Scanner sc = new Scanner(System.in);
    	while(true){
    		System.out.print(">> ");
    		calc = sc.nextLine();
    		if(calc.equals("/q")) {
    			System.out.println("종료합니다.");
    			break;
    		}else {
    			String[] num = calc.split(" ");
    			try {
    				if(num[1].equals("+")) {
    					Add add = new Add();
    					add.setValue(Integer.parseInt(num[0]), Integer.parseInt(num[2]));
    					System.out.println(">> "+add.calculate());
    				}else if(num[1].equals("-")){
    					Sub sub = new Sub();
    					sub.setValue(Integer.parseInt(num[0]), Integer.parseInt(num[2]));
    					System.out.println(">> "+sub.calculate());
    				}else if(num[1].equals("*")){
    					Mul mul = new Mul();
    					mul.setValue(Integer.parseInt(num[0]), Integer.parseInt(num[2]));
    					System.out.println(">> "+mul.calculate());
    				}else if(num[1].equals("/")){
    					if(Integer.parseInt(num[2])!=0){
    						Div div = new Div();
    						div.setValue(Integer.parseInt(num[0]), Integer.parseInt(num[2]));
    						System.out.println(">> "+div.calculate());
    					}else {
    						System.out.println("0으로 나눌 수 없습니다.");
    					}
    				}else {
    					System.out.println("알 수 없는 연산자입니다.");
    				}
    			}catch(ArrayIndexOutOfBoundsException e) {
    				System.out.println("공백을 포함해서 연산자를 잘 넣어 주세요");
    			}
    		}
    		
    	}
    }
}
