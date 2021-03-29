// Your First Program
import java.util.Scanner;


class HelloWorld {
    public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("What's your name?");

		String userName = myObj.nextLine(); 
        System.out.println("Hello, " + userName + "!"); 
    }
}