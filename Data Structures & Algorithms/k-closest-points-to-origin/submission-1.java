class Solution {

    class Point{
        int x;
        int y;

        Point(int m, int n){
            x=m;
            y=n;
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>(new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                int dist1 = p1.x * p1.x + p1.y * p1.y;
                int dist2 = p2.x * p2.x + p2.y * p2.y;
                return Integer.compare(dist1, dist2);
            }
        });
        for(int[] p : points){
            pq.add(new Point(p[0],p[1]));
        }
        Point temp = null;
        List<Point> list = new ArrayList<>();
        int dis = 0;
        while (k>0) {
            list.add(pq.poll());
            k--;
            
            // System.out.println("inside "+pq.peek().x+", "+pq.peek().y);
            // System.out.println(pq.size()+", "+k+", "+i);
            // if(i==k-1){
            //     list.add(pq.poll());
            //     dis = list.get(0).x * list.get(0).x + list.get(0).y * list.get(0).y;
            // }
            // Point temp2 = pq.poll();
            // while(temp2 != null && !list.isEmpty()){
            //     System.out.println("inside-2 "+temp2.x+", "+temp2.y);
            //     int dis2 = temp2.x * temp2.x + temp2.y * temp2.y;
            //     if(dis == dis2)
            //         list.add(temp2); 
            //     temp2 = pq.poll(); 
            // }
        }
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).x+", "+list.get(i).y);
            res[i][0] = list.get(i).x;
            res[i][1] = list.get(i).y;
        }

        return res;
    }
}