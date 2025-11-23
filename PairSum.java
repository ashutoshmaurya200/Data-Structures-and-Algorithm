class PairSum {
    public static void pairSum(int arr[] ,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=1 ;j<arr.length;j++){
                if((arr[i]+arr[j])==key){
                    System.out.println(arr[i]+" "+arr[j]);
                   
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int [] arr={2,7,11,15,5,6,4};
        int key =11;
        pairSum(arr,key);
        
        System.out.println("Try programiz.pro");
    }
}