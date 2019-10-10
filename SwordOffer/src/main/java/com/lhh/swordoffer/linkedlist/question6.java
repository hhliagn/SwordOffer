package com.lhh.swordoffer.linkedlist;

import java.util.ArrayList;

public class question6 {

    //从尾到头打印链表
    class ListNode{
        ListNode next;
        int val;
    }

    //1.递归，比如1-2-3（3-2-1）先打印2-3（3-2）,然后加上 1
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead1(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    //2.使用栈  从头到尾放进栈中，出栈的时候就是逆序

    //3.头插法  建一个新的链表，按顺序获取node插入新链表，下一个node和之前的node连成一个新链表，头节点再指向这个新的链表
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ListNode listNode1 = new ListNode();
        ListNode temp = listNode;
        while (listNode != null){
            listNode.next = listNode1.next;
            listNode1.next = listNode;
            listNode = temp.next;
        }
        ListNode next = listNode1.next;
        ArrayList<Integer> ret = new ArrayList<>();
        while (next != null){
            ret.add(next.val);
            next = next.next;
        }
        return ret;
    }

}
