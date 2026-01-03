public class Main {
    public static void main(String[] args){
        Patient patient1 = new Patient(1,"Amina", "Auyeskhan", 17);
        Patient patient2 = new Patient(2,"Adelya","Baysalova",20);

        Doctor doctor1 = new Doctor(22, "Zhuldyz","Akhmetovna", "dentist");
        Doctor doctor2 = new Doctor(54,"Aidyn","Arkhatov","cardiologist");

        Hospital hospital = new Hospital ("Multidisciplinary City Hospital №1","Astana, Koshkarbaev ave.66");

        patient1.displayInfo();
        patient2.displayInfo();
        doctor1.displayInfo();
        doctor2.displayInfo();
        hospital.displayinfo();

        System.out.println(doctor1.compareSpecialization(doctor2));

        System.out.println(patient1.compareAge(patient2));

    }
}