class Plant {
    private String name;
    public Plant(String name) {this.name = name;}
    @Override
    public String toString() {return name;}
}

class Tree extends Plant implements Comparable<Tree> {
    private double height;

    public Tree(String name, double height) {
        super(name);
        this.height = height;
    }

    public double getHeight() {return height;}

    @Override
    public int compareTo(Tree o) {
        return Double.compare(this.height, o.height);
    }
    @Override
    public String toString() {
        return super.toString() + " (wysokość: "+ height + "m)";
    }
}
