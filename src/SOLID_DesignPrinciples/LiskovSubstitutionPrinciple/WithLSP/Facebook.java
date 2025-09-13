package SOLID_DesignPrinciples.LiskovSubstitutionPrinciple.WithLSP;

public class Facebook implements SocialMedia, PostPhoto, GroupVideoCall {
    @Override
    public void chatWithFriend() {
        System.out.println("Chat with friend on Facebook");
    }

    @Override
    public void postPhoto() {
        System.out.println("Post photo on Facebook");
    }

    @Override
    public void groupVideoCall() {
        System.out.println("Group video call on Facebook");
    }

    @Override
    public void sendPhoto() {
        System.out.println("Send photo on Facebook");
    }
}
