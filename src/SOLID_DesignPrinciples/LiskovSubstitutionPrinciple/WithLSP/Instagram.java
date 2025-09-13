package SOLID_DesignPrinciples.LiskovSubstitutionPrinciple.WithLSP;

public class Instagram implements SocialMedia, PostPhoto {
    @Override
    public void postPhoto() {
        System.out.println("Post photo on Instagram");
    }

    @Override
    public void chatWithFriend() {
        System.out.println("Chat with friend on Instagram");
    }

    @Override
    public void sendPhoto() {
        System.out.println("Send photo on Instagram");
    }
}
