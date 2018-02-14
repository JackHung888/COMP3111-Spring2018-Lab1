package labs.comp3111.ust.hk;

public class Lab1Activity {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		//Set variables max and min
		int max=0, min=0;
		
		//Use a For Loop
		for(int i = 0; i < 10; i++) {
			//Find the max and min
			if(i == 0) {
				max = arr[i];
				min = arr[i];
			}
			else {
				if(max < arr[i])
					max = arr[i];
				
				if(min > arr[i])
					min = arr[i];
			}
		
			//Calculate the sum
			sum = sum + arr[i];	
		}
		
		//Output
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println("Min = " + min + "; " + "Max = " + max);
	}
}
