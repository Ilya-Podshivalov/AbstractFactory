package platform;
import android.CreateAndroidPlatform;

public class PlatformFactory {
    static public IPlatform createPlatform(String platformType, double version) {
        switch (platformType) {

            case "ANDROID": {
                return new CreateAndroidPlatform(version);
            }
            case "IOS":{
                return null;
            }
            default:
                return null;
        }
    }
}