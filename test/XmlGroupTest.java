import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by saylik on 05/05/15.
 */
public class XmlGroupTest {
    @Test
    public void addElementIsAddingElementsToTheList(){
        XmlGroup xmlGroup = new XmlGroup("G1");
        XmlLabel label = new XmlLabel("lb1","hello");
        xmlGroup.addElement(label);
        List<Object> elements = xmlGroup.getElements();
        for (Object element : elements) {
            assertEquals(element,label);
        }
    }

    @Test
    public void getIdIsGivingIdOfTheGroup(){
        XmlGroup xmlGroup = new XmlGroup("G1");
        assertEquals(xmlGroup.getId(),"G1");
    }

    @Test
    public void toStringIsGivingStringOfAllElements(){
        XmlGroup xmlGroup = new XmlGroup("G1");
        xmlGroup.addElement(new XmlLabel("lb1","hello"));
        assertEquals(xmlGroup.toString(),"G1"+"\t"+"lb1 hello"+"\n");
    }

    @Test
    public void acceptMethodShouldReturnAppropriateDroidElement(){
        XmlGroup xmlGroup = new XmlGroup("G1");

        DroidGroup droidGroup = new DroidGroup("G1");

        Visitor visitor = new DroidVisitor();
        assertEquals((xmlGroup.accept(visitor)).toString(), droidGroup.toString());
    }


}
