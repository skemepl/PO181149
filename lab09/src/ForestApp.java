public class ForestApp {
    public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result){
        if(trees == null || trees.length == 0) return;

        Tree min = trees[0];
        Tree max = trees[0];

        for(Tree t : trees){
            if(t.compareTo(min) < 0) min = t;
            if(t.compareTo(max) > 0) max = t;
        }
        result.setFirst(min);
        result.setSecond(max);
    }
    public static void main(String[] args) {
        Tree[] forest = {
                new Tree("Dąb", 15.5),
                new Tree("Sosna", 22.0),
                new Tree("Brzoza", 10.2),
                new Tree("Świerk", 34.4)
        };

        Pair<Tree> treeResult = new Pair<>();
        findMinMaxHeight(forest, treeResult);
        System.out.println("Wynik: " + treeResult);
    }
}
