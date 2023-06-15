class MyLinkedList() {

    data class Node(
        val `val`: Int,
        var next: Node? = null
    )

    var head: Node? = null

    fun get(index: Int): Int  = getNode(index)?.`val` ?: -1

    fun addAtHead(`val`: Int) {
        val oldHead = head
        head = Node(`val`, oldHead)
        println(head)
    }

    fun addAtTail(`val`: Int) {
        val newNode = Node(`val`, null)
        if (head == null) head = newNode
        else if (head?.next == null) head?.next = newNode
        else {
            var lastNode: Node? = head?.next
            while (lastNode?.next != null) {
                lastNode = lastNode.next
            }
            lastNode?.next = newNode
        }
        println(head)
    }

    fun addAtIndex(index: Int, `val`: Int) {
        if (index == 0) {
            addAtHead(`val`)
            return
        }

        val prevNode = getNode(index-1)
        val nextNode = prevNode?.next
        val newNode = Node(`val`, nextNode)
        prevNode?.next = newNode
        println(head)
    }

    fun deleteAtIndex(index: Int) {
        if (index == 0) {
            head = head?.next
            println(head)
            return
        }

        val prevNode = getNode(index-1)
        val nextNode = prevNode?.next?.next
        prevNode?.next = nextNode
        println(head)
    }

    private fun getNode(index: Int): Node? {
        val x =  when (index) {
            0 -> head
            1 -> head?.next
            else ->  {
                var node = head?.next
                for (i in 1 until index) {
                    node = node?.next
                }
                node
            }
        }
        println("getting node at index $index. node found: $x")
        return x
    }
}