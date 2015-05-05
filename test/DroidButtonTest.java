import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by poojap on 05/05/15.
 */
public class DroidButtonTest{
    @Test
    public void GetIdShouldGiveIdOfTheLabel(){
        DroidButton droidButton = new DroidButton("bt1","ok");
        assertEquals(droidButton.getId(),"bt1");
    }

    @Test
    public void GetIdShouldGiveTextOfTheLabel(){
        DroidButton droidButton = new DroidButton("bt1","ok");
        assertEquals(droidButton.getText(),"ok");
    }

}
