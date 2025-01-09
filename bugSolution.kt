```kotlin
fun calculateArea(width: Int, height: Int): Int {
    return width * height
}

fun main() {
    var width: Int?
    var height: Int?

    do {
        print("Enter width: ")
        width = try {
            readLine()?.toInt()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter an integer.")
            null
        }
    } while (width == null)

    do {
        print("Enter height: ")
        height = try {
            readLine()?.toInt()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter an integer.")
            null
        }
    } while (height == null)

    println(calculateArea(width!!, height!!))
}
```