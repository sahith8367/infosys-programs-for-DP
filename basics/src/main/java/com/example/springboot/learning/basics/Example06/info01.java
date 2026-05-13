package com.example.springboot.learning.basics.Example06;

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
class tree{
    Node root;
    public void insert(int data){
        Node newNode = new Node(data);
        if(root==null)
            root = newNode;
        else{
            if(root.data>data){
                root.left=insert();
            }
        }
    }
}
public class info01 {
    public static void main(String[] args) {
    }
}
