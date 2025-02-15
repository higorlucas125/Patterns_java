package PatternsStructural.LearningFlyweight.forest;

import PatternsStructural.LearningFlyweight.trees.Tree;
import PatternsStructural.LearningFlyweight.trees.TreeFactory;
import PatternsStructural.LearningFlyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData){
        TreeType treeType = TreeFactory.getTreeType(name,color,otherTreeData);
//        TreeType treeType = new TreeType(name,color,otherTreeData); -- COM O USO DE FLyweight diminuiu 38% o uso de memoria.
        Tree tree = new Tree(x,y,treeType);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics){
        for(Tree tree: trees){
            tree.draw(graphics);
        }
    }
}
