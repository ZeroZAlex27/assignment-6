public interface HouseBuilder {
    void reset();
    void buildWalls();
    void buildDoors();
    void buildWindows();
    void buildRoof();
    void buildGarage();
    House getResults();
}
