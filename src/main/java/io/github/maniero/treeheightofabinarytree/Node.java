package io.github.maniero.treeheightofabinarytree;

public class Node {
    private Node left;
    private Node right;
    private int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int height() {
        if(isLastChild()) {
            return 0;
        }

        return 1 + Math.max(
                heightFor(this.left),
                heightFor(this.right)
        );
    }

    private boolean isLastChild() {
        return this.left == null && this.right == null;
    }

    public static int heightFor(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height();
    }
}
