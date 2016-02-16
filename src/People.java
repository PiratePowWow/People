import java.io.File;
import java.io.FileNotFoundException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {

    }

    static HashMap readFile(String fileName) throws FileNotFoundException, UnknownHostException {
        HashMap<String, ArrayList<Person>> populations = new HashMap<>();

        File f = new File(fileName);
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()){
            String[] columns = fileScanner.nextLine().split("\\,");
            Person person = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], InetAddress.getAllByName(columns[5]));
            if (populations.get(columns[4])==null){
                populations.put(columns[4], new ArrayList<Person>());
            }
            populations.get(columns[4]).add(person);
        }
        return populations;
    }
}
