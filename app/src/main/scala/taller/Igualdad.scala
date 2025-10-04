package taller2

class Igualdad {
  /**
   * Verifica si dos listas representan conjuntos iguales.
   *
   * @param a Lista de enteros que representa el conjunto A
   * @param b Lista de enteros que representa el conjunto B
   * @return true si ambos conjuntos son iguales, false en caso contrario
   */
  def igualdad(a: List[Int], b: List[Int]): Boolean = {
    a.toSet == b.toSet
  }
}
