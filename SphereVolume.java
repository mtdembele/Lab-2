import java.util.Scanner;

public class SphereVolume  

{  

public static void main(String[] args)  

{  
	Scanner kbd= new Scanner(System.in);
	double diam, radius, vol;

	System.out.println("This program will calculate the sphere volume.");  
	System.out.println("Enter the diameter of the sphere.");
	diam=kbd.nextDouble();
	radius=diam/2;
	 vol= (4.0 / 3) * Math.PI * Math.pow(radius, 3);
	 System.out.println("The volume of this sphere is " + vol);
}  

}  