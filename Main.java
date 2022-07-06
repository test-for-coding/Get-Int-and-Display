import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
    	try{
    	    int number = input.nextInt();
    	    System.out.println(number);
    	}catch(Exception e){
    	    System.out.println("Not an Integer");
    	}
        
        // closing the scanner object
        input.close();
    }
}
