import java.util.*;
public class day5 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the row lenght");
        int lenOfRow = scr.nextInt();
        System.out.println("Enter the column lenght");
        int lenOfColumn = scr.nextInt();
        int two_Darray[][] = new int[lenOfRow][lenOfColumn];
        int i = 0;
        while (i < lenOfRow){
            int j = 0;
            while (j < lenOfColumn) {
                System.out.println("Enter the number :");
                int input = scr.nextInt();
                two_Darray[i][j] = input;
              j++;  
            }
            i++;
        }
        i = 0;
        System.out.println("You matrix is :");        
        while (i < lenOfRow){
            int j = 0;
            while (j < lenOfColumn) {
                System.out.print( two_Darray[i][j] + " ");
                j++;
                
            }
            System.out.println(" ");
            i++;

        }
        scr.close();
    }

    
}
