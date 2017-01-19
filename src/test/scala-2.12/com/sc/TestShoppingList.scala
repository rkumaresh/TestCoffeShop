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

    "CoffeeShop items " should " not include service charge for drinks only items" in {
        new ShoppingList(List(), List(new ServiceCharge())).calculatePrice() shouldBe 0.0
        new ShoppingList(List(ShoppingItem.Cola, ShoppingItem.Coffee), List(new ServiceCharge())).calculatePrice() shouldBe 1.5
    }

    "CoffeeShop items " should " include service charge for items with only cold food" in {
        new ShoppingList(List(ShoppingItem.CheeseSandwich, ShoppingItem.Coffee), List(new ServiceCharge())).calculatePrice() shouldBe 3.30
    }

    "CoffeeShop items " should " include service charge for items with hot food" in {
        new ShoppingList(List(ShoppingItem.SteakSandwich, ShoppingItem.SteakSandwich, ShoppingItem.Coffee, ShoppingItem.Cola)
            , List(new ServiceCharge())).calculatePrice() shouldBe 12.60
    }
    "CoffeeShop items " should " include service charge but does not exceed £20.00 " in {
        val shoppingItems = List.fill(40)(ShoppingItem.SteakSandwich)

        new ShoppingList(shoppingItems, List(new ServiceCharge())).calculatePrice() shouldBe 200
    }

}
