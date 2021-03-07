public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // if you want to change the builder
    public void changeHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void make(String type) {
        if(type == "simple") {
            houseBuilder.buildWalls();
            houseBuilder.buildDoors();
            houseBuilder.buildWindows();
            houseBuilder.buildRoof();
        }
        else if (type == "with garage") {
            houseBuilder.buildWalls();
            houseBuilder.buildDoors();
            houseBuilder.buildWindows();
            houseBuilder.buildRoof();
            houseBuilder.buildGarage();
        }
    }
}
