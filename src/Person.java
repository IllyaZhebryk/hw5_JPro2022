public class Person extends Participant{
    @Override
    void run(){
        System.out.println("Людина біжить по цій дорожці");
    }
    @Override
    void jumpOver(){
        System.out.println("Людина перестрибнула цю перешкоду");
    }
}

