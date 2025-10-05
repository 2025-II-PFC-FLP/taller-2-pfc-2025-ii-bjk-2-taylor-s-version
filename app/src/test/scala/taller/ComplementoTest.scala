package taller

import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ComplementoTest extends AnyFunSuite {
  val obj = new Complemento()

  val ejemplo: obj.ConjDifuso = (n: Int) => n.toDouble / (n + 1).toDouble
  val c = obj.complemento(ejemplo)

  test("Complemento en n=1") {
    assert(math.abs(c(1) - (1 - ejemplo(1))) < 1e-9)
  }

  test("Complemento en n=10") {
    assert(math.abs(c(10) - (1 - ejemplo(10))) < 1e-9)
  }

  test("Complemento en n=100") {
    assert(math.abs(c(100) - (1 - ejemplo(100))) < 1e-9)
  }

  test("Complemento nunca es negativo") {
    assert(c(10) >= 0.0)
  }

  test("Complemento nunca supera 1") {
    assert(c(10) <= 1.0)
  }
}