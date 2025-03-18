package org.exampl.BinTree;


public class TrNode<T> {
    private T val;
    private TrNode<T> left;
    private TrNode<T> right;

    public T getVal(){return val;}
    public void setVal(T _val) {val = _val;}

    public TrNode<T> getLeft(){return left;}
    public void setLeft(TrNode<T> _left){left = _left;}

    public TrNode<T> getRight(){return right;}
    public void setRight(TrNode<T> _right){right = _right;}

    public TrNode() {
        left = null;
        right = null;
    }

    public TrNode(T _val, TrNode<T> _left, TrNode<T> _right) {
        val = _val;
        left = _left;
        right = _right;
    }

    public TrNode(TrNode<T> _node) {
        val = _node.getVal();
        right = _node.getRight();
        left = _node.getLeft();
    }
}
