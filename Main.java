import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ******************************************** Testing ********************************************

        // Create two Route objects
        Route route1 = new Route("Al-safa, Jeddah", "RedSeaMall, jeddah", 20.5);
        Route route2 = new Route("Obhur, Jeddah", "Corniche, jeddah", 15.3);

        // Create two Car objects
        Car car1 = new Car("KSA-1234", route1, 6);
        Car car2 = new Car("KSA-6528", route2, 3);

        // Create an ArrayList of Passengers
        ArrayList<Passenger> passengersList = new ArrayList<>();

        // Create two passengers (1 Subscriber and 1 non-Subscriber)
        SubscriberPassenger passenger1 = new SubscriberPassenger("Saleh Aljehani", "1289765245", car1);
        NonSubscriberPassenger passenger2 = new NonSubscriberPassenger("Mohamad Almutairi", "1376259862", car2, false);

        // Add the two passengers to the ArrayList of Passengers
        passengersList.add(passenger1);
        passengersList.add(passenger2);

        // Handel the thrown exception
        try {
            // Reserve the Car objects to its passengers, compute the trip cost, and display information
            System.out.println("****** Reservation Details ******" + "\nTrip cost: $" + passenger1.reserveCar(car1));
            passenger1.displayInfo();
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("****** Reservation Details ******" + "\nTrip cost: $" + passenger2.reserveCar(car2));
            passenger2.displayInfo();

        } catch (Exception e) {
            System.out.println("The maximum capacity of passengers per trip can't be 0!");
        }
    }
}
