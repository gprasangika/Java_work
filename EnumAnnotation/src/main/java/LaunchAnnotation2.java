import java.lang.annotation.*;

// Retention - how powerful is the annotation. is it just a comment not going to compiler, if it goes to compiler, if it goes to JVM, Springboot level
// Terget - where the annotation is going to be applied. methods, constructors, classes etc
@Retention(RetentionPolicy.RUNTIME) // source - before compiler, class - till compiler, runtime - JVM Springboot
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER}) // Type - Class
@interface CricketPlayer {

    String country() default "India";
    int age() default 36;
}
//@ --> this tells java compiler that a annotation type is being created




@CricketPlayer(country = "India", age = 38)
class RohitSharma {

    @CricketPlayer
    private int innnings;

    public RohitSharma() {
    }

    public int getInnnings() {
        return innnings;
    }

    public void setInnnings(@CricketPlayer int innnings) {
        this.innnings = innnings;
    }
}




public class LaunchAnnotation2 {
    static void main(String[] args) {
        RohitSharma rs = new RohitSharma();

        // Reflection API - proivides info about classes etc
        Class<? extends RohitSharma> cls = rs.getClass();

        CricketPlayer anncls = cls.getAnnotation(CricketPlayer.class);

        System.out.println(anncls);
    }
}
