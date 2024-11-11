public class NonSubscriberPassenger extends Passenger {
    private boolean discountCoupon;

    // Constructor
    public NonSubscriberPassenger(String name, String ID, Car reservedCar, boolean discountCoupon) {
        super(name, ID, reservedCar);
        this.discountCoupon = discountCoupon;
    }

    // Setter & getter
    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    // Override abstract methods
    @Override
    public double reserveCar(Car reservedCar) throws Exception{
        if(reservedCar.getMaximumCapacity() == 0){
            throw new Exception();
        }
        else {
            double originalPrice = reservedCar.getRoute().getRoutePrice();
            if (this.discountCoupon) {
                // With applying a 10% discount
                super.setTripCost(originalPrice - (originalPrice * 0.1));
                // Confirm reservation
                System.out.println("> The car with code " + super.getReservedCar().getCode()
                        + " has been successfully reserved for \nthe non-subscriber passenger " + super.getName()
                        + " with applying a 10% discount.");
            } else{
                // Without applying a 10% discount
                super.setTripCost(originalPrice);
                // Confirm reservation
                System.out.println("> The car with code " + super.getReservedCar().getCode()
                        + " has been successfully reserved \nfor the non-subscriber passenger " + super.getName() + ".");
            }
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
