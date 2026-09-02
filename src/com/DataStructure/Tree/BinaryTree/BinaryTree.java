package com.DataStructure.Tree.BinaryTree;

import com.DataStructure.Stack.LLStack;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public static Node root;
    int data;
    Node left;
    Node right;


    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

    public class BinaryTree {
        static Node createNode(int val) {
            return new Node(val);

        }

        static void DFS(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            DFS(root.left);
            DFS(root.right);
        }

        static void BFS(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.offer(root);//offer=push
            while (!q.isEmpty()) {
                Node front = q.poll();//poll=pop
                System.out.print(front.data + " ");
                if (front.left != null) {
                    q.offer(front.left);
                }
                if (front.right != null) {
                    q.offer(front.right);
                }
            }

        }
        static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = 0;
            int rightHeight = 0;
            return 1 + Math.max(leftHeight, rightHeight);
        }

        public static void main(String[] args) {
            //level1
            Node.root = createNode(1);
            //level 2
            Node.root.left = createNode(2);
            Node.root.right = createNode(3);
            //level 3
            Node.root.left.left = createNode(4);
            Node.root.left.right = createNode(5);
            Node.root.right.left = createNode(6);
            //level 4
            Node.root.right.right = createNode(7);
            Node.root.left.right.left = createNode(8);
            Node.root.right.left.left = createNode(15);
            Node.root.right.left.right = createNode(9);
            DFS(Node.root);
            System.out.println(" ");
            BFS(Node.root);

        }
    }

