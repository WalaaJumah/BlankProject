package files_reader;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class XmlReader {
    public static String getXMLData(String dataFor) {
        String nodeValue;
        try {
            File file = new File("src/test/resources/ConfigFiles/TestData.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            org.w3c.dom.Document document = documentBuilder.parse(file);
            nodeValue = document.getElementsByTagName(dataFor).item(0).getTextContent();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return nodeValue;
    }

    public static String getXMLDataFromFile(String dataFor, String filePath) {
        String nodeValue;
        try {
            File file = new File(filePath);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            org.w3c.dom.Document document = documentBuilder.parse(file);
            nodeValue = document.getElementsByTagName(dataFor).item(0).getTextContent();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return nodeValue;
    }

    public static ArrayList<String> getChildNodeValuesAsArray(String dataFor) {

        ArrayList<String> array = new ArrayList<>();
        try {
            File file = new File("src/test/resources/TestData.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            org.w3c.dom.Document document = documentBuilder.parse(file);

            Node parentNode = document.getElementsByTagName(dataFor).item(0);
            NodeList childNodeList = parentNode.getChildNodes();

            for (int i = 0; i < childNodeList.getLength(); i++) {
                Node n = childNodeList.item(i);
                if (n.getNodeType() == Node.ELEMENT_NODE) {
                    array.add(n.getTextContent());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return array;
    }
}
