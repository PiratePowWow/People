import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class People {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "people.csv";
        HashMap populations = readFile(fileName);
        populations = sortByLastName(populations);
        String jsonFile = "people.json";
        System.out.println(populations);

    }

    static void outputToJson(HashMap<String, ArrayList<Person>> populations, String jsonFile) throws IOException {
        File f = new File(jsonFile);
        FileWriter fw = new FileWriter(f);


    }

    static HashMap sortByLastName(HashMap<String, ArrayList<Person>> populations){
        Set<String> keys = populations.keySet();
        String[] countries = keys.toArray(new String[populations.keySet().size()]);
        for (String country: countries){
            Collections.sort(populations.get(country));
        }

        return populations;
    }

    static HashMap readFile(String fileName) throws FileNotFoundException {
        HashMap<String, ArrayList<Person>> populations = new HashMap<>();

        File f = new File(fileName);
        Scanner fileScanner = new Scanner(f);
        String firstRow = fileScanner.nextLine();
        while (fileScanner.hasNext()){
            String[] columns = fileScanner.nextLine().split("\\,");
            Person person = new Person(Integer.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]);
            if (populations.get(columns[4])==null){
                populations.put(columns[4], new ArrayList<Person>());
            }
            populations.get(columns[4]).add(person);
        }
        return populations;
    }
}
