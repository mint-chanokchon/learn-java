import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size x: ");
		x = scanner.nextDouble();
		
		System.out.print("Enter size y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x * x) + (y * y));
		
		System.out.println("z is " + z);
		
		scanner.close();
		
	}
}
