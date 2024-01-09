package interview;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dates = IntStream.range(0, count)
                .mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "").trim();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        // Your logic using the sortDates method
        List<String> sortedDates = sortDates(dates);
        System.out.println("Sorted dates: " + sortedDates);

        bufferedReader.close();
    }

    public static List<String> sortDates(List<String> dates) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        List<Date> dateList = new ArrayList<>();

        for (String dateStr : dates) {
            try {
                Date date = sdf.parse(dateStr);
                dateList.add(date);
            } catch (ParseException e) {
                // Handle the parsing error, e.g., log it or skip the date
                System.err.println("Failed to parse date: " + dateStr);
            }
        }

        Collections.sort(dateList);

        return dateList.stream()
                .map(sdf::format)
                .collect(Collectors.toList());
    }

}
