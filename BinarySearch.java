public class BinarySearch{

    public int binarySearch(int arr[],int key){
        int start =0;
        int end = arr.length -1;

        while(start<=end){
            int mid =(start+end)/2;


            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;

            }
            else {
                start =mid -1;
            }
        }
        return -1;
    }

    public static void main(String []args ){
    BinarySearch b1=new BinarySearch();
    int [] arr={34,56,76,89,99,100};
    int key = 34;
     
     int result = b1.binarySearch(arr,key);
     if(result== -1){
        System.out.println("element not found");
     }
     else{
          System.out.println("element found "+ arr[result]);
     }

     
}
}

