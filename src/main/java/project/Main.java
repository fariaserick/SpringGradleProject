package project;

import static threads.ThreadColor.ANSI_RED;

import org.joda.time.LocalTime;

import inheritance.*;
import models.*;
import threads.AnotherThread;
import threads.MyRunnable;

public class Main {
	
	public static void main(String[] args) {
		
//		Car porche = new Car();
//		Car holden = new Car();
//		
//		porche.setMake("Porche");
//		porche.setModel("Carrera");
//		porche.setColour("Black");
//		porche.setDoors(2);
//		porche.setEnginee("V8");
		
//		System.out.println("The "+porche.getMake()+ 
//				" " +porche.getModel()+
//				" is "+porche.getColour()+
//				" and has a " + porche.getEnginee() + " Enginee");
		
		
//		SimpleCalculator calc = new SimpleCalculator();
//		calc.setFirstNumber(0.0);
//		calc.setSecondNumber(1.25);
//		System.out.println(calc.getSubtractionResult());
		
		
//		Person person = new Person();
//		person.setFirstName("");   // firstName is set to empty string
//		person.setLastName("");    // lastName is set to empty string
//		person.setAge(10);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setFirstName("John");    // firstName is set to John
//		person.setAge(18);
//		System.out.println("fullName= " + person.getFullName());
//		System.out.println("teen= " + person.isTeen());
//		person.setLastName("Smith");    // lastName is set to Smith
//		System.out.println("fullName= " + person.getFullName());

		
/*		
		BankAccount bankAccount = new BankAccount();//(3334, 120300.00, "Erick", "fariaserick@startmail.com", "(604)366 0506");
		
		bankAccount.deposit(25000.00);
		bankAccount.withdraw(4300.00);
		
		BankAccount account = new BankAccount("Erick", "601235", "farias@yahoo.com");
		System.out.println(account.getAccountNumber() +"\n"+ account.getBalance() +
				"\n"+ account.getCustomerName() +"\n"+ account.getPhone() +"\n"+ account.getEmail());
*/
	
/*
		VipCustomer const1 = new VipCustomer();
		System.out.println(const1.getName());
	
		VipCustomer const2 = new VipCustomer("Erick","erick@yahoo.com");
		System.out.println(const2.getName());
		
		VipCustomer const3 = new VipCustomer("Johnny", 10000.00, "johnny@lame.com");
		System.out.println(const3.getName());
*/
		
		/*
		Point first = new Point(6,5);
		Point second = new Point(3,1);
		
		System.out.println("distance(0,0)= " + first.distance());
		System.out.println("distance(second)= " + first.distance(second));
		System.out.println("distance(2,2)= " + first.distance(2,2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
		*/
		
		/*
		ComplexNumber one = new ComplexNumber(1.0,1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
		*/
		
		/*
		Pathfinder suv = new Pathfinder(36);
		suv.steering(45);
		suv.accelerate(30);
		suv.accelerate(20);
		suv.accelerate(-42);
		*/
		
//		System.out.println("The" + suv.getName() + " has " + suv.getGears() + 
//				" gears \nturned " + suv.getCurrentDirection() + " going " + suv.getCurrentVelocity() + "km/h."
//						+ "\nSlow down!");
		
		
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());
		
		
		
		
	}
	
	
	
	public static void testmain(String[] args) {

		//	  ThreadColor threadColor = new ThreadColor();
		LocalTime currentTime = new LocalTime();

		System.out.println("The current local time is: " + currentTime);

		Greeter greeter = new Greeter();
		//	  System.out.println(greeter.sayHello());

		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		anotherThread.start();

		new Thread () {
			public void run() {
				System.out.println(ANSI_RED + "Hello from an anonymous Thread!");
			}
		}.start();

		Thread myRunnableThread = new Thread(new MyRunnable() {
			@Override
			public void run() {
				System.out.println(ANSI_RED + "Hello from anonymous implementation of Runnable");
			}
		});
		myRunnableThread.start();

		System.out.println("Hello from the main Thread!");
	}
}