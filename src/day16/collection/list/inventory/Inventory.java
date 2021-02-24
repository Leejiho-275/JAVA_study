package day16.collection.list.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // 메서드 선언

    // 제품 정보 등록 기능
    public void insert(Product product) {
        products.add(product);
    }

    public void viewAll() {
        for (Product s : products) {
            System.out.println(s);
        }
    }

    // 제품 정보 개별조회 기능
    public void view(Product product) {
        System.out.println(product);
    }

    // 제품명 수정 기능
    public void updateProductName(Product product, String newProductName) {
        if (products.contains(product)) {
            Product p = products.get(products.indexOf(product));
            p.setProductName(newProductName);
            System.out.printf("제품명이 %s으로 변경되었습니다.\n", newProductName);
        } else {
            System.out.println("검색하신 제품은 존재하지 않습니다.");
        }
    }

    // 제품 가격 수정 기능
    public void updatePrice(Product product, int newPrice) {
        if (products.contains(product)) {
            Product p = products.get(products.indexOf(product));
            p.setPrice(newPrice);
            System.out.printf("가격이 %d원으로 변경되었습니다.\n", newPrice);
            // 총액 갱신
            p.setTotalPrice(newPrice * p.getAmount());
        } else {
            System.out.println("검색하신 제품은 존재하지 않습니다.");
        }
    }

    // 제품 재고 수량 수정 기능
    public void updateAmount(Product product, int newAmount) {
        if (products.contains(product)) {
            Product p = products.get(products.indexOf(product));
            p.setAmount(newAmount);
            System.out.printf("재고수량이 %d로 변경되었습니다.\n", newAmount);
            p.setTotalPrice(newAmount * p.getPrice());
        } else {
            System.out.println("검색하신 제품은 존재하지 않습니다.");
        }
    }

    // 제품 정보 삭제 기능
    public void delete(Product product) {
        products.remove(product);
    }

    // 바코드 번호로 리스트에서 특정 제품 객체를 찾아서 리턴하는 메서드
    public Product getProduct(String barcode) {
        for (Product product : products) {
            if (barcode.equals(product.getBarcode())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
