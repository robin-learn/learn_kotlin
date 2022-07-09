package com.example.learn_flow

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch


fun count(): Flow<Int> = flow {
    var x = 0
    while (true) {
        if (x > 20) {
            break
        }
        emit(x)
        x = x.plus(1)
    }
}

fun main() {
    GlobalScope.launch {
        count().map {
            "this is $it"
        }
    }
}