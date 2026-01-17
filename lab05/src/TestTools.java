import base.WorkTool;
import derived.Hammer;
import derived.Saw;
import derived.Screwdriver;

public class TestTools {
    public static void main(String[] args) {
        WorkTool hammer = new Hammer("hammer", 2020);
        WorkTool screwdriver = new Screwdriver("screwdriver", 2023);
        WorkTool saw = new Saw("saw", 1998);

        hammer.use();
        screwdriver.use();
        saw.use();
    }
}
