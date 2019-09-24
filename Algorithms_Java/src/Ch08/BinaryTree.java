package Ch08;

import java.util.Comparator;

public class BinaryTree<K, V> {

	static class Node<K, V> {
		private K key;
		private V data;
		private Node<K, V> left;
		private Node<K, V> right;

		Node(K key, V data, Node<K, V> left, Node<K, V> right) {
			this.key = key;
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public K getKey() {
			return key;
		}

		public V getData() {
			return data;
		}

		public void print() {
			System.out.println(data);
		}
	}

	private Node<K, V> root;
	private Comparator<? super K> comparator = null;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(Comparator<? super K> c) {
		this();
		comparator = c;
	}

	private int comp(K key1, K key2) {
		return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
	}

	public V seearch(K key) {
		Node<K, V> p = root;

		while (true) {
			if (p == null) // failed searching the data
				return null;

			int cond = comp(key, p.getKey()); // compare key and
			if (cond == 0) // if SAME
				return p.getData(); // successful
			else if (cond < 0) // if key is small,
				p = p.left; // proceeds to left
			else // if key is bigger
				p = p.right; // proceeds to right
		}
	}

	private void addNode(Node<K, V> node, K key, V data) {
		int cond = comp(key, node.getKey());

		if (cond == 0) // given key already exists!
			return; // don't do anything
		else if (cond < 0) { // key is to be inserted to the left
			if (node.left == null)
				node.left = new Node<K, V>(key, data, null, null);
			else
				addNode(node.left, key, data); // recursive call to left node
		} else { // key is to be inserted to the right
			if (node.right == null)
				node.right = new Node<K, V>(key, data, null, null);
			else {
				addNode(node.right, key, data); // recursive call to right node
			}
		}
	}

	public void add(K key, V data) {
		if (root == null)
			root = new Node<K, V>(key, data, null, null);
		else {
			addNode(root, key, data);
		}
	}

	public boolean remove(K key) {
		Node<K, V> p = root; // Currently scanning Node
		Node<K, V> parent = null; // parent Node of p
		boolean isLeftChild = true; // is p the left child node of parent Node?

		// Searches the node to be deleted
		while (true) {
			if (p == null) // key doesn't exists
				return false;	//returns false

			int cond = comp(key, p.getKey());

			if (cond == 0) // key exists
				break;
			else { // if not the key we are looking for,
				parent = p;

				if (cond < 0) { // if smaller key
					isLeftChild = true;
					p = p.left;
				} else { // if larger key
					isLeftChild = false;
					p = p.right;
				}
			}
		}

		// Check if the node has 0, 1 or 2 child node(s)
		
		if (p.left == null) { // left node is empty
			if (p == root)
				root = p.right;
			else if (isLeftChild)
				parent.left = p.left;
			else
				parent.right = p.right;
		}
		else if(p.right == null) {	// left node exists, and right node is empty
			if(p == null)
				root = p.left;
			else if(isLeftChild)
				parent.left = p.left;
			else
				parent.right = p.right;
		}
		else {	// left and right nodes exists
			parent = p;
			Node<K,V> left = p.left;
			isLeftChild = true;
			
			while(left.right != null) {
				parent = left;
				left = left.right;
				isLeftChild = false;
			}
			
			p.key = left.key;
			p.data = left.data;
			
			if(isLeftChild)
				parent.left = left.left;
			else
				parent.right = left.left;
		}
		
		return true;
	}

	public static void main(String[] args) {

	}
}
