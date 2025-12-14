public class Patient {
    private int id;
    private String name;
    private String surname;
    private int age;

    public Patient(int patientId, String patientName, String patientSurname, int patientAge){
        this.id = patientId;
        this.name = patientName;
        this.surname = patientSurname;
        this.age = patientAge;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String compareAge(Patient patient){
        if(this.age == patient.age){
            return "Same age patients;";
        } else if(this.age < patient.age){
            return patient.name + " is older";
        }else {
            return this.name + " is older";
        }
    }
    public void displayInfo(){
        System.out.println("Patient ID:" + id + ", Name:" + name + ", Surname:" + surname + ", Age:" + age);
    }

}
