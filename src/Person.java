import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.Comparator;

/**
 * Created by PiratePowWow on 2/15/16.
 */
public class Person implements Comparable{
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String ip;

    public Person(){

    }

    public Person(int id, String firstName, String lastName, String email, String country, String ip) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.ip = ip;
    }

    @Override
    public int compareTo(Object o){
        Person p = (Person) o;
        return lastName.compareTo(p.lastName);
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " from " + this.country + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
