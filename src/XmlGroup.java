import java.util.ArrayList;
import java.util.List;

/**
 * Created by saylik on 05/05/15.
 */
public class XmlGroup extends ViewElement{
    private String id;
    private List<Object> elements;

    public XmlGroup(String id){
        this.id = id;
        this.elements = new ArrayList<Object>();
    }

    public void addElement(Object element){
        elements.add(element);
    }

    public  String toString(){
        String s = id+"\t";
        for (Object element : elements) {
            s = s+element+"\n";
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        XmlGroup xmlGroup = (XmlGroup) o;
        return id.equals(xmlGroup.getId());
    }



    @Override
    public ViewElement accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public String getId(){
        return id;
    }

    @Override
    public String getText() {
        return null;
    }

    public List<Object> getElements() {
        return elements;
    }
}
