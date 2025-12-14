public class Main {
    public static void main(String[] args){
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

        patient1.setName("Amina");
        patient1.setSurname("Auyeskhan");

        patient2.setName("Aiym");
        patient2.setSurname("Akhmetova");

        System.out.println(patient1.getName() + " " + patient1.getSurname());

    }
}