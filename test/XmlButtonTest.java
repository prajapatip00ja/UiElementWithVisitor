import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by poojap on 05/05/15.
 */
public class XmlButtonTest {

    @Test
    public void GetIdShouldGiveIdOfTheLabel(){
        XmlButton xmlButton = new XmlButton("bt1","ok");
        assertEquals(xmlButton.getId(),"bt1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheLabel(){
        XmlButton xmlButton = new XmlButton("bt1","ok");
        assertEquals(xmlButton.getText(),"ok");
    }

    @Test
    public void acceptMethodShouldReturnApropriateDroidElement(){
        XmlButton xmlButton = new XmlButton("bt1","ok");
        DroidButton droidButton = new DroidButton("bt1","ok");
        Visitor visitor = new DroidVisitor();
        assertEquals((xmlButton.accept(visitor)),droidButton);
    }

}
