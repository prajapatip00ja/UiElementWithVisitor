import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DroidLabelTest {
    @Test
    public void GetIdShouldGiveIdOfTheLabel(){
        DroidLabel droidLabel = new DroidLabel("label1","Hello");
        assertEquals(droidLabel.getId(),"label1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheLabel(){
        DroidLabel droidLabel = new DroidLabel("label1","Hello");
        assertEquals(droidLabel.getText(),"Hello");
    }

    @Test
    public void acceptMethodShouldReturnApropriateXmlElement(){
        DroidLabel droidLabel = new DroidLabel("label1","Hello");
       // XmlLabel xmlLabel = new XmlLabel("label1","Hello");
        Visitor visitor = new DroidVisitor();
        assertEquals((droidLabel.accept(visitor)),null);
    }

}
