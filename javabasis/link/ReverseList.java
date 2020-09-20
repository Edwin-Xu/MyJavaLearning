package javabasis.link;

import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Edwin Xu on 5/12/2020 11:37 PM
 */
class Node {
    int val;
    Node next;

    public Node(int x) {
        this.val = x;
    }
}
/*
 *  X  - Y  - Z  -W
 *  a   b
 *  ab交换：
 *
 *
 * 思路： 一个个翻转到最前面
 * 使用2个临时变量：
 *  - H: 已经翻转的链表头
 *  - head：已经翻转的链表尾
 *  - N：下一个待翻转的节点
 * */

public class ReverseList {
    public static Node reverse(Node head) {
        if (head == null) return null;
        Node H = head; //H指向头结点
        Node N = head.next; //N指向下一个待翻转的节点
        Node tmp; //临时节点
        while (N!=null){
            tmp = N; //先把N存起来防止后面修改
            head.next = N.next; //head的下一个指向N的下一个(head最终会成为尾节点)
            N.next = H;//N的下一个指向之前的下一个
            H =tmp; //N就变成了新的头结点
            N = head.next; //N往后移
        }
        return H;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

//        Node tail = ReverseList.reverse(head);
//        while (tail != null) {
//            System.out.println(tail.val);
//            tail = tail.next;
//        }
//
        new ReverseList().reversePrint(head);
    }

    //栈
    public int[] reversePrint_stack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head =head.next;
        }
        int []res = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()){
            res[index++] = stack.pop();
        }
        return res;
    }

    //recursion

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        recur(list,head);
        int [] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void recur(ArrayList<Integer> list, ListNode head){
        if (head==null)return;
        recur(list,head.next);
        list.add(head.val);

    }



}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
