package carPurchaseUtility;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Cars{
	int carId;
	String model;
	int price;
	int resaleValue;
	
	Cars(int carId, String model,int price, int resaleValue){
		this.carId = carId;
		this.model = model;
		this.price = price;
		this.resaleValue = resaleValue;
	}
}

class Customer extends Cars{
	int customerId;
	String customerName;
	ArrayList<Cars> purchasedCars=new ArrayList<Cars>();
	Customer(int customerId, String customerName, ArrayList<Cars> purchasedCars){
		this.customerId = customerId;
		this.customerName = customerName;
		this.purchasedCars = purchasedCars;
	}
	public String toString() {
		return customerId+ " "+customerName+" "+purchasedCars;
	}

}
class carPurchase {
	public static void main(String args[]) {
	
		System.out.println("Hello"); 
			
		System.out.println("Select any one:");
		System.out.println("1. Add New Customer");
		System.out.println("2. Add new Car to an Existing Customer");
		System.out.println("3. List of Customers");
		System.out.println("4. Individual Customer Details");
		System.out.println("5. Generate Price");
		
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch(choice) {
		case 1: addNewCustomer();
				break;
		case 2: addNewCar();
				break;
		case 3: customerList();
				break;
		case 4: customerDetails();
				break;
		case 5: generatePrice();
				break;
		default : System.out.println("Wrong Choice");
		
		}
	}
	
	private static void addNewCustomer() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Customers to be added");
		int ch = s.nextInt();
		HashSet<Customer> customer = new HashSet<Customer>();
		do {
			System.out.println("Enter Customer ID :");
			int id = s.nextInt();
			System.out.println("Enter Customer Name :");
			String name = s.next();
			System.out.println("Enter Number of cars to be added :");
			int carNo = s.nextInt();
			while(carNo>0) {
				HashSet<Cars> cars = new HashSet<Cars>();
				System.out.println("Enter Car ID :");
				int carId = s.nextInt();
				System.out.println("Enter Car Model (Toyota, Maruti or Hyundai :");
				String model = s.next();
				System.out.println("Enter Car Price :");
				int carPrice = s.nextInt();
				int resaleValue;
				if(model.contains("Toyota")) {
					resaleValue = 80/100 * carPrice;
				}
				else if(model.contains("Maruti")) {
					resaleValue = 60/100 * carPrice;
				} 
				else if(model.contains("Hyundai")) {
					resaleValue = 40/100 * carPrice;
				}
				System.out.println("Resale Value is :"+resaleValue);
				
				Cars c = new Cars(carId,model,carPrice,resaleValue);
			}
			Customer c1 = new Customer(id, name, null);
			customer.add(c1);
			ch--;
		}while(ch>0);
		
		System.out.print(customer);
	}
	
	private static void addNewCar() {
		// TODO Auto-generated method stub
		
	}
	private static void customerList() {
		// TODO Auto-generated method stub

	}
	

	private static void customerDetails() {
		// TODO Auto-generated method stub
		
	}

	
	private static void generatePrice() {
		// TODO Auto-generated method stub
		
	}
		
	}

