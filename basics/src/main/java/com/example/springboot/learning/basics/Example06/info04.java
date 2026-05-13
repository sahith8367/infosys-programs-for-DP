package com.example.springboot.learning.basics.Example06;
// postorder traversal
public class info04 {
    static class Node{
        int data ;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static int index=-1;
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
    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);

    }
//                 1
//              2     3
//            4   5     6
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node = binaryTree(nodes);
        postOrder(node);
    }
}
