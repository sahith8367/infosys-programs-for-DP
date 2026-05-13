package com.example.springboot.learning.basics.Example06;
import org.springframework.data.relational.core.sql.In;

import java.util.*;

public class info08 {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public int index = -1;
    public Node binaryTree(int[] nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        Node newNode = new Node(nodes[index]);
        newNode.left=binaryTree(nodes);
        newNode.right=binaryTree(nodes);
        return newNode;
    }
    public ArrayList<Integer> leftSubtree(ArrayList<Integer> list,Node node){
        if(node==null)
            return null;
        Node currNode = node;
        list.add(currNode.data);
        leftSubtree(list,currNode.left);

        return list;
    }
    public ArrayList<Integer> rightSubtree(ArrayList<Integer> list,Node node){
        if(node==null)
            return null;
        Node currNode = node;

        rightSubtree(list,currNode.right);
        list.add(currNode.data);
        return list;

    }
    public ArrayList<Integer> rightSide(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        rightSubtree(list,node);
        list.removeLast();
        list.addAll(leftSubtree(list1,node));
        return list;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        info08 obj = new info08();
        Node node =obj.binaryTree(nodes);
        System.out.println(obj.rightSide(node));
    }
}
