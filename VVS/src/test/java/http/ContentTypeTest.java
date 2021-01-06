package http;

import http.ContentType;
import org.junit.Assert;
import org.junit.Test;

public class ContentTypeTest {


    @Test
    public void getCorrectContentTypeByExtension() {
        Assert.assertEquals(ContentType.CSS, ContentType.valueOf("CSS"));
        Assert.assertEquals(ContentType.GIF, ContentType.valueOf("GIF"));
        Assert.assertEquals(ContentType.HTM, ContentType.valueOf("HTM"));
        Assert.assertEquals(ContentType.HTML, ContentType.valueOf("HTML"));
        Assert.assertEquals(ContentType.ICO, ContentType.valueOf("ICO"));
        Assert.assertEquals(ContentType.JPG, ContentType.valueOf("JPG"));
        Assert.assertEquals(ContentType.JPEG, ContentType.valueOf("JPEG"));
        Assert.assertEquals(ContentType.PNG, ContentType.valueOf("PNG"));
        Assert.assertEquals(ContentType.TXT, ContentType.valueOf("TXT"));
        Assert.assertEquals(ContentType.XML, ContentType.valueOf("XML"));
    }

    /*
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.CSS, ContentType.valueOf("CSS"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.GIF, ContentType.valueOf("GIF"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.HTM, ContentType.valueOf("HTM"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.HTML, ContentType.valueOf("HTML"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.ICO, ContentType.valueOf("ICO"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.JPG, ContentType.valueOf("JPG"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.JPEG, ContentType.valueOf("JPEG"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.PNG, ContentType.valueOf("PNG"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.TXT, ContentType.valueOf("TXT"));
    }
    @Test
    public void GetCorrectCSSContentTypeByExtension(){
        Assert.assertEquals(ContentType.XML, ContentType.valueOf("XML"));
    }
    */

}
