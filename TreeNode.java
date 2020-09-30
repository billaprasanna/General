package com.paypal.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {

    static class Node {
        int value;
        Node left, right;

        Node(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            }
            else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of "
                        + node.value);
                node.right = new Node(value);
            }
        }
    }
    public static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public static boolean containsElement(Node node, int value) {
        if(node==null){
            return false;
        }
        if(value == node.value){
            return true;
        }
        return value <node.value ? containsElement(node.left, value) : containsElement(node.right, value);
    }

    public static void DFS(Node node) {

        if(node==null){
            System.out.println("Empty tree");
        }
        else {
            Queue<Node> queue = new LinkedList();
            queue.add(node);
            while (queue.size()>0) {
                Node temp = queue.remove();
                if(temp!=null){
                System.out.print(temp.value);
                if (node.left != null) {
                    queue.add(temp.left);
                }
                if (node.right != null) {
                    queue.add(temp.right);
                }
            }
        }}
    }


    public static void main(String args[])
    {
        TreeNode tree = new TreeNode();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
        System.out.println();
        DFS(root);
        System.out.println();
        System.out.println(containsElement(root, 67));
        List list = new ArrayList<String>();

    }

}
