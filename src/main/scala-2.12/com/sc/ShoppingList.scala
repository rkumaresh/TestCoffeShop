package com.sc

/**
  * Created by kumar on 19/01/2017.
  */
class ShoppingList(list: List[ShoppingItem]) {
    def calculatePrice() : BigDecimal = {
        list.map(x => x.price).sum
    }

}
