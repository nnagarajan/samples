package ChainOfResponsiblity;

/**
 * Created by Naveen on 8/24/14.
 */
public class JsonParser extends Parser {

    public JsonParser(Parser successor) {
        this.setSucessor(successor);

    }

    @Override
    public void parse(String fileName) {
        if (canHandleFile(fileName, ".json")) {
            System.out.println("Handling JSON Type for file " + fileName);
        } else {
            super.parse(fileName);
        }

    }

}
