import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PickPeaks {
    
    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = new HashMap<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                pos.add(i);
                peaks.add(arr[i]);
            } else if (arr[i] > arr[i - 1] && arr[i] == arr[i + 1]) {
                // Check for plateau-peak
                int plateauStart = i;
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
                if (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                    pos.add(plateauStart);
                    peaks.add(arr[plateauStart]);
                }
            }
        }

        result.put("pos", pos);
        result.put("peaks", peaks);
        return result;
      }
}
