package project;

import org.joda.time.LocalTime;

public class Main {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    
    System.out.println(args);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}