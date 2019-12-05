package com.rabbit.core.tree;

import org.junit.Test;

/**
 * @Author chentao
 * Date 2019/12/5
 * 二叉树先序遍历递归实现
 **/
public class Tree662 {

    //top变量时刻表示栈顶元素所在位置
    int top = -1;

    class BiTreeBase {
        Node lchild = null;
        Node rchild = null;
        int data;
    }


    class Node extends BiTreeBase {
    }

    class BiTree extends BiTreeBase {

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

    //前序遍历使用的进栈函数
    void push(BiTreeBase[] a, BiTreeBase elem){
        a[++top] = elem;
    }

    //弹栈函数
    void pop(){
        if(top == -1){
            return;
        }
        top--;
    }

    //拿到栈顶元素
    BiTreeBase getTop (BiTreeBase[] a){
        if(top == -1){
            return null;
        }
        return a[top];
    }

    //先序遍历非递归算法
    void PreOrderTraverse(BiTree tree){
        BiTreeBase[] a = new BiTreeBase[10]; //定义一个顺序栈
        BiTreeBase p; //临时指针
        push(a, tree); //根结点进栈
        while (top != -1){
            p = getTop(a); //取栈顶元素
            pop(); //弹栈
            while(p != null){
                displayElem(p); //调用结点的操作函数
                //如果该结点有右孩子，右孩子进栈
                if(p.rchild != null){
                    push(a, p.rchild);
                }
                p = p.lchild; //一直指向根结点最后一个左孩子
            }
        }
    }

    @Test
    public void testBitree(){
        BiTree biTree = new BiTree();
        createBiTree(biTree);
        System.out.println("先序遍历：");
        PreOrderTraverse(biTree);
    }

}

