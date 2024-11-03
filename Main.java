public class Main {
    public static void main(String[] args) {
        // int k;
        // System.out.println("Enter k: ");
        // k = Integer.parseInt(System.console().readLine());
        // KDTree tree = new KDTree(k);
        // System.out.println("Real time insertion of data... ");
        // System.out.println("Enter data to insert");
        // boolean continueInserting = true;
        // Node root = null;
        // while (continueInserting) {
        // System.out.println("Enter data to insert");
        // int[] point = new int[k];
        // for (int i = 0; i < k; i++) {
        // point[i] = Integer.parseInt(System.console().readLine());
        // }
        // if (tree == null) {
        // tree = new KDTree(k);
        // }
        // root = tree.insert(root, point);
        // System.out.println("Do you want to insert more data? Enter 1 for yes and 0
        // for no: ");
        // int choice = Integer.parseInt(System.console().readLine());
        // if (choice == 0) {
        // continueInserting = false;
        // }
        // }
        // System.out.println("KD Tree is created");
        // System.out.println("Enter data to search");
        // boolean continueSearching = true;
        // while (continueSearching) {
        // System.out.println("Enter data to search");
        // int[] point = new int[k];
        // for (int i = 0; i < k; i++) {
        // point[i] = Integer.parseInt(System.console().readLine());
        // }
        // Node found = tree.search(root, point);
        // if (found == null) {
        // System.out.println("Not Found");
        // } else {
        // System.out.println("Found");
        // System.out.println(found);
        // }
        // System.out.println("Do you want to search more data? Enter 1 for yes and 0
        // for no: ");
        // int choice = Integer.parseInt(System.console().readLine());
        // if (choice == 0) {
        // continueSearching = false;
        // }
        // }

        // hard coded input for testing
        int k = 2;
        KDTree tree = new KDTree(k);
        Node root = null;
        int[][] points = { { 10, 5 }, { 9, 7 }, { 30, 6 }, { 9, 15 },
                { 14, 22 }, { 6, 50 } };

        int n = points.length;

        for (int i = 0; i < n; i++) {
            root = tree.insert(root, points[i]);
        }

        int[] point1 = { 9, 15 };
        System.out.println(tree.search(root, point1));

        int[] point2 = { 9, 7 };
        System.out.println(tree.search(root, point2));
        // tree.printTree(root);
    }
}
