package taller

class Complemento {
  type ConjDifuso = Int => Double

  def complemento(c: ConjDifuso): ConjDifuso = {
    (n: Int) => 1.0 - c(n)
  }
}
