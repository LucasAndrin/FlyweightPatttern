package examples.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType type = treeTypes.get(name);
        if (type == null) {
            type = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, type);
        }
        return type;
    }
}
