package taller2

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class InterseccionTest extends AnyFunSuite {
  val obj = new Interseccion()

  test("A intersectado con B test 1") {
    assert(obj.interseccion(List(1, 2), List(1, 2, 3, 4)) == List(1, 2))
  }

  test("A intersectado con B test 2") {
    assert(obj.interseccion(List(1, 5), List(1, 2, 3, 4)) == List(1))
  }

  test("A intersectado con B test 3") {
    assert(obj.interseccion(List(), List(1, 2, 3)) == List())
  }

  test("A intersectado con B test 4") {
    assert(obj.interseccion(List(1, 2, 3), List(1, 2, 3)) == List(1, 2, 3))
  }

  test("A intersectado con B test 5") {
    assert(obj.interseccion(List(1, 2, 3, 4, 5), List(1, 2, 3)) == List(1, 2, 3))
  }
}

