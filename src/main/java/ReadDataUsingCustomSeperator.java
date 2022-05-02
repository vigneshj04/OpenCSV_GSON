import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.io.IOException;
public class ReadDataUsingCustomSeperator {

    private static final String CSV_FILE_CUSTOM_SEPARATOR = "./semicolonSeparator.csv";

    public static void main(String[] args) throws IOException {

        try {
            FileReader filereader = new FileReader(CSV_FILE_CUSTOM_SEPARATOR);

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            List<String[]> records = csvReader.readAll();

            for(String[] record : records) {

                System.out.println("Name: "+ record[0]);
                System.out.println("Police Id: "+ record[1]);
                System.out.println("Precinct Number: "+ record[2]);
                System.out.println("Country: "+ record[3]);
                System.out.println("==================");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
