public class House {

    private boolean needsWalls = false;
    private boolean needsDoors = false;
    private boolean needsWindows = false;
    private boolean needsRoof = false;
    private boolean needsGarage = false;

    public House() {
        if(needsWalls && needsDoors && needsWindows && needsRoof && needsGarage) {
            System.out.println("The house with a garage is ready.");
        } else if (needsWalls && needsDoors && needsWindows && needsRoof) {
            System.out.println("A simple house is ready.");
        } else {
            System.out.println("The house is not ready yet.");
        }
    }

    void setNeedsWalls(boolean needsWalls) {
        this.needsWalls = needsWalls;
    }

    void setNeedsDoors(boolean needsDoors) {
        this.needsDoors = needsDoors;
    }

    void setNeedsWindows(boolean needsWindows) {
        this.needsWindows = needsWindows;
    }

    void setNeedsRoof(boolean needsRoof) {
        this.needsRoof = needsRoof;
    }

    void setNeedsGarage(boolean needsGarage) {
        this.needsGarage = needsGarage;
    }
}
