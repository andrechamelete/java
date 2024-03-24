public class TreeNode {

    char data;
    TreeNode left;
    TreeNode right;
    int heigth;

    public TreeNode() {
        this.left = null;
        this.right = null;
        this.heigth = 1;

    }

    public TreeNode(char data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.heigth = 1;
    }

    public static int getHeigth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return node.heigth;
        }
    }

    public static int getBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        else {
            return getHeigth(node.left) - getHeigth(node.right);
        }
    }

    public static TreeNode rightRotate(TreeNode y) {
        System.out.println("Rorate rigth on node " + y.data);
        TreeNode x = y.left;
        TreeNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.heigth = 1 + Math.max(getHeigth(y.left), getHeigth(y.right));
        x.heigth = 1 + Math.max(getHeigth(x.left), getHeigth(x.right));
        return x;
    }

    public static TreeNode leftRotate(TreeNode x) {
        System.out.println("Rotate left on node " + x.data);
        TreeNode y = x.right;
        TreeNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.heigth = 1 + Math.max(getHeigth(x.left), getHeigth(x.right));
        y.heigth = 1 + Math.max(getHeigth(y.left), getHeigth(y.right));
        return y;
    }


    public static TreeNode insert (TreeNode node, char data) {
        if (node == null) {
            return new TreeNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        }

        else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        
        node.heigth = 1 + Math.max(getHeigth(node.left), getHeigth(node.right));
        int balance = getBalance(node);

        if (balance > 1 && data < node.left.data) {
            return rightRotate(node);
        }
        
        if (balance < -1 && data > node.right.data) {
            return leftRotate(node);
        }
        
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data + ", ");
        inOrderTraversal(node.right);
    }

    /*
    public TreeNode delete(TreeNode node, char data) {
        if (node == null) {
            return node;
        }
        if (data < node.data) {
            node.left = delete(node.left, data);
        } 
        
        else if (data > node.data) {
            node.right = delete(node.right, data);
        } 
        
        else {
            if (node.left == null) {
                TreeNode temp = node.right;
                node = null;
                return temp;
            } else if (node.right == null) {
                TreeNode temp = node.left;
                node = null;
                return temp;
            }
            TreeNode temp = minValueNode(node.right);
            node.data = temp.data;
            node.right = delete(node.right, temp.data);
        }
        if (node == null) {
            return node;
        }
    }
    */
    

    public static void main(String[]args) {
        TreeNode root = null;
        
        char[] letters = {'C', 'B', 'E', 'A', 'D', 'H', 'G', 'F'};

        for (char letter : letters) {
            root = TreeNode.insert(root, letter);
        }

        TreeNode.inOrderTraversal(root);

        System.out.println(root.data);
        System.out.println();
        System.out.println(root.left.data + " " + root.right.data);
        System.out.println();
        System.out.println(root.right.right.right.data);

        TreeNode.insert(root, 'N');

        System.out.println(root.right.data);

    }
    
}
