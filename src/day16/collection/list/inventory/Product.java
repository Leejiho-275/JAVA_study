package day16.collection.list.inventory;

import java.util.Scanner;

public class Product {

    // 제품 정보 필드 선언
    private String barcode; // 제품번호
    private String productName; // 제품명
    private int price; // 가격
    private int amount; // 재고수량
    private int totalPrice; // 재고총액

    public static Scanner sc = new Scanner(System.in);

    // 생성자 선언
    public Product() {
        while (true) {
            System.out.println("\n# 제품 정보 등록을 시작합니다.");
            System.out.print("- 바코드 : ");
            this.barcode = sc.next();

            System.out.print("- 제품명 : ");
            this.productName = sc.next();

            try {
                System.out.print("- 가격 : ");
                this.price = sc.nextInt();

                System.out.print("- 재고수량 : ");
                this.amount = sc.nextInt();

            } catch (Exception e) {
                System.out.println("가격과 수량은 숫자로만 입력해주세요.");
                sc.nextLine();
                continue;
            }
            System.out.print("- 재고총액 : ");
            this.totalPrice = this.price * this.amount;
            return;
        }
    } // 생성자 종료

    // setter getter

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        this.totalPrice = this.price * this.amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
        this.totalPrice = this.price * this.amount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barcode='" + barcode + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
