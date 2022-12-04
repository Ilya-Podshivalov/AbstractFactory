package platform;
import android.AndroidPlatform;
import platform.IPlatform;

public class PlatformFactory {
    static public IPlatform createPlatform(String platformType, double version) {
        switch (platformType) {

            case "Android": {
                return new AndroidPlatform(version);
            }
            case "IOS":{
                return null;
            }
            default:
                return null;
        }
    }
}