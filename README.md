# Number Range Summariser

A Java implementation of the `NumberRangeSummarizer` interface. It takes a comma-delimited
string of integers and returns a comma-delimited summary that groups consecutive numbers
into ranges.

Example: `1,3,6,7,8,12,13,14,15,21,22,23,24,31` → `1, 3, 6-8, 12-15, 21-24, 31`

## Assumptions
- The input is sorted before summarising, so unsorted input is handled.
- An empty input returns an empty string.
- A single number is shown as itself (e.g. `3`), not `3-3`.
- Negative numbers are supported (they sort naturally).

## Running the tests
JUnit 5 tests, run from the command line:
\`\`\`
javac -d bin -cp lib/junit-platform-console-standalone-1.10.2.jar src/numberrangesummarizer/*.java
java -jar lib/junit-platform-console-standalone-1.10.2.jar execute -cp bin --scan-classpath
\`\`\`