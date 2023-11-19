public class Main {
    public static void main(String[] args) {
        
        Double num = Double.valueOf("345");
        Double denom = 0.0;
        try {
            System.out.println(func(num, denom));
        } catch (ArithmeticException e){
            System.out.println("The denom is 0");
        } catch (Exception e){
            System.out.println("One of this is null");
        }
        try {
            System.out.println(func(10.6, 15.4));
        } catch (Exception e){
            System.out.println("Your denom is: " + e.getMessage());
        }
        
    }
    public static Double func(Double num1, Double num2) throws Exception {
        if( num1 == null || num1 == null){
            throw new Exception();
        }
        else if (num2 == 0){
            throw new ArithmeticException();
        }
        else {
            return num1/num2;
        }
    }
}