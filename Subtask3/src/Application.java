public class Application {

    static HouseBuilder houseBuilder;

    public static void main(String[] args) {
        houseBuilder = new HouseBuilder1();
        Director director = new Director(houseBuilder);
        director.changeHouseBuilder(houseBuilder);
        houseBuilder.reset();
        director.make("with garage");
        houseBuilder.getResults();
    }
}
