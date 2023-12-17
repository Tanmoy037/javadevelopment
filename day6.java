// Check two array using a method where it will compare and return boolen value.
public class day6 {
    public static void main(String[] args) {
        Arrayckecker chek_arr = new Arrayckecker();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        boolean chekArrOutput = chek_arr.arrayChecker(arr1,arr2);
        System.out.println(chekArrOutput);
        
    }
}

class  Arrayckecker {
    public boolean arrayChecker(int []arr1 , int []arr2){
        if (arr1.length != arr2.length){
            return false;

        } 
        for (int i=0; i<arr1.length ; i++){
            if (arr1[i] != arr2[i]){
                return false;
            } 

        }
        return true;


        
    }

    
}
