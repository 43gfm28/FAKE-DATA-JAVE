/**
 * Created by ehtra on 08.10.2017.
 */
class CountOfStrings {
    private int cities;
    private int streets;
    private int surname;
    private int name;
    private int numbers;
    private int house;

    public int getCities() {
        return cities;
    }

    public int getStreets() {
        return streets;
    }

    public int getSurname() {
        return surname;
    }

    public int getName() {
        return name;
    }

    public int getNumbers() {
        return numbers;
    }

    public int getHouse() {
        return house;
    }

    private int countMass(String[] mass){
        return mass.length;
    }

    public CountOfStrings(ParseStrings parseStrings){
        cities = countMass(parseStrings.getCities());
        name = countMass(parseStrings.getName());
        numbers = countMass(parseStrings.getNumbers());
        streets = countMass(parseStrings.getStreets());
        surname = countMass(parseStrings.getSurname());
        house = countMass(parseStrings.getHouses());
    }
}
