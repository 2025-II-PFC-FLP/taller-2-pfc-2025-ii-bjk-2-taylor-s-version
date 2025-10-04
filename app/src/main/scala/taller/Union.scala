package taller2
import scala.annotation.tailrec

class Union {
  def union(a: List[Int], b: List[Int]): List[Int] = {
    @tailrec
    def unionI(c: List[Int], resultado: List[Int]): List[Int] =
      c match {
        case Nil => resultado
        case x :: xs =>
          if (resultado.contains(x))
            unionI(xs, resultado)
          else
            unionI(xs, resultado :+ x)
      }
    unionI(a ++ b, List())
  }
}
