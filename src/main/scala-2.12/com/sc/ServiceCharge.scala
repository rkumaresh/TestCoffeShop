package com.sc

/**
  * Created by kumar on 19/01/2017.
  */
class ServiceCharge() {
    val maximumServiceCharge = 20.00
    def calculatePrice(list: List[ShoppingItem] ): BigDecimal ={

        if(!list.exists(x => x.foodType == FoodType.Food))
            return 0.0

        val total = list.map(x => x.price).sum
        val totalPrice = {
            if(list.exists(x => x.itemType == ItemType.Hot && x.foodType == FoodType.Food))
                total.*(.20)
            else
                total.*(.10)
        }
        if(totalPrice > maximumServiceCharge)
            maximumServiceCharge
        else
            totalPrice

    }
}
