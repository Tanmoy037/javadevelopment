public class day2 {

    public static void main(String[] args) {
        // int [] [] two_Darray = {{1,2,4,5},{5,6}};
        // int [] new_arr = new int[two_Darray.length];
        // int var = 0;
        // // int var_num = 0;
        // for (int i = 0; i < two_Darray.length; i++){
        //     for (int j = 0; j < two_Darray[i].length; j++){
                
        //         var = two_Darray[i][j] + var;
        //     }
        //     // new_arr [var_num] = var;
        //     new_arr [i] = var;
        //     // System.out.println(var);
        //     var = 0;
        //     // var_num ++;
        // }
        // for (int i = 0; i <new_arr.length; i++){
        //     System.out.println(new_arr[i]);
        // }

        // while loop 
        int i = 12; int sum = 0;
        // while (i <= 10){
        //     sum = i + sum;
        //     System.out.println(sum);
        //     i++;
        // }

        // do while loop

        do {
            sum = i + sum;
            System.out.println("The sum value of i is " + sum);
            
            i++;
        }
        while (i <= 10);
        



    }
    
}
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/?envType=daily-question&envId=2023-12-12

// class Solution {
//     public int maxProduct(int[] nums) {
//         int max_val = 0;
//         for (int i = 0; i < nums.length; i++){
//             for (int j= i + 1; j < nums.length; j++){
//                 max_val = Math.max((nums[i] - 1)*(nums [j] -1) , max_val);
//             }
        
//         }
//         return max_val;
//     }
// }

