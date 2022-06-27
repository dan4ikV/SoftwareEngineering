package BOSE_LAB_8;

import java.util.LinkedList;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public boolean addValue(int val){
        try {
            if(root == null){
                root = new Node(val);
            }
            else {
                root.placeValue(val);
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public LinkedList get_levels(){
        LinkedList<LinkedList<Node>> allNodes = new LinkedList<>();
        if(root == null){
            return allNodes;
        }
        LinkedList<Node> newNodes = new LinkedList<>();
        LinkedList<Node> oldNodes = new LinkedList<>();
        oldNodes.add(root);
        do {
            newNodes = new LinkedList<>();
            allNodes.add(oldNodes);
            for (Node node : allNodes.get(allNodes.size() - 1)) {
                System.out.println(node);
                if (node.getLeft() != null) {
                    newNodes.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    newNodes.add(node.getRight());
                }
            }
            oldNodes = newNodes;
        }
        while (!newNodes.isEmpty());
        return allNodes;
    }
}
