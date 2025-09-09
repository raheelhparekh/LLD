package ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel techChannel = new YoutubeChannel("Tech Explained");

        Subscriber raheel = new User("Raheel");
        Subscriber alex = new User("Alex");
        Subscriber maria = new User("Maria");

        // Subscribers subscribe to the channel
        techChannel.subscribe(raheel);
        techChannel.subscribe(alex);
        techChannel.subscribe(maria);

        // Upload new videos
        techChannel.uploadNewVideo("Observer Design Pattern Tutorial");
        techChannel.uploadNewVideo("Java Spring Boot for Beginners");

        // Unsubscribe one user
        techChannel.unsubscribe(alex);

        // Upload another video
        techChannel.uploadNewVideo("Advanced System Design Concepts");
    }

}
