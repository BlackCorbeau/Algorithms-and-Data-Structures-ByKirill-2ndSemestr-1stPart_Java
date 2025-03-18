package org.exampl.BinTree;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrNodeTest {

    @Test
    public void testDefaultConstructor() {
        TrNode<Integer> node = new TrNode<>();
        Assert.assertNull(node.getVal());
        Assert.assertNull(node.getLeft());
        Assert.assertNull(node.getRight());
    }

    @Test
    public void testParameterizedConstructor() {
        TrNode<Integer> leftNode = new TrNode<>(1, null, null);
        TrNode<Integer> rightNode = new TrNode<>(3, null, null);
        TrNode<Integer> node = new TrNode<>(2, leftNode, rightNode);

        Assert.assertEquals(node.getVal(), Integer.valueOf(2));
        Assert.assertEquals(node.getLeft(), leftNode);
        Assert.assertEquals(node.getRight(), rightNode);
    }

    @Test
    public void testCopyConstructor() {
        TrNode<Integer> originalNode = new TrNode<>(5, null, null);
        TrNode<Integer> copiedNode = new TrNode<>(originalNode);

        Assert.assertEquals(copiedNode.getVal(), originalNode.getVal());
        Assert.assertEquals(copiedNode.getLeft(), originalNode.getLeft());
        Assert.assertEquals(copiedNode.getRight(), originalNode.getRight());
    }

    @Test
    public void testSetAndGetVal() {
        TrNode<String> node = new TrNode<>();
        node.setVal("Test");
        Assert.assertEquals(node.getVal(), "Test");
    }

    @Test
    public void testSetAndGetLeft() {
        TrNode<Integer> node = new TrNode<>();
        TrNode<Integer> leftNode = new TrNode<>(10, null, null);
        node.setLeft(leftNode);
        Assert.assertEquals(node.getLeft(), leftNode);
    }

    @Test
    public void testSetAndGetRight() {
        TrNode<Integer> node = new TrNode<>();
        TrNode<Integer> rightNode = new TrNode<>(20, null, null);
        node.setRight(rightNode);
        Assert.assertEquals(node.getRight(), rightNode);
    }
}
