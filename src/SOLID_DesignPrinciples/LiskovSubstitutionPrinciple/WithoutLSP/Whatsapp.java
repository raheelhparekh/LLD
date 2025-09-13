package SOLID_DesignPrinciples.LiskovSubstitutionPrinciple.WithoutLSP;

public class Whatsapp extends SocialMedia {
    @Override
    public void postPhoto() {
    // not applicable for whatsapp
    }

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
