package com.bf.xiaohui;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

// 二叉树 遍历
public class BinaryTreeTraversal {

    @Test
    public void test() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(3, 2, 9, null, null, 10, null, null, 8, null, 4));
        Node binaryTree = createBinaryTree(list);
        System.out.println();

        preOrderTraversal(binaryTree);
    }


    // 前序遍历
    public void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public Node createBinaryTree(LinkedList<Integer> list) {

        if (null == list || list.isEmpty()) return null;
        Integer data = list.removeFirst();



        Node root = null;
        if (null != data) { // 空节点 不能作为根。 可以作为叶子
            root = new Node();
            root.data = data; //
            root.left = createBinaryTree(list);
            root.right = createBinaryTree(list);
        }

        return root;
    }


    // 静态内部类与外部类（在这种情况下LinkedStack）相关联，而不与它的实例相关联
    class Node {
        Integer data;
        Node left;
        Node right;
    }


}
