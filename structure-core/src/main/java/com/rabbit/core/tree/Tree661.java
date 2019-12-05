package com.rabbit.core.tree;

import org.junit.Test;

/**
 * @Author chentao
 * Date 2019/12/5
 * 二叉树先序遍历递归实现
 **/
public class Tree661 {

    class BiTreeBase {
        Node lchild = null;
        Node rchild = null;
        int data;
    }


    class Node extends BiTreeBase {
    }

    class BiTree extends BiTreeBase{

    }

    void createBiTree(BiTree biTree){
        biTree.data = 1;
        biTree.lchild = new Node();
        biTree.lchild.data=2;
        biTree.rchild = new Node();
        biTree.rchild.data=3;
        biTree.lchild.lchild = new Node();
        biTree.lchild.lchild.data = 4;
        biTree.lchild.rchild = new Node();
        biTree.lchild.rchild.data = 5;
        biTree.rchild.lchild = new Node();
        biTree.rchild.lchild.data = 6;
        biTree.rchild.rchild = new Node();
        biTree.rchild.rchild.data = 7;
    }


    //模拟操作结点元素的函数，输出结点本身的数值
    void displayElem(BiTreeBase node){
        System.out.print(node.data + "->");
    }

    /**先序遍历*/
    void preOrderTraverse(BiTreeBase biTree){
        if(null != biTree){
            displayElem(biTree); //调用操作结点数据的函数方法
            preOrderTraverse(biTree.lchild); //访问该结点的左孩子
            preOrderTraverse(biTree.rchild); //访问该结点的右孩子
        }
        //如果结点为空，返回上一层
        return;
    }

    @Test
    public void testBitree(){
        BiTree biTree = new BiTree();
        createBiTree(biTree);
        preOrderTraverse(biTree);
    }






}

