package question5;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Length: ");
		int length=scanner.nextInt();
		System.out.println("array: ");
		int[]array=new int[length];
		for(int i=0;i<length;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("element: ");
		int element=scanner.nextInt();
		mergesort(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

	private static void mergesort(int[] array) {
		if(array.length<=1)return;
		int middle=array.length/2;
		int[]leftarray=new int[middle];
		int []rightarray=new int[array.length-middle];
		for(int i=0;i<array.length;i++) {
			if(i<middle) {
				leftarray[i]=array[i];
			}
			else {
				rightarray[i]=array[i];
				i++;
			}
			
		}
		mergesort(leftarray);
		mergesort(rightarray);
		merge(leftarray,rightarray,array);
		
	}

	private static void merge(int[] leftarray, int[] rightarray, int[] array) {
		int leftsize=array.length/2;
		int rightsize=array.length-leftsize;
		int i=0,l=0,r=0;
		while (l<leftsize&&r<rightsize) {
			if(leftarray[l]<rightarray[r]) {
				array[i]=leftarray[l];
				i++;
				l++;
			}
			else {
				array[i]=rightarray[r];
				i++;
				r++;
			}
		}
		while(l<leftsize) {
			array[i]=leftarray[l];
			i++;
			l++;
		}
		while(r<rightsize) {
			array[i]=rightarray[l];
			i++;
			r++;
		}
	}
}		
