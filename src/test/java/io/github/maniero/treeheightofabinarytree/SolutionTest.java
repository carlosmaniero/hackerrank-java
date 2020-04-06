package io.github.maniero.treeheightofabinarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void nullReturnZero() {
        assertEquals(0, Solution.height(null));
    }

    @Test
    void rootOnlyReturnZero() {
        assertEquals(0, Solution.height(new Node(10)));
    }

    @Test
    void returnsTheLeftSum() {
        Node left2 = new Node(10);
        Node left1 = new Node(10, left2, null);
        Node root = new Node(10, left1, null);
        assertEquals(2, Solution.height(root));
    }

    @Test
    void returnsTheRightSum() {
        Node right2 = new Node(10);
        Node right1 = new Node(10, null, right2);
        Node root = new Node(10, null, right1);
        assertEquals(2, Solution.height(root));
    }

    @Test
    void returnsTheBiggestSum() {
        Node right2 = new Node(10);
        Node right1 = new Node(10, null, right2);
        Node root = new Node(10, new Node(10), right1);
        assertEquals(2, Solution.height(root));
    }
}
