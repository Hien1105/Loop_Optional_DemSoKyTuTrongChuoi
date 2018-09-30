import java.util.Scanner;

public class Loop_Optional_DemSoKyTuTrongChuoi {
    public static void main(String[] args) {
        String s = "Ha Noi mua thu";
        char index;
        int count;
        count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào ký tự cần tìm: ");
        index =scanner.next().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (index == s.charAt(i)) count = count + 1;
        }
        System.out.print("Số ký tự " + index + " có trong chuỗi " + s + " là:" + count);
    }
}
