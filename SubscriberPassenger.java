public class SubscriberPassenger extends Passenger {

    // Constructor
    public SubscriberPassenger(String name, String ID, Car reservedCar) {
        super(name, ID, reservedCar);
    }

    // Override abstract methods
    @Override
    public double reserveCar(Car reservedCar) throws Exception {
        if (reservedCar.getMaximumCapacity() == 0) {
            throw new Exception();
        } else {
            // Applying a 50% discount
            double originalPrice = reservedCar.getRoute().getRoutePrice();
            super.setTripCost(originalPrice - (originalPrice * 0.5));
            // Confirm reservation
            System.out.println("> The car with code " + super.getReservedCar().getCode()
                    + " has been successfully reserved for \nthe subscriber passenger " + super.getName()
                    + " with applying a 50% discount.");
        }
        return Math.round(super.getTripCost() * 100.0) / 100.0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger Name: " + super.getName()
                + "\nPassenger ID: " + super.getID()
                + "\nCar Code: " + super.getReservedCar().getCode()
                + "\nRoute Price: $" + super.getReservedCar().getRoute().getRoutePrice());
    }
}
