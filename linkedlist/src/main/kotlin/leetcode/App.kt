package leetcode

import MyLinkedList

class App

fun main(args: Array<String>) {
    val myLinkedList = MyLinkedList()
    myLinkedList.addAtHead(2)
    myLinkedList.deleteAtIndex(1)
    myLinkedList.addAtHead(2)
    myLinkedList.addAtHead(7)
    myLinkedList.addAtHead(3)
    myLinkedList.addAtHead(2)
    myLinkedList.addAtHead(5)
    myLinkedList.addAtTail(5)
    println(myLinkedList.get(5)) // return 2
    myLinkedList.deleteAtIndex(6)
    myLinkedList.deleteAtIndex(4)
}


