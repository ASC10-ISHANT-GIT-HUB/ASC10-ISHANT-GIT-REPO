
class Calculator{
    public static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
}

public class Main{
    public static void main (String[] args) {
        String colors[] = {"red", "green", "yellow"};
        Calculator calculator = null;
        System.out.println("Normal calculator");
        try{
            for(int i=0; i<=3; i--){
                System.out.println(colors[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            try{
                calculator.add(50, 50);
            }
            catch(NullPointerException nullPointerException){
                System.out.println("initiate the calculator");
            }
            System.out.println("Check index");
        }
        System.out.println("Thank you");
    }
}