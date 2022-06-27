package Cars.Details.Engines;

public class ToyotaEngine implements Engine {
    @Override
    public double maxSpeed() {
        return 230;
    }

    @Override
    public double litersPer100Km() {
        return 10;
    }
}
