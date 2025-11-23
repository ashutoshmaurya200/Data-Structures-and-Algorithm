class BubbleSort {

    public void bubbleSort(int []arr){

        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
       
        for(int a:arr){
            System.out.println(a);
        }

    }

    public static void main(String[] args){
    BubbleSort b=new BubbleSort();

    int [] arr= new int[] {5,2,9,1,5};
    int [] arr1= new int[] {-10 ,-3, 8, 4 ,2 ,7};
    b.bubbleSort(arr);
     System.out.println("-----------------------------------");
    b.bubbleSort(arr1);
    
}

    
}

