public class RotateArray {
    public void rotateArray(int[]arr,int k){
        int n=arr.length;

        int []nums = new int[n];

        // this method for left rotation if we want to do right rotation then other method is there
        // for(int i=0;i<k;i++){
        //     int temp=arr[0];
        //     for(int j=0;j<n-1;j++){
        //        arr[j]=arr[j+1];
        //     }
        //     arr[n-1]=temp;
        // }

         for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = arr[i];
        }

         for (int i = 0; i < n; i++) {
          arr[i]=nums[i];
         }
        for(int a: arr){
        System.out.println(a);
        }
    }


    

    public static void main(String[] args){
    RotateArray ra=new RotateArray();

    int [] arr= new int[] {5,2,9,1,5};
    int [] arr1= new int[] {10 ,3, 8, 4 ,2 ,7};
    int k=2;
    int k1 =3;
   ra.rotateArray(arr, k);
     System.out.println("-----------------------------------");
   ra.rotateArray(arr1, k1);
}
}
