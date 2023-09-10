public class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;

    public void goToCollege(){
        System.out.printf("Nome: %s - Cognome: %s - Id: %d%n", name, surname, collegeId);
    }

    public CollegePerson(String name, String surname, int collegeId){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }
}
