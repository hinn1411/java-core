import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

class OcrData {

}

public class List {
    public static void main(String[] args) {
        java.util.List arrayList = new ArrayList();
        java.util.List linkedList = new LinkedList();
        java.util.List vector = new Vector();
        java.util.List stack = new Stack();

        arrayList.add("Hien");
        arrayList.add(0, "Giang");
        System.out.println(arrayList.toString());
        java.util.List<OcrData> ocrsData = new ArrayList<OcrData>();
        ocrsData.add(new OcrData());
        for (OcrData ocrData: ocrsData) {

        }
    }
}
