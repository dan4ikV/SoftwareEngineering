package Cars.Details.Engines;

public class MercedesEngine implements Engine{
    @Override
    public double maxSpeed() {
        return 278;
    }

    @Override
    public double litersPer100Km() {
        return 13;
    }
}
