
public class DroidVisitor extends Visitor{
    @Override
    public DroidLabel visit(XmlLabel label) {
        return new DroidLabel(label.getId(),label.getText());
    }

    @Override
    public DroidButton visit(XmlButton xmlButton) {
        return new DroidButton(xmlButton.getId(),xmlButton.getText());
    }

    @Override
    public DroidGroup visit(XmlGroup xmlGroup) {
        return new DroidGroup(xmlGroup.getId());
    }
}
