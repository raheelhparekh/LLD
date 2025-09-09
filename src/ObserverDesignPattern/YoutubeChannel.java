package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel {
    private String name;
    private List<Subscriber> subscribers;

    YoutubeChannel(String name){
        this.name=name;
        this.subscribers=new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber + " subscribed to " + name + " channel");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber + " unsubscribed from " + name + " channel");
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(name, videoTitle);

        }
    }

    public void uploadNewVideo(String videoTitle) {
        System.out.println(name + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }

}
