import java.util.ArrayList;
import java.util.List;

/**
 * Created by saylik on 05/05/15.
 */
public class DroidGroup extends ViewElement{
    private  String id;
    private List<Object> elements;

    public DroidGroup(String id){
        this.id = id;
        this.elements = new ArrayList<Object>();
    }

    public void addElement(Object element){
        elements.add(element);
    }
    @Override
    public  String toString(){
        String s = id+"\t";
        for (Object element : elements) {
            s = s+element+"\n";
        }
        return s;
    }

    @Override
    public ViewElement accept(Visitor visitor) {
        return null;
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
