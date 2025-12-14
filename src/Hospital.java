public class Hospital{
    private String name;
    private String location;

    public Hospital(String hospitalName, String hospitalLocation){
        this.name = hospitalName;
        this.location = hospitalLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayinfo() {
        System.out.println("Hospital Name:" + name + ", Location:" + location);
    }
}
