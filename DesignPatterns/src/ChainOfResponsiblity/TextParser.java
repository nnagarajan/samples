package ChainOfResponsiblity;

/**
 * Created by Naveen on 8/25/14.
 */
public class TextParser extends Parser {

    public TextParser(Parser successor) {
        this.setSucessor(successor);

    }

    @Override
    public void parse(String fileName) {
        if (canHandleFile(fileName, ".txt")) {
            System.out.println("Handling Text Type for file " + fileName);
        } else {
            super.parse(fileName);
        }

    }
}
