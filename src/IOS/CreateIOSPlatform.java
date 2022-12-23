package IOS;

import platform.IPlatform;
import platform.IAction;
import platform.IOption;
import platform.ISAction;

public class CreateIOSPlatform implements IPlatform{
    private double version;

    public CreateIOSPlatform(double version) {
        this.version = version;
    }

    //@Override
    public IAction createAction() {
        int version_int = (int)(version * 10);
        switch (version_int) {
            case 11: {
                return new IOSAction1_1();
            }
            case 12: {
                return new IOSAction1_2();
            }
            case 13: {
                return new IOSAction1_3();
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
                return new IOSOption1_1();
            }
            case 12: {
                return new IOSOption1_2();
            }
            case 13: {
                return new IOSOption1_3();
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
                return new IOSSAction1_1();
            }
            case 12: {
                return new  IOSSAction1_2();
            }
            case 13: {
                return new IOSSAction1_3();
            }
            default:
                return null;
        }
    }
}
