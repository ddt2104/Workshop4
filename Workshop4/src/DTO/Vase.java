package DTO;
import java.util.Scanner;

public class Vase extends Item {
    private int height;         // Chiều cao của bình
    private String material;    // Chất liệu của bình

    public Vase() {}

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    // Phương thức getter và setter
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    // Phương thức nhập dữ liệu cho bình
    public void inputVase() {
        input();  // Gọi phương thức input() của lớp cha (Item) để nhập giá trị và người tạo
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        while (true) {
            try {
                height = Integer.parseInt(sc.nextLine());
                if (height > 0) break;  // Chỉ chấp nhận chiều cao > 0
                System.out.print("Chiều cao không hợp lệ, vui lòng nhập chiều cao > 0: ");
            } catch (NumberFormatException e) {
                System.out.print("Dữ liệu không hợp lệ, vui lòng nhập số: ");
            }
        }
        
        System.out.print("Nhập chất liệu: ");
        material = sc.nextLine();
    }

    // Phương thức xuất dữ liệu cho bình
    public void outputVase() {
        output();  // Gọi phương thức output() của lớp cha (Item) để xuất giá trị và người tạo
        System.out.println("Chiều cao: " + height);
        System.out.println("Chất liệu: " + material);
    }
}

