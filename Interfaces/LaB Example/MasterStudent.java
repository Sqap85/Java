public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    int numberOfConf;

    public MasterStudent(int id, float mid, float fin, int numberOfConf) {
        super(id, mid, fin);
        this.numberOfConf = numberOfConf;
    }

    float computeTotalScore(){
        return computeBaseScore() + conferanceScore();
    }

    @Override
    public float conferanceScore() {
        return numberOfConf * 5;
    }
}
