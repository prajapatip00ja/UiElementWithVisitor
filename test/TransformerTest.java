import org.junit.Test;


import static junit.framework.Assert.assertEquals;

public class TransformerTest {
    @Test
    public void xmlLabelShouldTransformToDroidLabel(){
        ViewElement label = new XmlLabel("label1","Hello");
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        ViewElement result = transformer.transform(label);
        DroidLabel droidlabel = (DroidLabel)result;
        assertEquals(droidlabel.toString(),"label1 Hello");
    }

    @Test
    public void xmlButtonShouldTransformToDroidButton(){
        ViewElement button = new XmlButton("bt1","Hello");
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        ViewElement result = transformer.transform(button);
        DroidButton droidbutton = (DroidButton)result;
        assertEquals(droidbutton.toString(),"bt1 Hello");
    }

    @Test
    public void transformMethodShouldTransformXmlGroupToDroidGroup(){
        ViewElement group = new XmlGroup("g1");
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        ViewElement button = new XmlButton("bt1","ok");
        ViewElement label = new XmlLabel("label1","Hello");
        ((XmlGroup)group).addElement(label);
        ((XmlGroup)group).addElement(button);
        ViewElement result = transformer.transform(group);
        DroidGroup droidGroup = (DroidGroup)result;
        assertEquals(droidGroup.toString(), "g1" + "\t" + "label1 Hello" + "\n" + "bt1 ok" + "\n");
    }

    @Test
    public void transformMethodShouldTransformXmlGroupToDroidGroupWhichIsHavingAnotherGroup(){
        ViewElement xmlGroup1 = new XmlGroup("g1");
        ViewElement xmlGroup2 = new XmlGroup("g2");
        Visitor visitor = new DroidVisitor();
        Transformer transformer = new Transformer(visitor);
        ViewElement label1 = new XmlLabel("label1","Hello");
        ViewElement label2 = new XmlLabel("label2","Hello");
        ViewElement button1 = new XmlButton("bt1","ok");
        ViewElement button2 = new XmlButton("bt2","ok");
        ((XmlGroup)xmlGroup1).addElement(label1);
        ((XmlGroup)xmlGroup2).addElement(label2);
        ((XmlGroup)xmlGroup1).addElement(button1);
        ((XmlGroup)xmlGroup2).addElement(button2);
        ((XmlGroup)xmlGroup1).addElement(xmlGroup2);
        ViewElement group = transformer.transform(xmlGroup1);
        DroidGroup droidGroup = (DroidGroup)group;
        assertEquals(droidGroup.toString(),"g1"+"\t"+"label1 Hello"+"\n"+"bt1 ok"+"\n"+"g2"+"\t"+"label2 Hello"+"\n"+"bt2 ok\n"+"\n");
    }

}
