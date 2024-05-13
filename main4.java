package question4;

public class main4 {

	public static void main(String[] args) {
		char[]array= {'a','s','c','i','i'};
		bubblesort(char array);
		
		for(char i: array) {
			System.out.println(i);
		}
		
	}

	private static void bubblesort(char[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
			
		}
		
	}

}

