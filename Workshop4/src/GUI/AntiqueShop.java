package GUI;
import DTO.*;

public class AntiqueShop {
    public static void main(String[] args) {
        Vase vase = new Vase();
        System.out.println("Enter details for Vase:");
        vase.inputVase();
        System.out.println("\nVase details:");
        vase.outputVase();

        Statue statue = new Statue();
        System.out.println("Enter details for Statue:");
        statue.inputStatue();
        System.out.println("\nStatue details:");
        statue.outputStatue();

        Painting painting = new Painting();
        System.out.println("Enter details for Painting:");
        painting.inputPainting();
        System.out.println("\nPainting details:");
        painting.outputPainting();
    }
}

