import numberrangesummarizer.NumberRangeSummarizer;
import numberrangesummarizer.NumberRangeSummarizerImpl;

public class App {
    public static void main(String[] args){
        NumberRangeSummarizer s = new NumberRangeSummarizerImpl();
        System.out.println(s.summarizeCollection(s.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31"))); 
    }
}
