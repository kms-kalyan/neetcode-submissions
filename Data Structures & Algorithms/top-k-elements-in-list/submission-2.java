class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] res = new int[k];
        int in = 0,i=0;
        PriorityQueue<Integer> pq = new PriorityQueue();
        List<Integer> values = new ArrayList<>(map.values());
        for(int val : values)
            pq.add(val);

        int n = pq.size()-k;
        while(n>0){
            pq.poll();
            n--;
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(pq.contains(entry.getValue())){
                res[in] = entry.getKey();
                in++;
            }
        }
        
        
        return res;
    }

    // public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
    //     return map.entrySet()
    //             .stream()
    //             .sorted(Map.Entry.comparingByValue())
    //             .collect(Collectors.toMap(
    //                     Map.Entry::getKey,
    //                     Map.Entry::getValue,
    //                     (e1, e2) -> e1, // Merge function for duplicate keys (not applicable here as keys are unique)
    //                     LinkedHashMap::new // Ensure insertion order is preserved
    //             ));
    // }
}
