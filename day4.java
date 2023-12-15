public class day4 {
    public static void main(String[] args) {
        Innerday4 star_printer= new Innerday4();
        star_printer.star(6);
        Innerday4_1 calc = new Innerday4_1();
        calc.addition(5,6);
    }


    
}

class Innerday4 {
    public void star(int a){

        String str = "";
        for (int i = 0; i <= a; i++){
            str = str + " *" ;
            System.out.println(str);


        }
        
    }

    
}


class Innerday4_1 {
    public void addition(int a, int b){
        int sum = (a + b);
        System.out.println("addition " + sum);

    }

    
}
