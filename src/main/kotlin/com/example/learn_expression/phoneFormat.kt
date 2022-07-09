package com.example.learn_expression

fun isPhone(phoneStr: String) : Boolean {
    return phoneStr.matches(Regex("1\\d{10}"))
}

fun main() {
    val phone1 = "13111111111"
    val phone2 = "23111111111"
    val phone3 = "13111111111"
    println(isPhone(phone1))
    println(isPhone(phone2))
}