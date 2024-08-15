import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reorganizeString(String s) {

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = 
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> prevEntry = null;

      
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();

            result.append(currentEntry.getKey());

    
            currentEntry.setValue(currentEntry.getValue() - 1);

            if (prevEntry != null && prevEntry.getValue() > 0) {
                maxHeap.offer(prevEntry);
            }

        
            prevEntry = currentEntry;
        }

        
        return result.length() == s.length() ? result.toString() : "";
    }
}
