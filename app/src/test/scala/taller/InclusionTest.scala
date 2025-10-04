package taller2

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class InclusionTest extends AnyFunSuite {
  val obj = new Inclusion()

  test("A incluido en B correctamente") {
    assert(obj.inclusion(List(1, 2), List(1, 2, 3, 4)))
  }

  test("A no incluido en B (un elemento falta)") {
    assert(!obj.inclusion(List(1, 5), List(1, 2, 3, 4)))
  }

  test("Conjunto A vacío siempre está incluido en B") {
    assert(obj.inclusion(List(), List(1, 2, 3)))
  }

  test("Conjunto A igual a B (debe estar incluido)") {
    assert(obj.inclusion(List(1, 2, 3), List(1, 2, 3)))
  }

  test("Conjunto A más grande que B (no puede estar incluido)") {
    assert(!obj.inclusion(List(1, 2, 3, 4, 5), List(1, 2, 3)))
  }
}
