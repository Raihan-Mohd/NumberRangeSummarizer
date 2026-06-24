package numberrangesummarizer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NumberRangeSummarizerImplTest {

    private final NumberRangeSummarizer summarizer = new NumberRangeSummarizerImpl();

    @Test
    void groupsConsecutiveNumbersIntoARange() {
        assertEquals("1-3", summarizer.summarizeCollection(summarizer.collect("1,2,3")));
    }

    @Test
    void keepsNonConsecutiveNumbersSeparate() {
        assertEquals("1, 3, 5", summarizer.summarizeCollection(summarizer.collect("1,3,5")));
    }

    @Test
    void handlesAMixOfRangesAndSingles() {
        assertEquals("1-3, 5-6, 8", summarizer.summarizeCollection(summarizer.collect("1,2,3,5,6,8")));
    }
} 