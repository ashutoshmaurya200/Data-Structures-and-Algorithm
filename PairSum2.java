
class Main {
    public static void pairSum(int arr[] ,int key){
        // for(int i=0;i<arr.length;i++){
        //     for(int j=1 ;j<arr.length;j++){
        //         if((arr[i]+arr[j])==key){
        //             System.out.println(arr[i]+" "+arr[j]);
                   
        //         }
            // }
            
            // more efficient appoarch using two pointer 

            // works only on sorted array;
            
            int start=0;
            int end = arr.length-1;
          while(start < end){
                if(arr[start]+arr[end]>key){
                    end--;
                }
                else if(arr[start]+arr[end]<key){
                    start++;
                }
                else if ((arr[start]+arr[end])==key){
                    System.out.println(arr[start]+" "+arr[end]);
                    start++;
                    end--;
                }
            }
            
        }
    
    
    
    public static void main(String[] args) {
        int [] arr={2,4,5,6,7,8,9,11};
        int key =11;
        pairSum(arr,key);
        
       
    }
}