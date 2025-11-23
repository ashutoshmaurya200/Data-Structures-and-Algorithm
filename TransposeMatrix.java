public class TransposeMatrix {

    public void transposeMatrix(int matrix1[][]){
        int n=matrix1.length;
       

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp =matrix1[i][j];
                matrix1[i][j]=matrix1[j][i];
                matrix1[j][i]=temp;

            
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.println(matrix1[i][j]);

            
            }
        }

    }
     public static void main(String[] args){
     TransposeMatrix tm=new TransposeMatrix();

     int matrix1[][]= new int[4][4];
     matrix1 = new int[][] {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {40,56,78,2}};

    tm.transposeMatrix(matrix1);


};


    


}


