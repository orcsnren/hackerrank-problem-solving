import java.util.Scanner;

class BinarySearchTreeNode {
	BinarySearchTreeNode left, right;
	int data;

	BinarySearchTreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinarySearchTrees {

	public static int getHeight(BinarySearchTreeNode root) {
		if (root == null) {
			return -1;
		}
		int left = 1 + getHeight(root.left);
		int right = 1 + getHeight(root.right);
		return Math.max(left, right);
	}

	public static BinarySearchTreeNode insert(BinarySearchTreeNode root, int data) {
		if (root == null) {
			return new BinarySearchTreeNode(data);
		} else {
			BinarySearchTreeNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BinarySearchTreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}