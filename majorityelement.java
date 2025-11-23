class Solution{
    
    public int majorityElement(int[] nums) {

        // this is the brute force approach 

    //     int count=0;
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(nums[i]==nums[j]){
    //                 count++;
    //             }
               
    //         }
    //          if(count>Math.ceil(n/2)){
    //               return nums[i];
    //             }
    //     }
    //    return -1; 


//     int count =0;
//     int n=nums.length;
//     Arrays.sort(nums);
//     for(int i=0;i<n;i++){
//         if(nums[i]==nums[i+1]){
//             count++;
//         }
//         else{
//             count=0;
//         }
//         if(count>n/2){
//              return nums[i];
//         }
//         return nums[i];
//     }



// return 0;

// moore's algorithm

int count=0;
int ans=0;
int n=nums.length;

for(int i=0;i<n;i++){
    if(count ==0){
        ans=nums[i];
    }
    if(ans==nums[i]){
        count++;
    }
    else{
        count--;
    }
}
return ans;




}
    
}
