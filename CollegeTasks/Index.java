import java.util.Scanner;
class Index{

	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int arr[] = new int[5];
	

	int a[] = {14,15,16,17};
	for(int i=0; i<a.length;i++){

	System.out.println(a[i]);
	}
	System.out.println("Enter array values :");
		for(int i=0; i<a.length;i++){

		arr[i] = s.nextInt();

		}
		int max = 0;
		for(int i = 0; i<arr.length;i++){
		if(max<arr[i]){
		max = arr[i];
		}

		}

	System.out.println("Max value :" + max);



}

}