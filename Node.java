import java.util.Arrays;

public class Node {
    int[] point;
    Node left;
    Node right;

    public Node(int[] point) {
        this.point = point;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Node {");
        sb.append("point = ").append(Arrays.toString(point));
        if(left != null) {
            sb.append(", left = ( " ).append(Arrays.toString(left.point)).append(" )");
        }
        else {
            sb.append(", left = null");
        }
        if(right != null) {
            sb.append(", right = ( ").append(Arrays.toString(right.point)).append(" )");
        }
        else {
            sb.append(", right = null");
        }
        sb.append('}');
        return sb.toString();
    }
}
