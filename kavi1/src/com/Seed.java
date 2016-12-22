package com;

import java.util.Scanner;

public class Seed {
	public static void main(String args[]){
		System.out.println("Enter the Integer Number:");
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int mod=0;
		int rem=1;
		int temp=num;
		while(num!=0){
			mod=num%10;
			rem=rem*mod;
			num=num/10;}
		int result=temp*rem;
		System.out.println(+temp +"is a seed of "+result);
			}
	}


