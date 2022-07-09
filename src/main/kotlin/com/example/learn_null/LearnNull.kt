package com.example.learn_null

data class Node(
    val id: Int,
    val name: String,
    var parentNode: Node? = null
) {
    var isExpand = true

    fun isParentExpand(): Boolean {
        return if (parentNode == null) {
            false
        } else {
            parentNode!!.isExpand
        }
    }

    fun isExpandTwo() = parentNode != null && parentNode!!.isExpand

    fun isExpandThree() = parentNode?.isExpand != null
}

fun main() {
    val parentNode = Node(0, "language", null)
    val node = Node(1, "kotlin", parentNode)
    println(node.isParentExpand())
    println(node.isExpandTwo())
    println(node.isExpandThree())
}