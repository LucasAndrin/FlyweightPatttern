package examples.trees;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<TreeI> trees = new ArrayList<>();
    public boolean is_flyweight;

    public Forest(boolean is_flyweight){
        this.is_flyweight = is_flyweight;
    }

    public void addTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        TreeI tree;
        if (is_flyweight) {
            tree = new Tree(x, y, type);
        } else {
            tree = new TreeNoFly(x,y,name,color,otherTreeData);
        }
        trees.add(tree);
    }

    public void paint(Graphics graphics) {
        for (TreeI tree : trees) {
            tree.draw(graphics);
        }
    }
}
