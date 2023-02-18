package Day4;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = (args[0]);
		car1.model = (args[1]);
		car1.price = Integer.parseInt(args[2]);
		int size1 = car1.brand.length();

		Car car2 = new Car();
		car2.brand = (args[3]);
		car2.model = (args[4]);
		car2.price = Integer.parseInt(args[5]);
		int size2 = car2.brand.length();

		Car car3 = new Car();
		car3.brand = (args[6]);
		car3.model = (args[7]);
		car3.price = Integer.parseInt(args[8]);
		int size3 = car3.brand.length();

		int totalprice = (car1.price + car2.price + car3.price);

		System.out.println(size1 + "\n" + size2 + "\n" + size3);

		System.out.println((car1.brand + "\n" + car2.brand + "\n" + car3.brand).toUpperCase());
		
		System.out.println(totalprice);

	}

}
