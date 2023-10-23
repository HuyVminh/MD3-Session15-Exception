package BaiTap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhTong2SoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soThuNhat, soThuHai;
        try {
            System.out.println("Nhập vào số thứ nhất: ");
            soThuNhat = scanner.nextInt();

            System.out.println("Nhập vào số thứ hai: ");
            soThuHai = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Giá trị không hợp lệ.");
            return;
        }

        int tong = soThuNhat + soThuHai;
        System.out.println("Tổng hai số là: " + tong);

        scanner.close();
    }
}
