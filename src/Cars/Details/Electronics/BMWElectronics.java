package Cars.Details.Electronics;

public class BMWElectronics implements Electronics{
    @Override
    public boolean parkingCamera() {
        return false;
    }

    @Override
    public boolean nativeGPS() {
        return true;
    }
}
