public class Doctor {
    private int id;
    private String name;
    private String surname;
    private String specialization;

    public Doctor(int doctortId, String doctorName, String doctorSurname, String doctorSpecialization){
        this.id = doctortId;
        this.name = doctorName;
        this.surname = doctorSurname;
        this.specialization = doctorSpecialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String compareSpecialization(Doctor doctor){
        if(this.specialization.equals(doctor.specialization)){
            return "Doctors have the same specialization";
        }
        else {
            return "Doctors have different specializations";
        }
    }

    public void displayInfo() {
        System.out.println("Doctor ID:" + id + ", Name:" + name + ", Surname:" + surname + ", Specialization:" + specialization);
    }

}
