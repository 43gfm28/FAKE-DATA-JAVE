/**
 * Created by ehtra on 08.10.2017.
 */
class ParseStrings {
    private String[] cities;
    private String[] streets;
    private String[] surname;
    private String[] name;
    private String[] numbers;
    private String[] houses;

    public String[] getCities() {
        return cities;
    }

    public String[] getStreets() {
        return streets;
    }

    public String[] getSurname() {
        return surname;
    }

    public String[] getName() {
        return name;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public String[] getHouses() {
        return houses;
    }

    private String[] parseString(String inputString)
    {
        return inputString.split("\n");
    }

    public ParseStrings(DataFile dataFile) {
        cities = parseString(dataFile.getCities());
        name = parseString(dataFile.getName());
        numbers = parseString(dataFile.getNumbers());
        streets = parseString(dataFile.getStreets());
        surname = parseString(dataFile.getSurname());
        houses = parseString(dataFile.getHouses());
    }
}
