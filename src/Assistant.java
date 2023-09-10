public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean willBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("L'assistente sta studiando per il PhD");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("L'assistente insegna alla classe");
    }
}
