class Solution {
    public int divide(int x, int di) {
        int result=(int) x/di;
        if( x <= -2147483648   && di==-1) return Integer.MAX_VALUE ;
        return result;
    }
}