package com.sankalp.mergesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MergeSort m = new MergeSort();
     	long start, end;
		
		int n = 300000;

		while(true) {
			int a[] = new int[n];
			System.out.println("1 - Best Case");
			System.out.println("2 - Worst Case");
			System.out.println("3 - Average Case");
			System.out.println("4 - Exit");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1: 
				
				for(int i=0; i<n; i++) {
					a[i] = i;
				}
			   
				start = System.nanoTime();
				m.mergeSort(a, 0, n-1);
				end = System.nanoTime();
				m.display(n, a, (end-start));
				break;
				
			case 2:

				for(int i=0; i<n; i++) {
					a[i] = n-i;
				}
				start = System.nanoTime();

				m.mergeSort(a, 0, n-1);
				end = System.nanoTime();
				m.display(n, a, (end-start));
				break;
				
			case 3: 
				
				Random random = new Random();
				for(int i=0; i<n; i++) {
					a[i] = random.nextInt();
				}
				
				start = System.nanoTime();
				m.mergeSort(a, 0, n-1);
				end = System.nanoTime();
				m.display(n, a, (end-start));
				break;
				
			case 4: 
				System.exit(0);
			}
			
		}
	}

}
