package day28_forEachLoop;

public class C1_ForEachLoop {

	public static void main(String[] args) {

// bir arrayin tum elemanlarini for loop ile yazdiralim

		int arr[] = {2,4,6,8,10};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		
		for (int each : arr) {
			System.out.print(each + " ");
			
		}
		
		
	}

}
