package com.sc

/**
  * Created by kumar on 19/01/2017.
  */
class ShoppingList(list: List[ShoppingItem], serviceChargeList: List[ServiceCharge]) {
    def this(list: List[ShoppingItem]){
        this(list, List())
    }

    def calculatePrice() : BigDecimal = {
        val shoppingListPrice = list.map(x => x.price).sum
        val serviceChargePrice = serviceChargeList.map(x => x.calculatePrice(list)).sum
        shoppingListPrice + serviceChargePrice
    }

}
