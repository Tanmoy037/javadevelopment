public class day7 {
    public static void main(String[] args) {
        Star_printer strr = new Star_printer();
       strr.print_star(5);

    }
}



class Star_printer{
    public void print_star(int a){
        for (int i = 0; i < a; i++){
            String str = "";
            for (int j = i; j < a-1; j++ ){
                str += "  ";
            
            }
            for (int k = 0; k <= i; k++ ){
                str += "* ";
            
            }
            System.out.println(str);
        }
        
    }
}