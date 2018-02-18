import java.io.IOException;

/**
 * Created by ehtra on 08.10.2017.
 */
public class Main {

    private static void printStrings(ParseStrings parseStrings, Numbers numbers, int count) {
        for(int i = 0; i < count; i++){
            System.out.print(parseStrings.getCities()[numbers.getCities()[i]]);
            System.out.print(",");
            System.out.print(parseStrings.getStreets()[numbers.getStreets()[i]]);
            System.out.print(",");
            System.out.print(parseStrings.getHouses()[numbers.getHouse()[i]]);
            System.out.print(",");
            System.out.print(parseStrings.getSurname()[numbers.getSurname()[i]]);
            System.out.print(",");
            System.out.print(parseStrings.getName()[numbers.getName()[i]]);
            System.out.print(",");
            System.out.print(parseStrings.getNumbers()[numbers.getNumbers()[i]]);
            System.out.println();
        }
    }

    public static void main (String args[]){
        try {
            // long start = System.currentTimeMillis();
            CommandArgs cmdArgs = new CommandArgs(args);
            DataFile data = new DataFile(cmdArgs.getLocale());
            ParseStrings parseStrings = new ParseStrings(data);
            CountOfStrings countOfStrings = new CountOfStrings(parseStrings);
            Numbers numbers = new Numbers(cmdArgs.getCount(), countOfStrings);
            printStrings(parseStrings, numbers, cmdArgs.getCount());

            //long finish = System.currentTimeMillis();
            //long timeConsumedMillis = finish - start;
            //System.out.println(timeConsumedMillis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}