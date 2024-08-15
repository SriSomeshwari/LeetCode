import java.util.HashMap;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length < 3) {
            return points.length;
        }
        
        int maxPoints = 1;
        
        for (int i = 0; i < points.length; i++) {
            HashMap<String, Integer> slopeMap = new HashMap<>();
            int duplicates = 0;
            int currentMax = 0;
            
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                
                if (dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }
                
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;
                
                String slope = dy + "/" + dx;
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                currentMax = Math.max(currentMax, slopeMap.get(slope));
            }
            
            maxPoints = Math.max(maxPoints, currentMax + duplicates + 1);
        }
        
        return maxPoints;
    }
    
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(solution.maxPoints(points)); // Output: 4
    }
}
