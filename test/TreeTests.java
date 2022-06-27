import BOSE_LAB_8.Node;
import BOSE_LAB_8.Tree;
import BOSE_Lab9.Radio;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TreeTests {
    @Test
    public void testEmptyTree() {
        Tree testTree = new Tree();
        Assert.assertEquals(0, testTree.get_levels().size());
    }

    @Test
    public void testVolume() {
        Tree testTree = new Tree();
        testTree.addValue(1);
        Node n = new Node(1);
        LinkedList<LinkedList<Node>> testLL = new LinkedList<>();
        testLL.add(new LinkedList<Node>());
        testLL.get(testLL.size() - 1).add(n);
        Assert.assertEquals(testLL, testTree.get_levels());
    }

    @Test
    public void testLeft() {
        Tree testTree = new Tree();
        testTree.addValue(5);
        testTree.addValue(4);
        testTree.addValue(3);
        testTree.addValue(2);
        testTree.addValue(1);
        LinkedList<LinkedList<Node>> testLL = new LinkedList<>();
        for(int i = 5; i > 0; i--){
            testLL.add(new LinkedList<Node>());
            testLL.get(testLL.size() - 1).add(new Node(i));
        }
        Assert.assertEquals(testLL, testTree.get_levels());
    }

    @Test
    public void testRight() {
        Tree testTree = new Tree();
        testTree.addValue(1);
        testTree.addValue(2);
        testTree.addValue(3);
        testTree.addValue(4);
        testTree.addValue(5);
        LinkedList<LinkedList<Node>> testLL = new LinkedList<>();
        for(int i = 1; i <= 5; i++){
            testLL.add(new LinkedList<Node>());
            testLL.get(testLL.size() - 1).add(new Node(i));
        }
        Assert.assertEquals(testLL, testTree.get_levels());
    }

}