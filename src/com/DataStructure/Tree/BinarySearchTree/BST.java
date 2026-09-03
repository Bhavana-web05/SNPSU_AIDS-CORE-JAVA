package com.DataStructure.Tree.BinarySearchTree;
 class  Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class BinarySearchTree {
    Node root;
    BinarySearchTree() {
        root = null;
    }
    private Node insertRec(Node root, int key) {                 // this is used for inserting the value
        // this is a base case and recursive case
        if (root == null) {           // this is used for insertion of 1st element when root is null
            return new Node(key);       //this creates new node for every insertion and stores the key
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void insert ( int key){              // this takes value from key main and give it to insertRec
        root = insertRec(root, key);
    }

    void DFS(Node root){     //inorder
        if (root == null){  // the inorder travel of bst is always sorted
            return;
        }
        DFS(root.left);
        System.out.print(root.data+" ");
        DFS(root.right);
    }

    boolean searchRec(Node root, int key){
        if (root == null){
            return false;
        }
        if (key == root.data){
            return true;
        }
        else if (key < root.data){
            return searchRec(root.left, key);
        }
        else{
            return searchRec(root.right, key);
        }
    }

    boolean search( int key){  //  this is used to take key data from bst.search
        return searchRec(root, key);
    }
     private Node removeRec(Node root, int key) {
         if (root == null) {
             return null;
         }
         if (key < root.data) {
             root.left = removeRec(root.left, key);
         } else if (key > root.data) {
             root.right = removeRec(root.right, key);
         } else {
             // u found the node to be deleting
             //Cae 1 Node with 0 or 1child
             if (root.left == null ){
                 return root.right;
             }else if(root.right == null){
                 return root.left;
             }
             //case2 Node with 2children
             Node successor = findsuccessor(root.right);
             root.data = successor.data;
             root.right = removeRec(root.right, successor.data);
         }
         return root;

     }
     private  Node findsuccessor(Node node){
        while(node.left != null){
            node = node.left;
        }return node;

     }
     void remove(int key){
        root = removeRec(root,key);



     }

}

class Driver{
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(100); // this goes to void insert
        bst.insert(50);
        // here is how it works : 52 goes to void insert where it is passed to insertRec(100 , 50)
        // checks 100 == null not true so goes to else
        // checks 50<100 yes goes to left of root
        //  initially root left is null so it is " insertRec(null , 50)
        //   now goes back to root==null creates a new node and stores value
        //   this the same for every insertion
        bst.insert(180);
        bst.insert(30);
        bst.insert(150);
        bst.insert(70);
        bst.insert(250);
        bst.insert(65);
        bst.insert(170);

        bst.DFS(bst.root);

        System.out.println(" ");
        System.out.println(bst.search(30));


    }
}