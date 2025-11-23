
class Insertion_sort{

public void insertion_Sort(int arr[]){

 for(int i=1 ;i<arr.length;i++){
    int current = arr[i];
    int previous = i-1;
    while(previous>=0 && arr[previous]>current){
        arr[previous+1]=arr[previous];
        previous--;
    }
    arr[previous+1]=current;

}

for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}



}


public static void main(String[] args){

    Insertion_sort I =new Insertion_sort();
    int [] arr={2,6,4,8,1,9};
    System.out.println("the sorted array is ");
    I.insertion_Sort(arr);
}


}