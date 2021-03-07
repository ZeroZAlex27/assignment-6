public class Ship implements Transport{

    public Ship() {
        this.deliver();
    }

    @Override
    public void deliver() {
        System.out.println("Shipping by sea begins.");
    }
}
