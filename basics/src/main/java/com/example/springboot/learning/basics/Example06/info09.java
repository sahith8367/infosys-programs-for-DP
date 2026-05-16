package com.example.springboot.learning.basics.Example06;
import java.util.*;

public class info09 {
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
    public Node bianaryTree(int[] nodes){
        index++;
        if(nodes[index]==-1)
            return null;
        Node currNode = new Node(nodes[index]);
        currNode.left=bianaryTree(nodes);
        currNode.right=bianaryTree(nodes);
        return currNode;
    }
    //Pre order;(root , left , right)
    public void preOrder(Node node){
        if(node==null)
            return;
        Node currNode = node;
        System.out.println(currNode.data +" ");
        preOrder(currNode.left);
        preOrder(currNode.right);
    }
    //In Order (left,root,right)
    public void inOrder(Node node){
        if(node==null)
            return;
        Node currNode = node;
        inOrder(currNode.left);
        System.out.println(currNode.data);
        inOrder(currNode.right);
    }
    //post Order (left,right,root)
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        Node currNode = node;
        postOrder(currNode.left);
        postOrder(currNode.right);
        System.out.println(currNode.data);
    }
    //level Order which is level wise
    public void levelOrder1(Node node){
        if(node==null)
            return ;
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
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.offer(currNode.left);
                if(currNode.right!=null)
                    q.offer(currNode.right);
            }
        }
    }
    public void levelOrder2(Node node){
        if(node==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(node);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node currNode = q.poll();
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.offer(currNode.left);
                if(currNode.right!=null)
                    q.offer(currNode.right);
            }
            System.out.println();
        }
    }
    public void zigZag(Node node){
        if(node == null)
            return;
        boolean flag = false;
        Deque<Node> dq = new LinkedList<>();
        dq.offer(node);
        while(!dq.isEmpty()){
            int size = dq.size();
            for(int i=0;i<size;i++){
                if(!flag){
                    Node currNode = dq.poll();
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null)
                        dq.offer(currNode.left);
                    if(currNode.right!=null)
                        dq.offer(currNode.right);
                }else{
                    Node currNode = dq.removeLast();
                    System.out.print(currNode.data+" ");
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
    public ArrayList<Integer> right(ArrayList<Integer> list,Node node){
        if(node==null)
            return null;
        Node currNode = node;
        list.add(currNode.data);
        right(list,currNode.right);
        return list;
    }
    public ArrayList<Integer> left(ArrayList<Integer> list,Node node){
        if(node==null)
            return null;
        Node currNode = node;
        left(list,currNode.left);
        list.add(currNode.data);
        return list;
    }
    public ArrayList<Integer> rightView(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        left(list,node);
        right(list1,node);
        list.removeLast();
        list.addAll(list1);
        return list;
    }
    public int nodeSum(Node node){
        if(node==null)
            return 0;
        Node currNode = node;
        return nodeSum(currNode.left)+nodeSum(currNode.right)+currNode.data;
    }
    public int nodeCount(Node node){
        if(node==null)
            return 0;
        Node currNode = node;
        return nodeCount(currNode.left)+nodeCount(currNode.right)+1;
    }
    public int nodeHeight(Node node){
        if(node==null)
            return 0;
        Node currNode = node;
        return Math.max(nodeHeight(currNode.left)+1,nodeHeight(currNode.left)+1);
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        info09 obj = new info09();
        Node node = obj.bianaryTree(nodes);
        System.out.println("---  Pre Order ----");
        obj.preOrder(node);
        System.out.println("---  break ----");
        System.out.println("---  In Order ----");
        obj.inOrder(node);
        System.out.println("---  break ----");
        System.out.println("---  Post Order ----");
        obj.postOrder(node);
        System.out.println("---  break ----");
        System.out.println("---  Level Order  1----");
        obj.levelOrder1(node);
        System.out.println("---  break ----");
        System.out.println("---  Level Order 2 ----");
        obj.levelOrder2(node);
        System.out.println("---  break ----");
        System.out.println("---  Zig Zag ----");
        obj.zigZag(node);
        System.out.println("---  break ----");
        System.out.println("---  right view ----");
        System.out.println(obj.rightView(node));
        System.out.println("---  break ----");
        System.out.println("---  Nodes Sum ----");
        System.out.println(obj.nodeSum(node));
        System.out.println("---  break ----");
        System.out.println("---  Nodes Count ----");
        System.out.println(obj.nodeCount(node));
        System.out.println("---  break ----");
        System.out.println("---  Nodes Height ----");
        System.out.println(obj.nodeHeight(node));

    }
}
