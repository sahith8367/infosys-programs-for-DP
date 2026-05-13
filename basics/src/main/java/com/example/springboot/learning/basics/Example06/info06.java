package com.example.springboot.learning.basics.Example06;

public class info06 {
    class Node{
        int data;
        Node left;
        Node rigth;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.rigth=null;
        }}
        int index = -1;
        public Node binaryTree(int[] nodes){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            System.out.println(newNode.data +" added ");
            newNode.left=binaryTree(nodes);
            newNode.rigth=binaryTree(nodes);
            return newNode;
        }
        public int countNodes(Node node){
            if(node==null)
                return 0;
            int left = countNodes(node.left);
            int right =countNodes(node.rigth);
            return left+right+1;
        }
        public int sumNodes(Node node){
            if(node==null)
                return 0;
            int root = node.data;
            int left = sumNodes(node.left);
            int right = sumNodes(node.rigth);
            return root+left+right;
        }
        public int heiht(Node node){
            if(node==null)
                return 0;
            int left = heiht(node.left);
            int right = heiht(node.rigth);
            return Math.max(left+1,right+1);
        }
        public static void main(String[] args){
            int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            info06 obj = new info06();
            Node node = obj.binaryTree(nodes);
            System.out.println("Count of total Node : "+obj.countNodes(node));
            System.out.println("Sum of All Nodes : "+obj.sumNodes(node));
            System.out.println("Height of the Tree : "+obj.heiht(node));
    }
}
