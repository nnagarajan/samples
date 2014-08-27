package ChainOfResponsiblity;

/**
 * Created by Naveen on 8/24/14.
 */
public class Parser {

    private Parser sucessor;

    public Parser getSucessor() {
        return sucessor;
    }

    public void setSucessor(Parser sucessor) {
        this.sucessor = sucessor;
    }


    public void parse(String fileName) {
        if (sucessor != null) {
            sucessor.parse(fileName);
        } else {
            System.out.println("Unable to find the correct parser for the type" + fileName);
        }

    }

    protected boolean canHandleFile(String fileName, String format) {
        return (fileName != null && fileName.endsWith(format));

    }


}
