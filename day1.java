import java.util.Scanner;
public class day1 {

    public static void main(String[] args) {

        // // variable
        // int numbers = 12;

        // // array
        // int [] num = {17, 32, 74, 90};

        // // for loop
        // int i = 0;

        // // for (; i < num.length; )
        // // {
        // //     System.out.println(num[i]);
        // //     i++;
        // // }

        // // new for loop
        // for (int nu : num) System.out.println(nu);

        // // System.out.println(numbers);
        // // System.out.println(num[0]);

        // // loop 
        // if (20 > 18) {
        //     System.out.println("20 is greater than 18");
        // }

        // // turnary operator
        // boolean bool = true;
        // System.out.println(1>2 ? "Hello World": "Bye Bye");

        // // type conversion
        // double d = 100.04;

        // long l = (long)d;

        // System.err.println(l);

        // // switch case 
        // int f = 10;
        // String var_String = "test";
        // switch (f) {
        //     case 1:
        //         System.out.println(i);

                
        //         break;
        //     case 10:
        //         System.out.println("This is the number " +  i);
        
        //     default:
        //         break;
        // }

        // // new switch case

        // String str = "";

        // str = switch (1){
        //     case 1 -> "sfa";
        //     case 2 -> "arfa";
        //     default -> "safa";


        // };

        // System.out.println(str);;

        // // 2D array

        // int [] [] two_Darray = {{1,2,3} ,{4,5,6},{7,8,9}};

        // for (int[] array: two_Darray){
        //     for (int arr: array){
        //         System.out.print(arr + " ");
        //     }
        //     System.out.println("");
        // }


        // Print week using switch case

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number");
        int day = reader.nextInt();
        reader.close();



        // int day = 5;

        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Number is out of range");

        }



        
    }


}