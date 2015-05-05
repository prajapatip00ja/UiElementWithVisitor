import java.util.List;

/**
 * Created by saylik on 04/05/15.
 */
public class Transformer {
    private Visitor visitor;

    public Transformer( Visitor visitor) {
        this.visitor = visitor;
    }

    public ViewElement transform(ViewElement viewElement){
        if(viewElement instanceof  XmlGroup){
            ViewElement droidElement = viewElement.accept(visitor);
            List<Object> elements = ((XmlGroup)viewElement).getElements();
            for (Object element : elements) {
                ((DroidGroup)droidElement).addElement(transform((ViewElement)element));
            }
            return droidElement;
        }
        return viewElement.accept(visitor);
    }



}
