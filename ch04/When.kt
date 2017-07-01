package When

fun main(args: Array<String>) {
  val x = 2
  val result = when (x) {
    1 -> "one"
    2, 3 -> "two or three"
    else -> {
      "unknown"
    }
  }
  println(result)

  val score = 75
  val grade = when {
    score >= 90 -> 'A'
    score >= 80 -> 'B'
    score >= 70 -> 'C'
    score >= 60 -> 'D'
    else        -> 'F'
  }
  println(grade)
}
