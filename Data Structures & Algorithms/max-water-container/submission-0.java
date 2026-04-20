class Solution {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1;
        int area=0,maxArea=0;
        while(l<r){
            area = Math.min(h[l],h[r])*(r-l);

            maxArea = Math.max(area,maxArea);
            if(h[l]<h[r])
                l++;
            else r--;
        }

        return maxArea;
    }
}
