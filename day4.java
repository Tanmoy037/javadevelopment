public class day4 {
    public static void main(String[] args) {
        // Innerday4 star_printer= new Innerday4();
        // star_printer.star(6);
        // Innerday4_1 calc = new Innerday4_1();
        // double new_var = calc.addition(5.0,6.0);
        // System.out.println(new_var);
        Andvance_calculator printer = new Andvance_calculator();
        printer.remainder(5,6,7);

    }


    
}

// class Innerday4 {
//     public void star(int a){

//         String str = "";
//         for (int i = 0; i <= a; i++){
//             str = str + " *" ;
//             System.out.println(str);


//         }
        
//     }

    
// }
class  Andvance_calculator extends Innerday4_1{
    public int remainder(int a, int b, int c){
        System.out.println(" advance class called ");
        return a + b + c;
    }
}

class Innerday4_1 {
    public int addition(int a, int b){
        int sum = (a + b);
        return sum;
    }

    public int substraction(int a, int b){
        int minus = (a - b);
        return minus;
    }
    public int multiplication(int a, int b){
        int into = (a * b);
        return into;
    }
    public double division(double a, double b){
        double div = (a/b);
        return div;
    }
    public int addition(int a, int b, int c){
        return (a+b+c);
    }
    public double addition(double a, double b){
        return (a+b);
    }
    public int remainder(int a, int b){
        System.out.println(" normal method callled");
        return a+b;
    }

    
}
