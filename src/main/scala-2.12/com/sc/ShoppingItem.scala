package com.sc

import com.sc.FoodType.FoodType
import com.sc.ItemType.ItemType

/**
  * Created by kumar on 19/01/2017.
  */
case class ShoppingItem(id:Int, name:String, price: BigDecimal, itemType: ItemType, foodType:FoodType)


object ItemType extends Enumeration{
    type  ItemType = Value
    val Cold, Hot = Value
}

object FoodType extends Enumeration{
    type  FoodType = Value
    val Drink, Food = Value
}

object ShoppingItem{
    val Cola = new ShoppingItem(1, "Cola", .50, ItemType.Cold, FoodType.Drink)
    val Coffee = new ShoppingItem(2, "Coffee", 1.00, ItemType.Hot, FoodType.Drink)
    val CheeseSandwich = new ShoppingItem(3, "Cheese Sandwich", 2.00, ItemType.Cold, FoodType.Food)
    val SteakSandwich = new ShoppingItem(4, "Steak Sandwich", 4.50, ItemType.Hot, FoodType.Food)
}