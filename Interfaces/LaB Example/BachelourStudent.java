public class BachelourStudent extends Student implements  ProjectScoreBehaviour{


    BachelourStudent(int id, float mid, float fin) {
        super(id, mid, fin);
    }

    float computeTotalScore(){
        return computeBaseScore() + projectScore();
    }

    public float projectScore(){
        return 15;
    }
}
