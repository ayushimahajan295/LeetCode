class Solution {
    public int mySqrt(int x) {
        if (x>0)
        {
            return (int)Math.floor((Math.pow(x,0.5)));
        }
        else
        {
            return 0;
        }
        
    }
}