
import java.util.Scanner;

class MoreLinkedListNode {
	int data;
	MoreLinkedListNode next;

	MoreLinkedListNode(int d) {
		data = d;
		next = null;
	}

}

class MoreLinkedLists {

	public static MoreLinkedListNode removeDuplicates(MoreLinkedListNode head) {
		MoreLinkedListNode start = head;
		while (start != null && start.next != null) {
			start.next = findNextNode(start, start.data);
			start = start.next;

		}
		return head;
	}

	public static MoreLinkedListNode findNextNode(MoreLinkedListNode start, int num) {
		while (start.next != null) {
			if (start.next.data != num) {
				return start.next;
			}
			start = start.next;
		}
		return null;
	}

	public static MoreLinkedListNode insert(MoreLinkedListNode head, int data) {
		MoreLinkedListNode p = new MoreLinkedListNode(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			MoreLinkedListNode start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(MoreLinkedListNode head) {
		MoreLinkedListNode start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MoreLinkedListNode head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}