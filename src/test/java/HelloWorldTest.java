import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test(groups = {"SMOKE"})
    public void helloWorld(){
        System.out.println("Hello World");
    }
}
