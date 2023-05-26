package org.picsartacademy.homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.UnaryOperator;

public class GeneralTree {
    private GeneralTreeNode root = new GeneralTreeNode();

    public GeneralTree() {
    }

    public GeneralTreeNode getRoot() {
        return root;
    }

    public int execBFS(int val) {
        System.out.println(val);
        if (root == null) {
            return 0;
        }

        Queue<GeneralTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            GeneralTreeNode current = queue.poll();

            val = current.function.apply(val);

            System.out.println(val);

            for (var child : current.children) {
                queue.offer(child);
            }
        }

        return val;
    }

    public void insert(UnaryOperator<Integer> function, int... place){}

    public static class GeneralTreeNode {
        private UnaryOperator<Integer> function;
        private final List<GeneralTreeNode> children = new LinkedList<>();

        public GeneralTreeNode() {
        }

        public UnaryOperator<Integer> getFunction() {
            return function;
        }

        public void setFunction(UnaryOperator<Integer> function) {
            this.function = function;
        }

        public List<GeneralTreeNode> getChildren() {
            return children;
        }
    }
}
