package logesh;
	import java.util.Scanner;
	class Vehicle {
		String type, fuel;
		void vehicleType(String type) {
			this.type = type;
			System.out.println("Vehicle Type: "+type);
		}
		void fuelType(String fuel) {
			this.fuel = fuel;
			System.out.println("Fuel Type: "+fuel);
		}
}
	class CarVehicle extends Vehicle {
		String brand, model;
		void carBrand(String brand) {
			this.brand = brand;
			System.out.println("Car Brand: "+brand);
		}
		void carModel(String model) {
			this.model = model;
			System.out.println("Car Model: "+model);
		}
	}
	class ElectricCarVehicle extends CarVehicle {
		double battery;
		void batteryCapacity(double battery) {
			this.battery = battery;
			System.out.println("Battery Capacity: "+battery+" kWh");
		}
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			ElectricCarVehicle ec = new ElectricCarVehicle();
			System.out.print("Enter Vehicle Type: ");
			String vh = sc.nextLine();
			System.out.print("Enter Fuel Type: ");
			String fh = sc.nextLine();
			System.out.print("Enter Car Brand: ");
			String ch = sc.nextLine();
			System.out.print("Enter Car Model: ");
			String cm = sc.nextLine();
			System.out.print("Enter Battery Capacity: ");
			double bc = sc.nextDouble();
			System.out.print("--------------------------\n");
			ec.vehicleType(vh);
			ec.fuelType(fh);
			ec.carBrand(ch);
			ec.carModel(cm);
			ec.batteryCapacity(bc);
			sc.close();
		}
	}