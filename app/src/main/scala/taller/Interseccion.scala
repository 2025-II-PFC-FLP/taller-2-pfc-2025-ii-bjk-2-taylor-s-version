package taller2
import scala.annotation.tailrec

class Interseccion {
  def interseccion(a: List[Int], b: List[Int]): List[Int] = {
    @tailrec
    def interseccionI(c : List[Int], resultado: List[Int]): List[Int] =
      c match {
        case Nil => resultado
        case x :: xs =>
          if (b.contains(x) && !resultado.contains(x))
            interseccionI(xs, resultado :+ x)
          else
            interseccionI(xs, resultado)
      }
    interseccionI(a, List())
  }

}
