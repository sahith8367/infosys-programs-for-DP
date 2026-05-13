package com.example.springboot.learning.basics.Example06;
// this is for Pre Order which is Root Left Right
public class info02 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int index =-1;
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
    public static void preOrder(Node node){
        if(node==null)
            return;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }
//                 1
//              2     3
//            4   5     6
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node =binaryTree(nodes);
        preOrder(node);
    }
}
