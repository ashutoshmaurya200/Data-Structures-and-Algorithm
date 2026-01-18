package sorting;

public class BubbleSort {
	public void sort( int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
		
		 for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}
	

	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
		int arr[]={3,5,4,9,2,10,100,4,};
		b.sort(arr);
		
	
		
	

	}

}
