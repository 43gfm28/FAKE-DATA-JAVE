/**
 * Created by ehtra on 08.10.2017.
 */
class Numbers {
    private int[] cities;
    private int[] streets;
    private int[] surname;
    private int[] name;
    private int[] numbers;
    private int[] house;

    public int[] getCities() {
        return cities;
    }

    public int[] getStreets() {
        return streets;
    }

    public int[] getSurname() {
        return surname;
    }

    public int[] getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int[] getHouse() {
        return house;
    }

    private int[] generetedRandMass(int count, int maxValue) {
        int[] mass = new int[count];
        for (int i = 0; i < count; i++){
            mass[i] = (int) ( Math.random() * maxValue - 1 );
        }
        return mass;
   }

    public Numbers(int count, CountOfStrings countOfStrings) {
        cities = generetedRandMass(count, countOfStrings.getCities());
        name = generetedRandMass(count, countOfStrings.getName());
        numbers = generetedRandMass(count, countOfStrings.getNumbers());
        streets = generetedRandMass(count, countOfStrings.getStreets());
        surname = generetedRandMass(count, countOfStrings.getSurname());
        house = generetedRandMass(count, countOfStrings.getHouse());
    }
}
