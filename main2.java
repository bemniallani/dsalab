package question02;

public class main2 {
	int maxsize;
	int []array;
	int top;
	public main(int size) {
		maxsize=size;
		int[] array=new int[maxsize];
		top=-1;
	}
	public boolean isempty() {
		if(top==maxsize-1)
		return false;
	}
	public void push(int value) {
		if(maxsize>top)
			array[++top]=value;
	
	}
	public int pop() {
		if(top!=-1) {
			int element=array[top--];	
		}
		else 
			return -1;
	}
	public int peek() {
		if(top!=-1) {
			return-1;
		}
		else 
			return array[top];
	}

	public static void main(String[] args) {
		

	}

}

