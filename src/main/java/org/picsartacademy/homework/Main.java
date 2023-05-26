package org.picsartacademy.homework;

public class Main {
    public static void main(String[] args) {
        GeneralTree generalTree = new GeneralTree();
        GeneralTree.GeneralTreeNode root = generalTree.getRoot();

        root.setFunction(x -> x * x);
        root.getChildren().add(new GeneralTree.GeneralTreeNode());
        root.getChildren().add(new GeneralTree.GeneralTreeNode());
        root.getChildren().get(0).setFunction(x -> x / 10);
        root.getChildren().get(1).setFunction(x -> 1 - x);
        root.getChildren().get(1).getChildren().add(new GeneralTree.GeneralTreeNode());
        root.getChildren().get(1).getChildren().get(0).setFunction(x -> x);

        System.out.println(generalTree.execBFS(13));

        generalTree.insert(x -> x * x, 1, 1, 1, 2);
    }
}