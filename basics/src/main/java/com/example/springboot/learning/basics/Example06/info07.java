package com.example.springboot.learning.basics.Example06;

import java.util.*;

public class info07 {
    class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    int index =-1;
    public Node binaryTree(int[] nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = binaryTree(nodes);
        newNode.right = binaryTree(nodes);
        return newNode;
    }
    public void levelOrder(Node node){
        if(node==null)
            return;
        Deque<Node> dq = new LinkedList<>();
        dq.offer(node);
        Boolean flag = false;
        while(!dq.isEmpty()){
            int size = dq.size();
            for(int i=0;i<size;i++){
                if(!flag){
                    Node currNode = dq.removeFirst();
                    System.out.print(currNode.data+ " ");
                    if(currNode.left!=null)
                        dq.offer(currNode.left);
                    if(currNode.right!=null)
                        dq.offer(currNode.right);
                }else{
                    Node currNode = dq.removeLast();
                    System.out.print(currNode.data +" ");
                    if(currNode.right!=null)
                        dq.addFirst(currNode.right);
                    if(currNode.left!=null)
                        dq.addFirst(currNode.left);
                }
            }
            flag=!flag;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node =new info07().binaryTree(nodes);
        new info07().levelOrder(node);
    }
}
