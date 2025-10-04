package taller2

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IgualdadTest extends AnyFunSuite {
  val obj = new Igualdad()

  test("Conjuntos iguales con el mismo orden") {
    assert(obj.igualdad(List(1, 2, 3), List(1, 2, 3)))
  }

  test("Conjuntos iguales con diferente orden") {
    assert(obj.igualdad(List(1, 2, 3), List(3, 2, 1)))
  }

  test("Conjuntos diferentes por un elemento") {
    assert(!obj.igualdad(List(1, 2, 3), List(1, 2, 4)))
  }

  test("Conjunto A vacío y B vacío (deben ser iguales)") {
    assert(obj.igualdad(List(), List()))
  }

  test("Conjunto A vacío y B no vacío (no son iguales)") {
    assert(!obj.igualdad(List(), List(1, 2, 3)))
  }
}
