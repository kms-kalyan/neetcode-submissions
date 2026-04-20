class MedianFinder {

    List<Integer> mean;
    public MedianFinder() {
        mean = new ArrayList<>();
    }
    
    public void addNum(int num) {
        mean.add(num);
    }
    
    public double findMedian() {
        Collections.sort(mean);
        int len = mean.size();
        if(len%2 != 0)
            return mean.get(len/2);
        return ((double)(mean.get(len/2)+mean.get((len/2) - 1))/2);
    }
}
