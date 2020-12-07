package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		/*
		for(int i=0;i<numLine.length();i++) {
			if(i==0) {
				int endIndex=0;
				for(int j=0;j<numLine.length();j++) {
					if(numLine.charAt(j)==' ') {
						endIndex = j;
						break;
					}
				}
				sum += Integer.parseInt(numLine.substring(0, endIndex));
			}else {
				if(numLine.charAt(i)==' ') {
					int endIndex=0;
					for(int j=i+1;j<numLine.length();j++) {
						if(j==numLine.length()-1) {
							for(int k=numLine.length()-1; k>0;k--) {
								if(numLine.charAt(k)==' ') {
									sum += Integer.parseInt(numLine.substring(k+1, numLine.length()));
									break;
								}
							}
						}else{ 
							if(numLine.charAt(j)==' ') {
								endIndex = j;
								sum += Integer.parseInt(numLine.substring(i+1, endIndex));
								break;
							}
						}
					}
				}
			}
		}*/
		//일일히 만든 것 복잡함 공백으로 구분하는 것 만듬
		//쓸모없이 고생만 함...
		//손쉽게는 밑에 것으로 split이면 몇줄 이내로 끝남
		
		String[] num = numLine.split(" ");
		for(int i=0;i<num.length;i++) {
			sum += Integer.parseInt(num[i]);
		}
		
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
