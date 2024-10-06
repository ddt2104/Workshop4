package DTO;
import java.util.Scanner;

public class Item {
    protected int value;        // Giá trị của món đồ
    protected String creator;   // Người tạo ra món đồ

    public Item() {}

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    // Phương thức getter và setter
    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }
    public String getCreator() { return creator; }
    public void setCreator(String creator) { this.creator = creator; }

    // Phương thức nhập dữ liệu cho món đồ
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị: ");
        while (true) {
            try {
                value = Integer.parseInt(sc.nextLine());
                if (value > 0) break;  // Chỉ chấp nhận giá trị > 0
                System.out.print("Giá trị không hợp lệ, vui lòng nhập giá trị > 0: ");
            } catch (NumberFormatException e) {
                System.out.print("Dữ liệu không hợp lệ, vui lòng nhập một số: ");
            }
        }
        
        System.out.print("Nhập tên người tạo: ");
        do {
            creator = sc.nextLine();
            if (!creator.trim().isEmpty()) break;  // Tên người tạo không được rỗng
            System.out.print("Tên người tạo không được để trống, vui lòng nhập lại: ");
        } while (true);
    }

    // Phương thức xuất dữ liệu
    public void output() {
        System.out.println("Giá trị: " + value);
        System.out.println("Người tạo: " + creator);
    }
}
