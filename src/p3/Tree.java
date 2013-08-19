package p3;

public class Tree {
	private int value;
	public Tree left, right;
	public Tree(int value) {
		this.value=value;
	}
	public void insert(int x) { /* code here */  }
	public Tree remove(int x) { /* code here */ }
	public void preorderTraverse() { 
		printPreorderTraverse(this);
	}
	public void inorderTraverse() {
		printInorderTraverse(this);
	}
	public void postorderTraverse() {
		printPostorderTraverse(this);
	}
	public void traverseByLevel() { /* code here */ }  
	private void printPreorderTraverse(Tree a){
		System.out.println(a.value);
		if(a.left!=null) printPreorderTraverse(a.left);
		if(a.right!=null) printPreorderTraverse(a.right);
	}
	private void printInorderTraverse(Tree a){
		if(a.left!=null)printInorderTraverse(a.left);
		System.out.println(a.value);
		if(a.right!=null)printInorderTraverse(a.right);
	}
	private void printPostorderTraverse(Tree a){
		if(a.left!=null)printPostorderTraverse(a.left);
		if(a.right!=null)printPostorderTraverse(a.right);
		System.out.println(a.value);
	}
}
