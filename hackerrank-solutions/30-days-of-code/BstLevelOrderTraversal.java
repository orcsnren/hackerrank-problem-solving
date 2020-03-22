
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BstNode {
	BstNode left, right;
	int data;

	BstNode(int data) {
		this.data = data;
		left = right = null;
	}
}

class BstLevelOrderTraversal {

	static void levelOrder(BstNode root) {
		Queue<BstNode> queue = new LinkedList();
		queue.add(root);

		while (!queue.isEmpty()) {
			BstNode current = queue.remove();
			System.out.print(current.data + " ");
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}

		}
	}

	public static BstNode insert(BstNode root, int data) {
		if (root == null) {
			return new BstNode(data);
		} else {
			BstNode cur;
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
		BstNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}