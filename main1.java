package question01;
import java.util.Scanner;

public class main1 {

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
		
		int count=0;
		for(int j=0;j<length;j++);{
			if(array[element]==element) {
				count++;
			}
		}
		System.out.println(element+" "+ count);
		scanner.close();

	}

}
