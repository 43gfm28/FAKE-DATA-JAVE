import java.io.*;

/**
 * Created by ehtra on 08.10.2017.
 */
class DataFile {
    private String cities;
    private String streets;
    private String surname;
    private String name;
    private String numbers;
    private String houses;

    public String getCities() {
        return cities;
    }

    public String getStreets() {
        return streets;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getNumbers() {
        return numbers;
    }

    public String getHouses() {
        return houses;
    }

    private String readFile(String nameOfFile) throws IOException {

        StringBuilder readData = new StringBuilder();

        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(nameOfFile)))) {
            String s;
            while ((s = in.readLine()) != null) {
                readData.append(s);
                readData.append("\n");
            }
        }

        return readData.toString();
    }

    public DataFile(String locale) throws IOException {
        cities = readFile(locale + "_cities.txt");
        streets = readFile(locale + "_streets.txt");
        surname = readFile(locale + "_surname.txt");
        name = readFile(locale + "_name.txt");
        numbers = readFile(locale + "_numbers.txt");
        houses = readFile(locale + "_house.txt");
    }
}
