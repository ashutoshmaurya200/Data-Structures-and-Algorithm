public class RotateMatrix {
     public void rotateMatrix(int[][] matrix) {

        int n= matrix.length;
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
             int start=0;
             int end =n-1;


         while(start<end){
            int temp1 =matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp1;

            start++;
            end--;
            }
                       
        }


          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               System.out.println(matrix[i][j]);

            
            }
        }

    
}

public static void main(String [] args){

    RotateMatrix rm =new RotateMatrix();

     int matrix[][]= new int[4][4];
     matrix= new int[][] {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {40,56,78,2}};

    rm.rotateMatrix(matrix);

}
}

