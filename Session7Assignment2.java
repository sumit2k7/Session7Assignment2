
public class Session7Assignment2 {

	public static void main(String[] args) {
		 try {
	            String s = "Sumit";
	            int i = Integer.parseInt(s);
	            // this line of code will never be reached
	            System.out.println("int value = " + i);
	        }
	        catch (NumberFormatException nfe) {
	            nfe.printStackTrace();
	        }

	}

}
