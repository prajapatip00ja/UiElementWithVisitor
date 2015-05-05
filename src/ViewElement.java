/**
 * Created by saylik on 04/05/15.
 */
public abstract class ViewElement {
    public abstract ViewElement accept(Visitor visitor);
    public abstract String getId();
    public abstract String getText();
}
