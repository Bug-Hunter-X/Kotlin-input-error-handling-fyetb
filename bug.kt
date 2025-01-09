```kotlin
fun calculateArea(width: Int, height: Int): Int {
    return width * height
}

fun main() {
    val width = readLine()!!.toInt()
    val height = readLine()!!.toInt()
    println(calculateArea(width, height))
}
```