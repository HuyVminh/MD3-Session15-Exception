package BaiTap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuyenDoiChuoiVeSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String str = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            try {
                int number = Integer.parseInt(str.valueOf(str.charAt(i)));
                list.add(number);
                System.out.println("Đã thêm số " + number + " vào mảng");
            } catch (NumberFormatException e) {
                System.out.println("Lỗi : ký tự không phải số nguyên");
                list.add(0);
            }
        }
        System.out.println("Danh sách mảng số nguyên : " + list);
    }
}
