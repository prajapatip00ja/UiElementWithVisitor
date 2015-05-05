/**
 * Created by saylik on 04/05/15.
 */
public class XmlButton extends ViewElement {

    private String id;
    private String text;
    public XmlButton(String id, String text) {
        this.id= id;
        this.text = text;
    }

    @Override
    public ViewElement accept(Visitor visitor) {
        return visitor.visit(this) ;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof XmlButton)) return false;

        XmlButton xmlButton = (XmlButton) o;

        if (!id.equals(xmlButton.id)) return false;
        if (!text.equals(xmlButton.text)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + text.hashCode();
        return result;
    }
}
