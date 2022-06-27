package Cars.Details.Electronics;

public class ToyotaElectronics implements Electronics{
    @Override
    public boolean parkingCamera() {
        return false;
    }

    @Override
    public boolean nativeGPS() {
        return false;
    }
}
