package com;

import java.util.Scanner;

public class Uniqeinteger {
	 public static void main(String arg[]){

	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        int num = arr[0];
	        int count;
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        for (int i = 0; i < n; i++) {
	            count = 0;
	            for(int j = 0; j < n; j++) {
	                if(arr[i] == arr[j])
	                    count++;
	            }
	            if(count == 1) {
	                num = arr[i];
	                break;
	            }
	        }
	        System.out.print(num);
	    }
}
