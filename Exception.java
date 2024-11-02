
public class Exception {
    @SuppressWarnings("null")
    public static void main(String[] args){
        System.out.println("Testing Out Exception Handling");

        try{
            System.out.println("Outer Try Block is Printing");
            try{
                System.out.println("Inner Block is Printing");
                int result = 45/0; 
                System.out.println(result);
            }
            catch(ArithmeticException e){
                System.out.println("Arthimetic Exception Caught");
            }
            String str = null;
            System.out.println(str.length());
        }
            catch(NullPointerException e){
            System.out.println(e);
        }
        // catch(Exception e){
        //         System.out.println("Parent Class Exception");
        // }
            System.out.println("Rest of the Code>>>>");
        }
    }
