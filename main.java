package question6;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[]array={3,7,1,9,4};
		Scanner scanner=new Scanner(System.in);
		System.out.println("delete which position: ");
		int[]position=scanner.nextInt();
		int[]aaa=deleteelement(array,3);
		System.out.println(Arrays.toString(aaa));
		
	}
	public static int[]deleteelement(int array[],int position){
		int[]newarr=new int [array.length+1];
		if(position!>=array.length,position!>0) {
			for(int i=0;i<position;i++) {
				newarr[i]=array[i];
			}
			for(int i=position;i<array.length;i++) {
				newarr[i]=array[i+1];
			}
			return newarr;
		}
		else {
			System.out.println("invalid index");
		}
		
		
	}

}
