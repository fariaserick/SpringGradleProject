package project;

import static threads.ThreadColor.ANSI_RED;

import org.joda.time.LocalTime;

import objs.*;
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

		
		BankAccount bankAccount = new BankAccount();//(3334, 120300.00, "Erick", "fariaserick@startmail.com", "(604)366 0506");
		
		bankAccount.deposit(25000.00);
		bankAccount.withdraw(4300.00);
		
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