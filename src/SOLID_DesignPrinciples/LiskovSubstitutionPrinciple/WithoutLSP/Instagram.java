package SOLID_DesignPrinciples.LiskovSubstitutionPrinciple.WithoutLSP;

// now since instagram doesnt support group video call, it cannot be substituted for the parent class
// and will break the liskov substitution principle
public class Instagram extends SocialMedia {
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

    @Override
    public void groupVideoCall() {
        // not supported for instagram
    }

}
