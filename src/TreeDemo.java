import examples.trees.Forest;

import java.awt.*;

public class TreeDemo {
    final static int CANVAS_SIZE = 500;
    final static int TREES_TO_DRAW = 1000000;
    final static int TREE_TYPES = 2;

    public static void main(String[] args) {
//        generateTrees();
        generateTreesFlyweight();
    }

    public static void generateTreesFlyweight(){
        Forest forest = new Forest(true);
        for (int i = 0; i < Math.floor((double) TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println();
    }

    public static void generateTrees(){
        Forest forest = new Forest(false);
        for (int i = 0; i < Math.floor((double) TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.addTree(random(CANVAS_SIZE), random(CANVAS_SIZE), "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
    }
    private static int random(int max) {
        return (int) (0 + Math.random() * (max+ 1));
    }
}
