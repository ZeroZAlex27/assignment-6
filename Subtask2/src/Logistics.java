public abstract class Logistics {

    public void planDelivery() {
        Transport t = this.createTransport();
    }

    public abstract Transport createTransport();
}
