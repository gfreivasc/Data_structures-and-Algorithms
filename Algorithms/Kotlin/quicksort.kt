import java.util.*
 
fun <E : Comparable<E>> qsort(list: List<E>): List<E> {
    if (list.size <= 1) return list

    val pivot = list[list.size / 2]
    val eq = list.filter { it == pivot }
    val pre = list.filter { it < pivot }
    val post = list.filter { it > pivot }
    println("qsort now: $pre + $eq + $post")
    return qsort(pre) + eq + qsort(post)
}

fun main() {
    val list = listOf(1, 6, 4, 5, 9, 10, 3, 19, 22, 20, 18, 11)
    val sorted = qsort(list)
    println("Unsorted: $list")
    println("Sorted: $sorted")
}
