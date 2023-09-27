class Solution {
    public:
        int maxProfit(vector<int>& prices) {
            int high = 1;
            int low = 0;
            int prof = 0;

            while(high<prices.length){
                if(prices[high]>prices[low]){
                    prof = Math.max(prices[high]-prices[low],prof)
                    high++;
                }
                else{
                    low=high;
                    high++;
                }
            }
            return prof;

            
        }
    };