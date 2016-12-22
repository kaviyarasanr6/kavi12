package com;

public class Subset {
	public static void main(String[] args) {
		int a[]=new int[]{1,2};
		int b[]=new int[]{2,1};
		int c[]=new int[a.length];int count=0;
		String s[]=new String[a.length];
		String s1[]=new String[a.length];
		
		int l=0;
		if(a.length==b.length){
		for(int i=a.length-1;i>=0;i--){
			c[l]=a[i];
			l++;
		}
		for(int i=0;i<a.length;i++){
			s[i]=""+c[i];
			s1[i]=""+c[i];
		}
		if(s.equals(s1)){
			System.out.println("it is subset");
		}
		for(int i=0;i<s.length;i++){
			if(s[i].equals(s1[i])){
				 count = 0;
			}
			else
				count++;
		}
		if(count==0){
			System.out.println("subset");
		}
		else
		{
			System.out.println("not subset");
		}
	}
	}
}
