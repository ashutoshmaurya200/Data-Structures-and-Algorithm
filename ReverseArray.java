public class ReverseArray {
    public void reverseArray(int [] arr){

        int n=arr.length;
        int start =0;
        int end =n-1;
        while(start<=end){
            int temp =arr[start];
            arr[start] =arr[end];
            arr[end]= temp;

            start ++;
            end --;


        }

        for(int a: arr){
            System.out.println(a);
        }

    } 


    public static void main(String [] args){
        ReverseArray rv=new ReverseArray();
        int [] arr = new int[]{1, 2, 3, 4, 5};

        rv.reverseArray(arr);
    }
}
