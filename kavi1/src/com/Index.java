package com;

import java.util.Scanner;

public class Index {
	public static void main(String ar[])throws Exception
	{
	int n,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int arr[]=new int[n];
	for(i=0;i<n;i++)
	arr[i]=sc.nextInt();
	for(i=0;i<n;i++)
	{
	if(arr[i]==i)
	System.out.println("the number"+arr[i]+"is equals to it index"+i);
	}
	}
}
