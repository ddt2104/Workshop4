package DTO;
import java.util.Scanner;

public class Painting extends Item {
    private int height;         // Chiều cao của tranh
    private int width;          // Chiều rộng của tranh
    private boolean isWatercolour;  // Có phải tranh màu nước không
    private boolean isFramed;       // Có khung hay không

    public Painting() {}

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    // Phương thức getter và setter
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public boolean getIsWatercolour() { return isWatercolour; }
    public void setIsWatercolour(boolean isWatercolour) { this.isWatercolour = isWatercolour; }
    public boolean getIsFramed() { return isFramed; }
    public void setIsFramed(boolean isFramed) { this.isFramed = isFramed; }

    // Phương thức nhập dữ liệu cho tranh
    public void inputPainting() {
        input();  // Gọi phương thức input() của lớp cha (Item)
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
        
        System.out.print("Nhập chiều rộng: ");
        while (true) {
            try {
                width = Integer.parseInt(sc.nextLine());
                if (width > 0) break;  // Chỉ chấp nhận chiều rộng > 0
                System.out.print("Chiều rộng không hợp lệ, vui lòng nhập chiều rộng > 0: ");
            } catch (NumberFormatException e) {
                System.out.print("Dữ liệu không hợp lệ, vui lòng nhập số: ");
            }
        }

        System.out.print("Có phải tranh màu nước (true/false)? ");
        isWatercolour = Boolean.parseBoolean(sc.nextLine());

        System.out.print("Có khung không (true/false)? ");
        isFramed = Boolean.parseBoolean(sc.nextLine());
    }

    // Phương thức xuất dữ liệu cho tranh
    public void outputPainting() {
        output();  // Gọi phương thức output() của lớp cha (Item)
        System.out.println("Chiều cao: " + height);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Tranh màu nước: " + isWatercolour);
        System.out.println("Có khung: " + isFramed);
    }
}
