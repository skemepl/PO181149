package base;

public abstract class WorkTool {
    protected String name;
    protected int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public abstract void use();
}
