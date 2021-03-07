public class HouseBuilder1 implements HouseBuilder{

    private House result;

    @Override
    public void reset() {
        result = new House();
    }

    @Override
    public void buildWalls() {
        System.out.println("building walls...");
        result.setNeedsWalls(true);
    }

    @Override
    public void buildDoors() {
        System.out.println("building doors...");
        result.setNeedsDoors(true);
    }

    @Override
    public void buildWindows() {
        System.out.println("building windows...");
        result.setNeedsWindows(true);
    }

    @Override
    public void buildRoof() {
        System.out.println("building roof...");
        result.setNeedsRoof(true);
    }

    @Override
    public void buildGarage() {
        System.out.println("building garage...");
        result.setNeedsGarage(true);
    }

    @Override
    public House getResults() {
        System.out.println("The house is ready.");
        return this.result;
    }
}
