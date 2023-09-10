public class Main {
    public static void main(String[] args) {

        Student student = new Student("Maria", "Rossi", 001, 2);
        Professor professor = new Professor("Luca", "Neri", 100, "storia");
        Assistant assistant = new Assistant("Valentina","Neri",010, true);

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
