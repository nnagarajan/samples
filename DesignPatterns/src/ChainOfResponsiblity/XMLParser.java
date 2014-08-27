package ChainOfResponsiblity;

/**
 * Created by Naveen on 8/25/14.
 */
public class XMLParser extends Parser {


    @Override
    public void parse(String fileName) {
        if (canHandleFile(fileName, ".xml")) {
            System.out.println("Handling XML Type for file " + fileName);
        } else {
            super.parse(fileName);
        }

    }
}
