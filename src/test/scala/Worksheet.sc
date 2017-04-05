val a = Array("a", "b", "c")
val map = a.zipWithIndex.map(i => i._1 -> i._2).toMap

map("b")


