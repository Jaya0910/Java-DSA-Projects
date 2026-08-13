public class A{
    public static void main(String[]  args){
        int i=0;
        try{
            int j=10/i;
    }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero.");
        }
    }
}