public class Application {

    static Logistics logistics;

    public static void main(String[] args) {
        logistics = new SeaLogistics();
        logistics.planDelivery();
        logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}
