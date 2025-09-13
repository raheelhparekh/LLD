package SOLID_DesignPrinciples.LiskovSubstitutionPrinciple.WithLSP;

public class Whatsapp implements SocialMedia, GroupVideoCall {
    @Override
    public void chatWithFriend() {
        System.out.println("Chat with friend on Whatsapp");
    }

    @Override
    public void sendPhoto() {
        System.out.println("Send photo on Whatsapp");
    }

    @Override
    public void groupVideoCall() {
        System.out.println("Group video call on Whatsapp");
    }

}
