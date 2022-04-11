package lesson3;

public class MainApp {

    public static void main(String[] args) {

        try {
            System.out.println(1);
            int x=10/0;
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println("Catch AE");

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
              System.out.println(3);
        }
        catch (RuntimeException e){
        e.printStackTrace();}
        }   
    }


//    public static void a(){
//        b();
//    }
//
//    public static void b(){
//        int x = 10/0;
//    }
}
