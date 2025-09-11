package FactoryDesignPattern;

// CLIENT APPLICATION. CLIENT DOESNT KNOW WHAT IS BEING CALLED BEHIND THE SCENES
// EVERYTHING IS DONE BY THE FACTORY CLASS WHICH IS THE (OperatingSystemFactory)
// EVEN IF U WANT TO ADD NEW OPERATING SYSTEM U DONT HAVE TO CHANGE THE CLIENT APPLICATION CODE
public class Main {

    public static void main(String[] args) {
        OperatingSystemFactory obj = new OperatingSystemFactory();
        Os objectCreated = obj.getInstance("android");
        objectCreated.spec();

    }

}
