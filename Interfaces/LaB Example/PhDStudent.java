public class PhDStudent extends MasterStudent implements ArticleScoreBehavior {
    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int numberOfConf, int numberOfArticles) {
        super(id, mid, fin, numberOfConf);
        this.numberOfArticles = numberOfArticles;
    }

    public float computeTotalScore(){
        return computeBaseScore() + conferanceScore() + articleScore();
    }

    public float articleScore(){
        return numberOfArticles * 10;
    }
}
