public class Wall extends Obstacles{
    @Override
    void overcome (Participant unit){
        unit.jumpOver();
    };
}
