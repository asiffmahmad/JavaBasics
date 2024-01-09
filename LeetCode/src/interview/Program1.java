package interview;

//Given an integer array arr and an integer d, write a Java function getTripletCount that calculates the number of distinct triplets (i, j, k) such that 0 < i < j < k ≤ n and the sum of the elements at these indices (arr[i] + arr[j] + arr[k]) is divisible by d.
//
//Write the function getTripletCount and provide an example of using this function with the array arr = [3, 3, 4, 7, 8] and the divisor d = 5. Finally, calculate and print the number of distinct triplets that satisfy the given condition.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, count)
                .mapToObj(i -> {
                    try {
                        return Integer.parseInt(bufferedReader.readLine().replaceAll("\\s+$", "").trim());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(Collectors.toList());

        int d = Integer.parseInt(bufferedReader.readLine().trim());

        // Your logic using the getTripletCount method
        int tripletCount = getTripletCount(a, d);
        System.out.println("Number of distinct triplets: " + tripletCount);

        bufferedReader.close();
    }

    public static int getTripletCount(List<Integer> arr, int d) {
        int n = arr.size();
        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr.get(i) + arr.get(j) + arr.get(k)) % d == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
