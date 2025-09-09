package ObserverDesignPattern;

public class User implements Subscriber{
    private String username;

    User(String username){
        this.username=username;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println(channelName + " has uploaded a new video: " + videoTitle);
    }

    public String toString(){
        return username;
    }

}
