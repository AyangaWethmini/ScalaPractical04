object Q1 extends App {
  val items = Array("rice", "sugar", "dhal", "milk")
  val quantity = Array(50, 50, 50, 50)

  def displayInventory(): Unit = {
    println("Item      Price")
    for (i <- items.indices) {
      println(items(i) + "   :   " + quantity(i))
    }
  }

  def restockItem(itemName: String, newquantity: Int): Unit = {
    val index = items.indexOf(itemName.toLowerCase())
    if (index != -1) {
      quantity(index) += newquantity
      println(s"${newquantity} ${itemName} added!")
      println("Modified Array: ")
      displayInventory()
    } else println("Item not found")
  }

  def sellItem(itemName: String, newquantity: Int): Unit = {
    val index = items.indexOf(itemName.toLowerCase())
    if (index != -1) {
      quantity(index) -= newquantity
      println(s"${newquantity} ${itemName} sold!")
      println("Modified Array: ")
      displayInventory()
    } else println("Item not found")
  }

  displayInventory()
  restockItem("rice", 2)
  sellItem("sugar", 5)

}
