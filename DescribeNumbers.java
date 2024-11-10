// 211321823 amit homri

/**
 * class for number actions .
 */
public class DescribeNumbers {

    /** min func.
     * returns min  of array members
     * @param numbers array of ints.
     * @return min number
     */
    public static int min(int[] numbers) {
        int min = 500000;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    /**.
     * returns max  of array members
     * @param numbers array of ints
     * @return max number in array
     */
    public static int max(int[] numbers) {
        int max = -500000;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    /**.
     * returns average of array members
     * @param numbers array of ints
     * @return  avg of array members
     */
    public static float avg(int[] numbers) {
        float sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    /**.
     * convert string to ints
     * @param numbers list of stri
     * @return lists of ints
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] numbersArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbersArr[i] = Integer.parseInt(numbers[i]);
        }
        return numbersArr;
    }

    /**.
     * runs min max avg funcs on array of ints
     * @param args number given
     */
    public static void main(String[] args) {
        System.out.println("min: " + min(stringsToInts(args)));
        System.out.println("max: " + max(stringsToInts(args)));
        System.out.println("avg: " + avg(stringsToInts(args)));
    }
}
