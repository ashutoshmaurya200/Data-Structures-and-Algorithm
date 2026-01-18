public class SelectionSort {

    public void selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            int temp =arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }

        for(int i:arr){
            System.out.println(i);
        }

    }

     public static void main(String[] args){
    SelectionSort s=new SelectionSort();

    int [] arr= new int[] {5,2,9,1,5};
    s.selectionSort(arr);
   
   
    
}
    
}
