package Cars.Details.Electronics;

public class MercedesElectronics implements Electronics{
    @Override
    public boolean parkingCamera() {
        return true;
    }

    @Override
    public boolean nativeGPS() {
        return true;
    }
}
