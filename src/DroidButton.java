/**
 * Created by saylik on 04/05/15.
 */
public class DroidButton extends ViewElement{

    private String id;
    private String text;

    public DroidButton(String id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public ViewElement accept(Visitor visitor) {
        return null;
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
    public String toString() {
        return id+" "+text;
    }
}
