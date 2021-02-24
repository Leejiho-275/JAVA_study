package day16.collection.list.inventory;

import java.util.Scanner;

public class Main {

    public static Inventory inventory = new Inventory();
    public static Scanner sc = new Scanner(System.in);

    // 제품 기능 등록 처리
    private static void addProduct() {
        Product newProduct = new Product();
        inventory.insert(newProduct);
        System.out.printf("제품(%s) 등록이 완료되었습니다.\n", newProduct.getProductName());
    }

    // 제품 전체 검색 기능
    private static void viewAllProduct() {
        inventory.viewAll();
    }

    // 제품 개별 검색 기능
    private static void searchProduct() {
        System.out.println("\n# 조회하실 제품의 바코드 번호를 입력하세요.");
        System.out.print("> ");
        String barcode = sc.next();

        Product product = inventory.getProduct(barcode);

        if (product != null) {
            System.out.println("\n# 조회 결과");
            System.out.println("- 제품명 : " + product.getProductName());
            System.out.println("- 가격 : " + product.getPrice() + "원");
            System.out.println("- 수량 : " + product.getAmount() + "개");
            System.out.println("- 총액 : " + product.getTotalPrice() + "원");
        } else {
            System.out.println("해당 제품은 존재하지 않습니다.");
        }
    }

    private static void modifyProduct() {
        System.out.println("수정할 제품의 바코드 번호를 입력하세요.");
        System.out.print("> ");
        String barcode = sc.next();
        Product product = inventory.getProduct(barcode);

        if (product != null) {

            System.out.printf("\n# [%s]%s 제품의 수정을 시작합니다.\n", barcode, product.getProductName());
            System.out.println("[ 1. 가격 수정 | 2. 수량 수정 | 3. 제품명 수정 | 4. 수정 취소 ]");
            System.out.print("> ");

            int select = 0;
            try {
                select = sc.nextInt();
            } catch (Exception e) {
                System.out.println("숫자를 입력하세요.");
            }
            switch (select) {
                case 1:
                    System.out.println("# 수정하실 가격을 입력하세요.");
                    System.out.print("> ");
                    int newPrice = sc.nextInt();
                    inventory.updatePrice(product, newPrice);
                    break;
                case 2:
                    System.out.println("# 수정하실 수량을 입력하세요.");
                    System.out.print("> ");
                    int newAmount = sc.nextInt();
                    inventory.updateAmount(product, newAmount);
                    break;
                case 3:
                    System.out.println("# 수정하실 제품명을 입력하세요.");
                    System.out.print("> ");
                    String newName = sc.next();
                    inventory.updateProductName(product, newName);
                    break;
                default:
                    System.out.println("항목이 존재하지 않습니다.");
            }
        } else {
            System.out.println("해당 제품은 존재하지 않습니다.");
        }
    }

    private static void deleteProduct() {
        System.out.println("삭제할 제품의 바코드 번호를 입력하세요.");
        System.out.print("> ");
        String barcode = sc.next();
        Product product = inventory.getProduct(barcode);

        if (product != null) {
            inventory.delete(product);
            System.out.println("삭제가 정상 처리되었습니다.");
        } else {
            System.out.println("\n# 해당 제품은 존재하지 않습니다.");
        }
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n*** 재고 관리 프로그램 ***");
            System.out.println("# 1. 제품 정보 등록");
            System.out.println("# 2. 제품 정보 전체조회");
            System.out.println("# 3. 제품 정보 개별조회");
            System.out.println("# 4. 제품 정보 수정");
            System.out.println("# 5. 제품 정보 삭제");
            System.out.println("# 6. 프로그램 종료");
            System.out.print("\n- 메뉴 입력 : ");

            int num = 0;
            try {
                num = sc.nextInt();
            } catch (Exception e) {
                System.out.print("메뉴를 숫자로만 입력해주세요!");
                sc.nextLine();
                continue;
            }
            switch (num) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    viewAllProduct();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    modifyProduct();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0); // 프로그램 강제 종료
                    break;
                default:
                    System.out.println("해당 메뉴는 없는 메뉴입니다.");
            }
        }
    }
}
