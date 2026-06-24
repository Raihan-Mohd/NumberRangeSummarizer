package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part:parts) {
            numbers.add(Integer.parseInt(part.trim()));

        }
        return numbers;

    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        List<Integer> numbers = new ArrayList<>(input);
        Collections.sort(numbers);
        if (numbers.isEmpty()) {
            return "";
        }

        List<String> result = new ArrayList<>();
        int rangeStart = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            int previous = numbers.get(i - 1);
            if (current - previous != 1) {        
                result.add(formatRange(rangeStart, previous));
                rangeStart = current;                
            }
        }
        result.add(formatRange(rangeStart, numbers.get(numbers.size() - 1)));

        return String.join(", ", result);
}

    private String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return start + "-" + end;
    }

}
