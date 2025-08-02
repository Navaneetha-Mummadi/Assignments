package myassignment;

	public class Assignment32 {
	    public static void main(String[] args) {
	        try {
	            
	            int result = 10 / 0;
	            System.out.println("Result: " + result);

	        } catch (NegativeArraySizeException e) {
	            System.out.println("Caught NegativeArraySizeException");
	            e.printStackTrace();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Caught ArrayIndexOutOfBoundsException");
	            e.printStackTrace();
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Caught StringIndexOutOfBoundsException");
	            e.printStackTrace();
	        } catch (IndexOutOfBoundsException e) {
	            System.out.println("Caught IndexOutOfBoundsException");
	            e.printStackTrace();
	        } catch (NullPointerException e) {
	            System.out.println("Caught NullPointerException");
	            e.printStackTrace();
	        } catch (ArithmeticException e) {
	            System.out.println("Caught ArithmeticException");
	            e.printStackTrace();
	        } catch (Exception e) {
	            System.out.println("Caught General Exception");
	            e.printStackTrace();
	        }
	    }
	}
/*Caught ArithmeticException
java.lang.ArithmeticException: / by zero
	at myassignment/myassignment.Assignment32.main(Assignment32.java:7)
*/