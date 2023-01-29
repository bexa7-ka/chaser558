fun huporenuse(a: Double, b: Double): Double {
    return Math.sqrt(a * a + b * b)
}
fun main(){
    val sideA = 3.0
    val sideB = 4.0
    val hyporenuse = huporenuse(sideA, sideB)
    println(hyporenuse)
}