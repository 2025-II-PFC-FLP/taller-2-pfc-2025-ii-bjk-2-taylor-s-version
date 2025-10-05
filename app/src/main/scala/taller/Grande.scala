package taller

class Grande {
  type ConjDifuso = Int => Double

  def grande(d: Int, e: Int): ConjDifuso = {
    (n: Int) =>
      if (n <= 0) 0.0
      else math.pow(n.toDouble / (n + d).toDouble, e.toDouble)
  }

  def union(a: ConjDifuso, b: ConjDifuso): ConjDifuso =
    (n: Int) => math.max(a(n), b(n))

  def interseccion(a: ConjDifuso, b: ConjDifuso): ConjDifuso =
    (n: Int) => math.min(a(n), b(n))

  def complemento(a: ConjDifuso): ConjDifuso =
    (n: Int) => 1.0 - a(n)
}
