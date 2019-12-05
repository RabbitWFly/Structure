package com.rabbit.core.tree;

import org.junit.Test;

/**
 * @Author chentao
 * Date 2019/12/5
 * 二叉树的链式存储结构
 **/
public class Tree64 {

    class BiTreeBase {
        Node lchild = null;
        Node rchild = null;
        int data;
    }


    class Node extends Tree64.BiTreeBase {
    }

    class BiTree extends Tree64.BiTreeBase {

    }

    void createBiTree(BiTree biTree){
        biTree.data = 1;
        biTree.lchild = new Node();
        biTree.lchild.data=2;
        biTree.lchild.lchild = new Node();
        biTree.lchild.lchild.data = 4;
        biTree.rchild = new Node();
        biTree.rchild.data = 3;
    }


    @Test
    public void testBitree(){
        BiTree biTree = new BiTree();
        createBiTree(biTree);
        System.out.println(biTree.lchild.lchild.data);
    }
}

