import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random ran = new Random();
		int value = ran.nextInt(21);
		if (value % 2==0) {
			System.out.println("this number is even");}
			else {
				System.out.println("This number is odd");
			}
		}

	}


