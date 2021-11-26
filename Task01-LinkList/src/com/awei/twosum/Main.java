package com.awei.twosum;

/**
 * @Author: Alivv
 * @Create: 2021-11-26 11:19
 **/
public class Main {


    /**
     * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
     *
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     *
     * 你可以假设除了数字 0 之外，这两个数都不会以 0开头。
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // ListNode head =new ListNode();
        // ListNode temp =head;

        ListNode head=null,temp=null;

        int carry=0;
        while(l1!=null||l2!=null){
            // if(l1==null) l1=new ListNode(0);
            // if(l2==null) l2=new ListNode(0);

            // ListNode node =new ListNode((l1.val+l2.val+carry)%10);
            // temp.next=node;
            // temp=temp.next;

            int n1=l1==null?0:l1.val;
            int n2=l2==null?0:l2.val;
            if(head==null){
                head=temp=new ListNode((n1+n2+carry)%10);
            }else{
                temp.next=new ListNode((n1+n2+carry)%10);
                temp=temp.next;
            }

            carry=(n1+n2+carry)/10;
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry!=0)
            // temp.next=new ListNode(carry);
            temp.next=new ListNode(carry);
        return head;
    }



    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
