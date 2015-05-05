import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by poojap on 05/05/15.
 */
public class DroidGroupTest{
    @Test
    public void addElementIsAddingElementsToTheList(){
        DroidGroup droidGroup = new DroidGroup("G1");
        DroidLabel label = new DroidLabel("label1","hello");
        droidGroup.addElement(label);
        List<Object> elements = droidGroup.getElements();
        for (Object element : elements) {
            assertEquals(element,label);
        }
    }

    @Test
    public void getIdIsGivingIdOfTheGroup(){
        DroidGroup group = new DroidGroup("G1");
        assertEquals(group.getId(),"G1");
    }

    @Test
    public void toStringIsGivingStringOfAllElements(){
        DroidGroup droidGroup = new DroidGroup("G1");
        droidGroup.addElement(new XmlLabel("lb1","hello"));
        assertEquals(droidGroup.toString(),"G1"+"\t"+"lb1 hello"+"\n");
    }

}
