import java.util.ArrayList;
import java.util.Scanner;

public class PolynomialSum{
	
	public static void main(String args[]){
		Scanner no = new Scanner(System.in);
		System.out.println("Enter the total count of numbers");
		int n = no.nextInt();
		ArrayList<PolynomialObject> polynomialList = new ArrayList<PolynomialObject>();
		PolynomialObject polynomialObject = new PolynomialObject();
		for(int i = 0; i < n; i++){
			polynomialObject.setCoefficient(no.nextDouble());
			polynomialObject.setExponent(no.nextDouble());
			polynomialList.add(polynomialObject);
		}
		
		
	}
}