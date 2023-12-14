/*
 * Name: Elaf Yousef Aloufi
 * ID: 1911265
 * Section: CAR
 * Lab Activity #03
 */

public class IT extends Company {

    private int number_of_devices;
    private String projects;
    Database x;

    public IT() {
        x = Database.getInstance();

    }

    public int getNumber_of_devices() {
        return number_of_devices;
    }

    public String getProjects() {
        return projects;
    }

    public Database getX() {
        return x;
    }

    public void setNumber_of_devices(int number_of_devices) {
        this.number_of_devices = number_of_devices;
    }

    public void setProjects(String projects) {
        this.projects = projects;
    }

    public void setX(Database x) {
        this.x = x;
    }

}
