package android;

import platform.IPlatform;
import platform.IAction;
import platform.IOption;
import platform.ISAction;

public class CreateAndroidPlatform implements IPlatform{
    private double version;

    public CreateAndroidPlatform(double version) {
        this.version = version;
    }

    //@Override
    public IAction createAction() {
        int version_int = (int)(version * 10);
        switch (version_int) {
            case 11: {
                return new AndroidAction1_1();
            }
            case 12: {
                return new AndroidAction1_2();
            }
            case 13: {
                return new AndroidAction1_3();
            }
            default:
                return null;
        }
    }

    //@Override
    public   IOption createOption(){
        int version_int = (int)(version * 10);
        switch (version_int) {
            case 11: {
                return new AndroidOption1_1();
            }
            case 12: {
                return new AndroidOption1_2();
            }
            case 13: {
                return new AndroidOption1_3();
            }
            default:
                return null;
        }
    }

   // @Override
    public ISAction createSAction() {
        int version_int = (int)(version * 10);
        switch (version_int) {
            case 11: {
                return new AndroidSAction1_1();
            }
            case 12: {
                return new AndroidSAction1_2();
            }
            case 13: {
                return new AndroidSAction1_3();
            }
            default:
                return null;
        }
    }
}
