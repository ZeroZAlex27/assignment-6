public class Truck implements Transport{

    public Truck() {
        this.deliver();
    }

    @Override
    public void deliver() {
        System.out.println("Delivery by road begins.");
    }
}
