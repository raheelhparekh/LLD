package SOLID_DesignPrinciples.LiskovSubstitutionPrinciple.WithoutLSP;

// liskov substitution principle states that a subclass should be able to substitute for its parent class and vice versa
// now facebook class can be substituted for the parent class, but Instagram class cannot be substituted for the parent class since it does not have group video call feature.
// similarly whatsapp class can be substituted for the parent class since it does not have post photo feature
public abstract class SocialMedia {

    public abstract void postPhoto();

    public abstract void chatWithFriend();

    public abstract void sendPhoto();

    public abstract void groupVideoCall();

    

}
