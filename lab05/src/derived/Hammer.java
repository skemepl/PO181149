package derived;

import base.WorkTool;

public class Hammer extends WorkTool {
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println("Tool: " + name + " Year: " + productionYear);
    }
}
