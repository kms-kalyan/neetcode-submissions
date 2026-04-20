public class TimeMap {
    private Map<String, Map<Integer, List<String>>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!keyStore.containsKey(key)) {
            keyStore.put(key, new HashMap<>());
        }
        if (!keyStore.get(key).containsKey(timestamp)) {
            keyStore.get(key).put(timestamp, new ArrayList<>());
        }
        keyStore.get(key).get(timestamp).add(value);
    }

    public String get(String key, int timestamp) {
        if (!keyStore.containsKey(key)) {
            return "";
        }
        int seen = 0;

        for (int time : keyStore.get(key).keySet()) {
            if (time <= timestamp) {
                seen = Math.max(seen, time);
            }
        }
        if (seen == 0) return "";
        int back = keyStore.get(key).get(seen).size() - 1;
        return keyStore.get(key).get(seen).get(back);
    }
}

// class TimeMap {

//     Map<Map<String,String>,Integer> map;
//     public TimeMap() {
//         map = new HashMap<>();
//     }
    
//     public void set(String key, String value, int timestamp) {
//         Map<String,String> temp = new HashMap<>();
//         temp.put(key,value);
//         map.put(temp,timestamp);
//     }
    
//     public String get(String key, int timestamp) {
//         //System.out.println("inside get: "+key+", "+timestamp);

//         int prev = 0;
//         String res = "";
//         for(Map.Entry<Map<String, String>, Integer> mOut : map.entrySet()){
//             Map<String, String> m = mOut.getKey();
//             System.out.println("Map: "+m.toString()+", "+map.get(m));
            
//             for(String s : m.keySet()){
//                 if(s.equalsIgnoreCase(key) && map.get(m) == timestamp){
//                     res = m.get(s);
//                     //System.out.println("Returning");
//                     return res;
//                 }
//                 //System.out.println(s.equalsIgnoreCase(key)+" "+map.get(m)+" "+prev+" "+m.get(s));
//                 if(s.equalsIgnoreCase(key) && map.get(m)>=prev){
//                     prev = map.get(m);
//                     res = m.get(s);
//                 }
//             }
//         }

//         return res;
//     }
// }
