//211321823 amit homri

/** class sort for sorting method.
 */
public class Sort {
    /**.
     * convert list string to numbers
     * @param numbers list of numbers to sort
     * @return list nums
     */
    public static int[] stringsToInts(String[] numbers) {
        int[] numbersArr = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbersArr[i] = Integer.parseInt(numbers[i + 1]);
        }
        return numbersArr;
    }

    /**.
     * sorts list of numbers by sign
     * @param numbers list of ints .
     * @param sign type of sorting .
     * @return  lists of numbers sorted/
     */
    public static int[] sort(int[] numbers, String sign) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (sign.equals("asc")) {
                    System.out.println("444");
                    if (numbers[j] > numbers[j + 1]) {
                        temp = numbers[j + 1];
                        numbers[j + 1] = numbers[j];
                        numbers[j] = temp;
                    }


                    //desc
                } else {
                    //System.out.println("5555");
                    if (numbers[j] < numbers[j + 1]) {
                        temp = numbers[j + 1];
                        numbers[j + 1] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
        return numbers;
    }

    /**
     * sorts list and prints it .
     * @param args list of strings ..
     */
    public static void main(String[] args) {
       // int [] y =stringsToInts(args);
        int[] x = sort(stringsToInts(args), args[1]);
        for (int j : x) {
            System.out.print(j + " ");

        }
    }
}
