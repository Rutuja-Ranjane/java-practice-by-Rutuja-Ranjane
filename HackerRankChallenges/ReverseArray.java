public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {19, 22, 3, 28, 26, 17, 18, 4, 28, 0};

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

