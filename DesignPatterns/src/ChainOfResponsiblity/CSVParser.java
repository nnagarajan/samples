package ChainOfResponsiblity;

/**
 * Created by Naveen on 8/25/14.
 */
public class CSVParser extends Parser {
    public CSVParser(Parser successor) {
        this.setSucessor(successor);

    }

    @Override
    public void parse(String fileName) {
        if (canHandleFile(fileName, ".csv")) {
            System.out.println("Handling CSV Type for file " + fileName);
        } else {
            super.parse(fileName);
        }

    }
}
