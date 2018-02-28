package com.sankalp.mergesort;

public class MergeSort {

	public void mergeSort(int a[], int low, int high) {
		int mid;
		if(low < high) {
			mid = (low + high)/2;
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			merge(a, low, mid, high);
		}
	}
	
	public void merge(int a[], int l, int m, int h) {
		int i = l, k = m+1, x, j = l;
		int b[] = new int[h+1];
		
		while((i<=m) && (k<=h)) {
			if(a[i] <= a[k]) 
				b[j++] = a[i++];
				
			else 
				b[j++] = a[k++];
	
		}

		if( i > m ) {
			for(x=k; x<=h; x++) 
				b[j++] = a[x];
		}
		else {
			for( x=i; x<=m; x++) {
				b[j++] = a[x];
				
			}
			
			for(i=l; i<=h; i++) {
				a[i] = b[i];
			}
		}
		
	}

	
	public void display(int high, int a[], long timeDiff) {
//		System.out.println("The Sorted Array is ");
//		for(int c=0; c<high; c++) {
//			System.out.println(a[c] + " "); 
//		}
		System.out.println("Time in Lakh nanoseconds : " + timeDiff/100000);
	}

}


