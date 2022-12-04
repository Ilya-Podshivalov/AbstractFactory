package platform;

public class Platform {
    private IAction action;
    private IOption option;
    private ISAction saction;
    public Platform(String platform_, double version){
        PlatformFactory factory = new PlatformFactory();
        IPlatform platform = factory.createPlatform(platform_, version);
        action = platform.createAction();
        option = platform.createOption();
        saction = platform.createSAction();
        action.VersionFunction();
        option.VersionFunction();
        saction.VersionFunction();
    }
}
