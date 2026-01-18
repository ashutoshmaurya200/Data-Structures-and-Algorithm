// Given an integer array nums, return the number of subarrays of length 3 such that the sum of the first and third numbers equals exactly half of the second number.





public class CountSubarray{
   



     public static int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+nums[i+2]==(nums[i+1]/2.0)){
                count++;
            }
        }

        return count;
        
    }

    public static void main(String []args){
    
        int arr1[] =new int[]{-1,-4,-1,4};
        int arr2[]=new int []{-1,-2,0};



        System.out.println(countSubarrays(arr2));
        System.out.println("----------");
        System.out.println(countSubarrays(arr1));

       


    }
    
}
