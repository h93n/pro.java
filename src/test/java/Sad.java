import org.junit.Assert;
import org.junit.Test;

public class Sad {
    @Test
    public void getUrlTest() {
        Flower flower = new Flower("C:\\Users\\user\\Desktop\\chromedriver.exe");
        Assert.assertEquals(flower.firstest(), "http://demo.automationtesting.in/");

    }
        @Test
                public void getUrlTitle() {
            Flower flower2 = new Flower("C:\\Users\\user\\Desktop\\chromedriver.exe");
            Assert.assertEquals(flower2.secondtest(), "http://demo.automationtesting.in/Register.html");


        }


}

