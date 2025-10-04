package taller2

class Inclusion {
  /**
   * Verifica si el conjunto A está incluido en el conjunto B.
   *
   * @param a Lista de enteros que representa el conjunto A
   * @param b Lista de enteros que representa el conjunto B
   * @return true si A es subconjunto de B, false en caso contrario
   */
  def inclusion(a: List[Int], b: List[Int]): Boolean = {
    a.toSet.subsetOf(b.toSet)
  }
}
