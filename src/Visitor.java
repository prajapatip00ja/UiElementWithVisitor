/**
 * Created by saylik on 04/05/15.
 */
public abstract class Visitor {
    public abstract DroidLabel visit(XmlLabel xmlLabel);
    public abstract DroidButton visit(XmlButton xmlButton);
    public abstract DroidGroup visit(XmlGroup xmlGroup);
}
