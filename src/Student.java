public class Student extends CollegePerson implements LearningPerson{
    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.printf("Lo studente del %d anno è a casa a studiare%n", academicYear);
    }
}
