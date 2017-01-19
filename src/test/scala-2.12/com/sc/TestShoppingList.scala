package com.sc

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by kumar on 19/01/2017.
  */
@RunWith(classOf[JUnitRunner])
class TestShoppingList extends FlatSpec with Matchers{

    "CoffeeShop items " should " be calculated with correct price" in {
        new ShoppingList(List()).calculatePrice() shouldBe 0.0
        new ShoppingList(List(ShoppingItem.Cola, ShoppingItem.Coffee, ShoppingItem.CheeseSandwich)).calculatePrice() shouldBe 3.5
    }
}
