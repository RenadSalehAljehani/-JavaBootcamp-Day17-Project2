public abstract class Passenger {
    private String name;
    private String ID;
    private Car  reservedCar;
    private double tripCost;

    // Constructor
    public Passenger(String name, String ID, Car reservedCar) {
        this.name = name;
        this.ID = ID;
        this.reservedCar = reservedCar;
    }

    // Setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    // Abstract methods
    public abstract double reserveCar(Car reservedCar) throws Exception;
    public abstract void displayInfo();
}