class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = numBottles;
        int emp= numBottles;
        int fill=0;
            while(emp>=numExchange){
                fill++;
                emp=emp-numExchange;
                numExchange++;
                if(numExchange>emp){
                    emp=emp+fill;
                    if(emp>=numExchange){
                        fill++;
                        emp=emp-numExchange;
                    }
                    drunk=drunk+fill;
                }
            }
            return drunk;
    }
}