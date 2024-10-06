package DTO;
import java.util.Scanner;

public class Statue extends Item {
    private int weight;         // Trọng lượng của tượng
    private String colour;      // Màu sắc của tượng

    public Statue() {}

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    // Phương thức getter và setter
    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }
    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    // Phương thức nhập dữ liệu cho tượng
    public void inputStatue() {
        input();  // Gọi phương thức input() của lớp cha (Item)
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập trọng lượng: ");
        while (true) {
            try {
                weight = Integer.parseInt(sc.nextLine());
                if (weight > 0) break;  // Chỉ chấp nhận trọng lượng > 0
                System.out.print("Trọng lượng không hợp lệ, vui lòng nhập trọng lượng > 0: ");
            } catch (NumberFormatException e) {
                System.out.print("Dữ liệu không hợp lệ, vui lòng nhập số: ");
            }
        }
        
        System.out.print("Nhập màu sắc: ");
        colour = sc.nextLine();
    }

    // Phương thức xuất dữ liệu cho tượng
    public void outputStatue() {
        output();  // Gọi phương thức output() của lớp cha (Item)
        System.out.println("Trọng lượng: " + weight);
        System.out.println("Màu sắc: " + colour);
    }
}
