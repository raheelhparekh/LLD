package FactoryDesignPattern;

public class OperatingSystemFactory {

    public Os getInstance(String os){

        switch(os){
            case "windows":
                return new Windows();
            case "ios":
                return new Ios();
            case "android":
                return new Android();

            default:
                System.out.println("Invalid OS");
                return null;
        }
    }

}
