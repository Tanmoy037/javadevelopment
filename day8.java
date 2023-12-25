abstract class Computer {

    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("code, compile, run");
    }

}

class Desktop extends Computer{
    public void code()
    {
        System.out.println("code , compile, run : Faster");
    }
}

class Developer{
    public void devApp(Computer lap)
    {
        lap.code();
    }
}
public class day8 {


    public static void main(String a[]){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer tanmoy = new Developer();
        tanmoy.devApp(lap);

    }
}