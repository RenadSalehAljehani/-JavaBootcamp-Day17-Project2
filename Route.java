public class Route {
    private String  pickUpAddress;
    private String destinationAddress;
    private double routPrice;

    // Constructor
    public Route(String pickUpAddress, String destinationAddress, double routPrice) {
        this.pickUpAddress = pickUpAddress;
        this.destinationAddress = destinationAddress;
        this.routPrice = routPrice;
    }

    // Setters & getters
    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getRoutePrice() {
        return routPrice;
    }

    public void setRotePrice(double routPrice) {
        this.routPrice = routPrice;
    }
}