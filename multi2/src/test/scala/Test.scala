import org.scalatest.FunSuite

class Test extends FunSuite {
  val MARGARITA = PizzaType("Margarita", 5.0)
  val FUNGHI    = PizzaType("Funghi", 7.0)
  val PEPPERONI = PizzaType("Pepperoni", 6.5)

  val small   = Size("Small", 0.9)
  val regular = Size("Regular", 1.0)
  val large   = Size("Large", 1.5)

  val thin  = Crust("Thin")
  val thick = Crust("Thick")

  val salami = Meat("Salami", 1.0)

  val ketchup = Topping("Ketchup", 0.5)
  val garlic  = Topping("Garlic", 0.5)

  val lemonade = Drink("Lemonade", 2.0)

  val student = Discount(0.95)
  val senior  = Discount(0.93)

  val margarita  = Pizza(MARGARITA, large, thin)
  val funghi     = Pizza(FUNGHI, small, thin)
  val pepperoni1 = Pizza(PEPPERONI, large, thin, extraTopping = Some(garlic))
  val pepperoni2 = Pizza(PEPPERONI, regular, thick, extraTopping = Some(ketchup))

  val order = new Order("Albert",
                        "Mostowa 41",
                        new PhoneNumber("674365245"),
                        List(margarita, funghi, pepperoni1, pepperoni2),
                        List(lemonade, lemonade),
                        Some(student))
  /* println(s"Price by type: Pepperoni -> ${order.priceByType(PEPPERONI)}")
  println(s"order price = ${order.price}") */

  test("Check order.price") {
    assert(order.price == 33.535);
  }

  test("Check priceByType") {
    assert(order.priceByType(PEPPERONI) == Some(16.625));
  }
}
