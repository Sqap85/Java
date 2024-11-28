abstract public class Student {
    private int id;
    private float mid;
    private float fin;

    Student(int id,float mid,float fin){
        this.id = id;
        this.mid = mid;
        this.fin = fin;
    }

    float computeTotalScore() {
        return computeBaseScore();
    }

    float computeBaseScore(){
        return (mid * 0.4f) + (fin * 0.6f);
    }

}
