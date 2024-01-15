package MyJavaProject.datastructure;

public  class Binary_Search_Tree {
   public static class node{
        int data;
        node left,right;
        public node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
   public static class binarySearchTree
    {
        node root;
        binarySearchTree()
        {
            root=null;
        }
        void insert(int data)
        {
            root=insertRec(root,data);
        }
        node insertRec(node root,int data)
        {
            if (root==null)
            {
                root=new node(data);
                return  root;
            }
            if (data<root.data)
            {
                root.left=insertRec(root.left,data);
            }
            else if (data> root.data)
            {
                root.right=insertRec(root.right,data);
            }
            return root;
        }
        boolean search(int data)
        {
            return  searchRec(root,data);
        }
        boolean searchRec(node root,int data)
        {
            if (root==null)
            {
                return false;
            }
            if (root.data==data)
            {
                return true;
            }
            return data< root.data ? searchRec(root.left,data):searchRec(root.right,data);
        }
        void inorder()
        {
            inorderRec(root);
        }
        void inorderRec(node root)
        {
            if (root!=null)
            {
                inorderRec(root.left);
                System.out.println(root.data);
                inorderRec(root.right);
            }
        }

    }


    public static void main(String[] args) {
        binarySearchTree best=new binarySearchTree();
        best.insert(100);
        best.insert(40);
        best.insert(10);
        best.insert(70);
        best.insert(60);
        best.insert(33);
        best.insert(25);
        best.insert(90);
        best.insert(30);
        System.out.println("INORDER TRAVERSAL:");
        best.inorder();
        int searchKey = 40;
        if (best.search(searchKey)) {
            System.out.println(searchKey + " found in the tree");
        }
        else {
            System.out.println(searchKey + " not found in the tree");
        }

    }
}
