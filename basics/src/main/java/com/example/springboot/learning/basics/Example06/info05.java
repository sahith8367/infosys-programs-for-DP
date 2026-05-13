package com.example.springboot.learning.basics.Example06;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class info05 {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static int index =-1;
    public static Node binaryTree(int[] nodes){
        index++;
        if(nodes[index]==-1){
            return null;
        }
        Node newNode= new Node(nodes[index]);
        newNode.left=binaryTree(nodes);
        newNode.right=binaryTree(nodes);
        return newNode;
    }
    public static void levelorder(Node node){
        if(node==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        q.offer(null);
        while(!q.isEmpty()){
            Node currNode = q.poll();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty())
                    return;
                else
                    q.offer(null);
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.offer(currNode.left);
                if (currNode.right!=null)
                    q.offer(currNode.right);
            }
        }
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node  node =binaryTree(nodes);
        levelorder(node);
    }
}
