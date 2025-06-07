package LogicalPrograms;

public class SecondHeightAndCount {

    public static void main(String[] args) {
        /*
- The second highest score
- The number of students scoring second highest
Sample Output: "count" students have scored second highest "secondTopScore"
*/
        int[] input = {98, 100, 35, 75, 73, 81, 86, 75, 100, 125, 75, 35, 75, 17, 98, 100, 35, 75, 73, 81, 86};
        int max = input[0];
        int second = input[0];
        int count = 0;

        for (int i = 0; i < input.length; i++) {

            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > max) {
                    second = max;
                    max = input[j];
                }
            }
        }
        for (int i : input) {
            if (i == second) {
                count++;
            }
        }
        System.out.println("Second Height is : "+second+" and Count is : "+count);

    }
}
