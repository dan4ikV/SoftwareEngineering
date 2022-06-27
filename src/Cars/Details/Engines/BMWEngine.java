package Cars.Details.Engines;

public class BMWEngine implements Engine{
    @Override
    public double maxSpeed() {
        return 270;
    }

    @Override
    public double litersPer100Km() {
        return 12;
    }
}
