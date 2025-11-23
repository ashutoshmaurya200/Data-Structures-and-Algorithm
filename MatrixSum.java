public class MatrixSum {

    public void matrixSum(int [][] matrix){
        int n=matrix.length;
         int colMax=0;
         int colIndex=-1;

         int rowMax=0;
         int rowIndex=-1;
       
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                sum=sum+matrix[i][j];
                if(sum>rowMax){
                    rowMax=sum;
                    rowIndex=i;
                }
               
               
            }
            
         
        }

         System.out.println(rowMax);
         System.out.println(rowIndex);
         System.out.println("_______________");

        

        for(int i=0;i<n;i++){
             int colSum=0;
            
            for(int j=0;j<n;j++){
               
                colSum=colSum+matrix[j][i];
                if(colSum>colMax){
                    colMax=colSum;
                    colIndex=i;
                }
               
            }
        }
         System.out.println(colMax);
         System.out.println(colIndex);
        }


    public static void main(String [] args){

    MatrixSum ms =new MatrixSum();

     int matrix[][]= new int[4][4];
     matrix= new int[][] {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12},
    {40,56,78,2}};

    ms.matrixSum(matrix);;

}
    
}
