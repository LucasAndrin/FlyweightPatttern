import examples.trees.Forest;

import java.awt.*;

public class TreeDemo {
    final static int CANVAS_SIZE = 500;
    final static int TREES_TO_DRAW = 1000000;
    final static int TREE_TYPES = 2;

    public static void main(String[] args) {
//        generateTrees(true);
        generateTrees(false);
    }

    public static void generateTrees(boolean useFlyweight) {
        Forest forest = new Forest(useFlyweight);
        for (int i = 0; i < Math.floor((double) TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "GREEN", Color.GREEN, "Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "ORANGE", Color.ORANGE, "Autumn Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "RED", Color.RED, "Autumn Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "BLUE", Color.BLUE, "Autumn Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "CYAN", Color.CYAN, "Autumn Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "DARK_GRAY", Color.DARK_GRAY, "Autumn Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "MAGENTA", Color.MAGENTA, "Autumn Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "YELLOW", Color.YELLOW, "Autumn Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        long memory = Memory.getMemoryUsage();
        System.out.println(memory + " Bytes");
        System.out.println(Memory.convertToMegabyte(memory) + " MegaBytes");
    }
    private static int random(int max) {
        return (int) (0 + Math.random() * (max+ 1));
    }
}
