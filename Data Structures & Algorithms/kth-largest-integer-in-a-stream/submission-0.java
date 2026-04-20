class KthLargest {

    List<Integer> list;
    int n;
    public KthLargest(int k, int[] nums) {
        list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        n = k;
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);

        return list.get(list.size()-n);
    }
}
