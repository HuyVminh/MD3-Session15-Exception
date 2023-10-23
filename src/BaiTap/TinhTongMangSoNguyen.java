package BaiTap;

public class TinhTongMangSoNguyen {
    public static void main(String[] args) {
        int[] number = {2, 5, 4, 7, 5, 34, 8, 6, 4, 4, 3, 23};
        String[] string = {"qưe", "qq", "qưe", "ádád"};
        int sum = 0;
        for (int j : number) {
            try {
                sum += j;
            } catch (Exception e) {
                if (e instanceof NumberFormatException) {
                    System.out.println("Phần tử trong mảng không phải là số");
                } else if (e instanceof ArrayIndexOutOfBoundsException) {
                    System.out.println("Lỗi : Mảng không đủ phần tử");
                }else if(e instanceof NullPointerException){
                    System.out.println("");
                }
            }

        }
        System.out.println("Tổng của mảng là: " + sum);
    }
}

