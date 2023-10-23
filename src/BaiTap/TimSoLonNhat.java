package BaiTap;

public class TimSoLonNhat {
    public static void main(String[] args) {
        int[] arr = {1, 6, 34, 67, 45, 23, 78, 65, 34, 2, 65, 45, 34, 21, 23, 78, 65};
        int[] numbers = {1, 6, 34, 67, 45, 23, 78, 65, 34, 2, 65, 45, 34, 21, 23, 78, 65}; // Mảng số nguyên rỗng

        try {
            int maxNumber = findMaxNumber(numbers);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxNumber(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("Mảng rỗng");
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
