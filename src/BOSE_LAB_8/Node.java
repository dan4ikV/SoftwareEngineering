package BOSE_LAB_8;

import java.util.Objects;

public class Node {
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public void placeValue(int value) {
        if (value >= this.value) {
            if (right == null) {
                right = new Node(value);
            } else {
                right.placeValue(value);
            }
        } else {
            if (left == null) {
                left = new Node(value);
            } else {
                left.placeValue(value);
            }
        }
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value;
    }
}
