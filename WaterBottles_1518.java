/*
 * There are numBottles water bottles that are initially full of water. 
 * You can exchange numExchange empty water bottles from the market with 
 * one full water bottle.

   The operation of drinking a full water bottle turns it into an empty bottle.

   Given the two integers numBottles and numExchange, 
   return the maximum number of water bottles you can drink.
 * 
 * Input: numBottles = 15, numExchange = 4
   Output: 19
   Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
   Number of water bottles you can drink: 15 + 3 + 1 = 19.
 * 
 * 
 * */
package com.leetcode.problems;

class WaterBootles_1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int canBuyBottles;
        while(numBottles>=numExchange){
            canBuyBottles=numBottles/numExchange; 
            sum+=canBuyBottles;
            numBottles=numBottles/numExchange + numBottles%numExchange;
            if(numBottles/numExchange==0){
                break;
            }
        }
        return sum;
    }
}
