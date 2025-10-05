package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GrandeTest extends AnyFunSuite {
  val obj = new Grande()

  test("Grado de pertenencia a grande con n=10, d=2, e=2") {
    val g = obj.grande(2, 2)
    assert(g(10) > 0 && g(10) < 1)
  }

  test("Grado de pertenencia a grande con n muy grande tiende a 1") {
    val g = obj.grande(2, 2)
    assert(g(1000000) > 0.99)
  }

  test("Grado de pertenencia a grande con n pequeño tiende a 0") {
    val g = obj.grande(2, 2)
    assert(g(1) < 0.5)
  }

  test("Unión de dos conjuntos difusos") {
    val g1 = obj.grande(2, 2)
    val g2 = obj.grande(5, 2)
    val u = obj.union(g1, g2)
    assert(u(10) == math.max(g1(10), g2(10)))
  }

  test("Intersección de dos conjuntos difusos") {
    val g1 = obj.grande(2, 2)
    val g2 = obj.grande(5, 2)
    val i = obj.interseccion(g1, g2)
    assert(i(10) == math.min(g1(10), g2(10)))
  }

  test("Complemento de un conjunto difuso") {
    val g = obj.grande(2, 2)
    val c = obj.complemento(g)
    assert(math.abs(c(10) - (1 - g(10))) < 1e-9)
  }
}
