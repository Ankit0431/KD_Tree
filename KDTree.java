class KDTree {
    int k;
    public KDTree(int k) {
        this.k = k;
    }
    // Node root = null;
    public Node newNode(int[] point) {
        return new Node(point);
    }

    public boolean comparePoint(int[] point1, int[] point2) {
        for (int i = 0; i < point1.length; i++) {
            if (point1[i] != point2[i]) {
                return false;
            }
        }
        return true;
    }

    public Node insert(Node root, int[] point) {
        return insertRecursive(point, root, 1);
    }

    private Node insertRecursive(int[] point, Node node, int depth) {
        if (node == null) {
            return newNode(point);
        }
        int cd = depth % k;
        if(point[cd] < node.point[cd]) {
            node.left = insertRecursive(point, node.left, depth + 1);
        } else {
            node.right = insertRecursive(point, node.right, depth + 1);
        }
        return node;
    }
    public Node search(Node root, int[] point) {
        return searchRecursive(point, root, 1);
    }
    private Node searchRecursive(int[] point, Node node, int depth) {
        if (node == null) {
            return null;
        }
        if (comparePoint(point, node.point)) {
            return node;
        }
        int cd = depth % k;
        if(point[cd] < node.point[cd]) {
            return searchRecursive(point, node.left, depth + 1);
        } else {
            return searchRecursive(point, node.right, depth + 1);
        }
    }
    public void printTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root);
        printTree(root.left);
        
        printTree(root.right);
    }
}