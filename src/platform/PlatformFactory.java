package platform;
import IOS.CreateIOSPlatform;
import android.CreateAndroidPlatform;

public class PlatformFactory {
    static public IPlatform createPlatform(String platformType, double version) {
        switch (platformType) {

            case "ANDROID": {
                return new CreateAndroidPlatform(version);
            }
            case "IOS":{
                return new CreateIOSPlatform(version);
            }
            default:
                return null;
        }
    }
}