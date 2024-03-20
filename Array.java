package day1;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	
		int i;
		int j;
		int temp;
		System.out.println("enter the size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter values:");
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for (i=0;i<size;i++) {
			System.out.println(arr[i]+"");
			
		}
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				if(arr[j]<arr[i]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("sorted array is:");
		for(i=0;i<size;i++) {
			System.out.println(arr[i]);
			
		}
	
		
	}

}
