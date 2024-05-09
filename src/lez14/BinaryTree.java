package lez14;

public class BinaryTree<T> {
  private final Node<T> root;

  public BinaryTree(T value){
    root = new Node<>(value);
  }

  public void add(T value){
    add(root, value);
  }

  private void add(Node<T> node, T value){
    if (node.left == null){
      node.left = new Node<>(value);
    } else if (node.right == null){
      node.right = new Node<>(value);
    } else {
      if (node.left.isFoglia() || node.left.right == null)
        add(node.left, value);
      else if (node.right.isFoglia() || node.right.right == null)
        add(node.right, value);
      else
        add(node.left, value);
    }
  }

  public static class Node<T>{
    private Node<T> left, right;
    private T value;

    public Node(T value){
      this.value = value;
    }

    public Node(Node<T> left, T value, Node<T> right){
      this.left = left;
      this.right = right;
      this.value = value;
    }

    public boolean isFoglia(){
      return left == null && right == null;
    }

    public T getValue() {
      return value;
    }

    public void setValue(T value) {
      this.value = value;
    }
  }
}
