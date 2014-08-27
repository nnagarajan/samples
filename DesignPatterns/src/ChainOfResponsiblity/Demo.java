package ChainOfResponsiblity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveen on 8/25/14.
 */
public class Demo {

    private static List<String> buildFiles() {
        List<String> fileList = new ArrayList<String>();
        fileList.add("someFile.txt");
        fileList.add("otherFile.json");
        fileList.add("xmlFile.xml");
        fileList.add("csvFile.csv");
        fileList.add("csvFile.doc");

        return fileList;
    }

    public static void main(String[] args) {

        List<String> files = buildFiles();

        XMLParser xmlParser = new XMLParser();
        JsonParser jsonParser = new JsonParser(xmlParser);
        CSVParser csvParser = new CSVParser(jsonParser);
        TextParser textParser = new TextParser(csvParser);


        for (String fileName : files) {
            textParser.parse(fileName);
        }

    }
}
