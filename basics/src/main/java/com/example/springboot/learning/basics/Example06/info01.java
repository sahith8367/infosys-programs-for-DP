package com.example.springboot.learning.basics.Example06;

import java.util.PriorityQueue;
import java.util.Queue;

// tree implementation ;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class info01 {

    static int index = -1;
    public static Node binaryTree(int[] nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left=binaryTree(nodes);
        newNode.right=binaryTree(nodes);
        return newNode;
    }
    public static void preOrder(Node node){//pre order root left right
        if(node==null){
            return;
        }
        System.out.print(" : "+node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node = binaryTree(nodes);
        preOrder(node);
    }
}
