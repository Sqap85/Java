public class Main {
    public static void main(String[] args) {
        // Lisans öğrencisi
        BachelourStudent bachelourStudent = new BachelourStudent(101, 70, 80);
        System.out.println("Bachelour Student Total Score: " + bachelourStudent.computeTotalScore());
        System.out.println("Bachelour Student Project Score: " + bachelourStudent.projectScore());

        // Yüksek lisans öğrencisi
        MasterStudent masterStudent = new MasterStudent(102, 75, 85, 3);
        System.out.println("\nMaster Student Total Score: " + masterStudent.computeTotalScore());
        System.out.println("Master Student Conference Score: " + masterStudent.conferanceScore());

        // Doktora öğrencisi
        PhDStudent phdStudent = new PhDStudent(103, 80, 85, 1, 1);
        System.out.println("\nPhD Student Total Score: " + phdStudent.computeTotalScore());
        System.out.println("PhD Student Conference Score: " + phdStudent.conferanceScore());
        System.out.println("PhD Student Article Score: " + phdStudent.articleScore());
    }
}
