public class XmlLabel extends ViewElement {

    private String id;
    private String text;

    public XmlLabel(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }


    @Override
    public boolean equals(Object o) {

        XmlLabel xmlLabel = (XmlLabel) o;

        if (!id.equals(xmlLabel.id)) return false;
        if (!text.equals(xmlLabel.text)) return false;

        return true;
    }

    @Override
    public String toString() {
        return id+" "+text;
    }

    @Override
    public ViewElement accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
