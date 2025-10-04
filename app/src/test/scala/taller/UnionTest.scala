package taller2

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class UnionTest extends AnyFunSuite {
  val obj = new Union()

  test("A unido con B test 1") {
    assert(obj.union(List(1, 2), List(1, 2, 3, 4)) == List(1, 2, 3, 4))
  }

  test("A unido con B test 2") {
    assert(obj.union(List(1, 5), List(1, 2, 3, 4)) == List(1,5,2,3,4))
  }

  test("A unido con B test 3") {
    assert(obj.union(List(), List(1, 2, 3)) == List(1,2,3))
  }

  test("A unido con B test 4") {
    assert(obj.union(List(1, 2, 3), List(1, 2, 3)) == List(1,2,3))
  }

  test("A unido con B test 5") {
    assert(obj.union(List(1, 2, 3, 4, 5), List(1, 2, 3)) == List(1,2,3,4,5))
  }
}
