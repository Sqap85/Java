public class Main {
    public static void main(String[] args) {
        // Step 3: Create four Teacher objects
        Teacher teacher1 = new Teacher(1, Branch.MATH);
        Teacher teacher2 = new Teacher(2, Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3, Branch.CS);
        Teacher teacher4 = new Teacher(4, Branch.ENG);

        // Step 4: Put them in an array
        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};

        // Step 4: Print their branches using a loop
        for (Teacher i : teachers) {
            System.out.println("Teacher ID: " + i.containsId +
                    ", Branch: " + i.branch +
                    ", Info: " + i.branch.getInfo());
        }
    }
}