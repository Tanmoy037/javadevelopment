public class day2 {

    public static void main(String[] args) {
        int [] [] two_Darray = {{1,2,4,5},{5,6}};
        int [] new_arr = new int[two_Darray.length];
        int var = 0;
        // int var_num = 0;
        for (int i = 0; i < two_Darray.length; i++){
            for (int j = 0; j < two_Darray[i].length; j++){
                
                var = two_Darray[i][j] + var;
            }
            // new_arr [var_num] = var;
            new_arr [i] = var;
            // System.out.println(var);
            var = 0;
            // var_num ++;
        }
        for (int i = 0; i <new_arr.length; i++){
            System.out.println(new_arr[i]);
        }



    }
    
}
