import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class XmlLabelTest {
    @Test
    public void GetIdShouldGiveIdOfTheLabel(){
        XmlLabel xmlLabel = new XmlLabel("label1","Hello");
        assertEquals(xmlLabel.getId(),"label1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheLabel(){
        XmlLabel xmlLabel = new XmlLabel("label1","Hello");
        assertEquals(xmlLabel.getText(),"Hello");
    }

    @Test
    public void acceptMethodShouldReturnApropriateDroidElement(){
        XmlLabel xmlLabel = new XmlLabel("label1","Hello");
        DroidLabel droidLabel = new DroidLabel("label1","Hello");
        Visitor visitor = new DroidVisitor();
        assertEquals((xmlLabel.accept(visitor)),droidLabel);
    }
}
