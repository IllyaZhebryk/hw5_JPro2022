public class Cat extends Participant{
        @Override
        void run(){
            System.out.println("Шось кошаче біжить по цій дорожці");
        }
        @Override
        void jumpOver(){
            System.out.println("шось кошаче перестрибнуло цю перешкоду");
        }
}
