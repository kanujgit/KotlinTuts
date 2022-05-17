package com.codingquestion.tree;


public class BinarySearchTreeImp {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);
        int x = 2;
        printInroder(root);
        System.out.println();
        InsertElementBST insertElementBST = new InsertElementBST();
        insertElementBST.insertElement(root, x);
        printInroder(root);
        System.out.println("floor");
        System.out.println(new FloorOfBST().floorElement(root,4));
    }

    private static void printInroder(TreeNode root) {
        if(root != null){
            printInroder(root.left);
            System.out.print(root.key+" ");
            printInroder(root.right);
        }
    }
}

class TreeNode {
    int key;
    TreeNode left;
    TreeNode right;

    TreeNode(int k) {
        key = k;
        left = right = null;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}


class InsertElementBST {
    public TreeNode insertElement(TreeNode root, int x) {
        if (root == null)
            return new TreeNode(x);

        else if (root.key > x)
            root.left =  insertElement(root.left, x);
        else if(root.key < x)
            root.right =  insertElement(root.right, x);
        return root;
    }
}

class DeleteElementBST {
    public TreeNode deleteElement(TreeNode root, int x) {
        return new TreeNode(x);
    }
}
class FloorOfBST {
    public TreeNode floorElement(TreeNode root, int x) {
        TreeNode res = null;
        if(root == null) return null;
        while (root!=null){
            if(root.key == x){
                return root;
            }else if(root.key>x){
                root = root.left;
            } else{
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}

