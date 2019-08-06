package inference

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty1

class DTO<T> {
    val test: List<T>? = emptyList()
    var q: Int = 0
    operator fun <R> get(prop: KProperty1<*, R>) : R = TODO()
    operator fun <R> set(prop: KMutableProperty1<*, R>, value: R) {}
}

fun main() {
    val listFunctions = listOf<DTO<Int>>()
    val intDTO = listFunctions.singleOrNull()

    if (intDTO != null) {
        intDTO[DTO<Int>::q] = intDTO[DTO<Int>::test]!!.size
        intDTO[DTO<Int>::q] = intDTO[DTO<Int>::test]!!.size
    }
}