package cicddemo;


public class App 
{
    private static String VERSION = "v1.0";

    public static void main( String[] args ) {
        App app = new App();
        System.out.println("CICD version: " + app.getVersion());
    }    
    
    public String getVersion() {
        return VERSION;
    }
}
