package day06;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager {

    //    모든 메서드에서 사용하기 위한 변수 선언
    static Scanner sc = new Scanner(System.in);

    //    현재 저장된 사원 수
    static int count = 0;

    //    사원 정보를 저장할 배열
    static String[] memberNumbers = new String[count];
    static String[] memberName = new String[count];
    static int[] memberAge = new int[count];
    static String[] memberdepartments = new String[count];

    //    메뉴를 출력해주는 메서드
    static void showMenu() {
        System.out.println("\n======사원관리 프로그램======");
        System.out.println("# 1. 사원정보 신규등록");
        System.out.println("# 2. 모든 사원정보 보기");
        System.out.println("# 3. 사원정보 검색");
        System.out.println("# 4. 사원정보 수정");
        System.out.println("# 5. 사원정보 삭제");
        System.out.println("# 6. 프로그램 종료");
        System.out.println("=======================");
    }

    //    배열 추가 기능을 수행하는 메서드 / 나이
    static String[] append(String[] arr, String data) {
//        1. 배열의 크기를 1증가
        String[] temp = new String[count + 1];

//        2. 기존 배열데이터를 복사해서 신규 배열에 이동
        for (int i = 0; i < count; i++) {
            temp[i] = arr[i];
        }
//        3. 추가된 공간에 신규데이터를 삽입
        temp[temp.length - 1] = data;

//        4. temp의 주소를 arr로 옮기고 temp를 삭제
        return temp;
    }

    //    배열 추가 기능을 수행하는 메서드
    static int[] appendAge(int[] arr, int data) {
//        1. 배열의 크기를 1증가
        int[] temp = new int[count + 1];

//        2. 기존 배열데이터를 복사해서 신규 배열에 이동
        for (int i = 0; i < count; i++) {
            temp[i] = arr[i];
        }
//        3. 추가된 공간에 신규데이터를 삽입
        temp[temp.length - 1] = data;

//        4. temp의 주소를 arr로 옮기고 temp를 삭제
        return temp;

    }

    //    프로그램을 종료하는 메서드
    static void exitProgram() {
        System.out.println("프로그램을 종료합니까? [y/n]");
        System.out.print("> ");
        String answer = sc.next();

        switch (answer) {
            case "Y":
            case "y":
            case "ㅛ":
                sc.close();
                System.exit(0); //프로그램 종료 메서드
            case "N":
            case "n":
            case "ㅜ":
                System.out.println("프로그램 종료를 취소합니다.");
                return;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }

    }

    //    사원 정보 등록을 위한 메서드
    static void insertMemData() {

        System.out.println("# 사원정보 등록을 시작합니다.");
        System.out.print("- 사번 : ");
        String memberNum = sc.next();

        System.out.print("- 이름 : ");
        String name = sc.next();

        System.out.print("- 나이 : ");
        int age = sc.nextInt();

        System.out.print("- 부서 : ");
        String dep = sc.next();

//        배열 사이즈를 증가시키고 데이터를 추가하는 함수
        memberNumbers = append(memberNumbers, memberNum);
        memberName = append(memberName, name);
        memberAge = appendAge(memberAge, age);
        memberdepartments = append(memberdepartments, dep);
        count++;
    }

    static void showMemData() {
        System.out.println("\n============ 전체 사원 정보============");
        System.out.println(" 사원          이름          나이          부서");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s         %s          %d          %s", memberNumbers, memberName, memberAge, memberdepartments);
        }
    }

    public static void main(String[] args) {

        while (true) {

            showMenu();

            System.out.print("메뉴 입력 : ");
            int selectNum = sc.nextInt();
            switch (selectNum) {
                case 1:
                    insertMemData();
                    break;
                case 2:
                    showMemData();
                    break;
                case 3:
                    System.out.println("# 사원정보 등록을 시작합니다.");
                    break;
                case 4:
                    System.out.println("# 사원정보 등록을 시작합니다.");
                    break;
                case 5:
                    System.out.println("# 사원정보 등록을 시작합니다.");
                    break;
                case 6:
                    exitProgram();
                    System.out.println("# 사원정보 등록을 시작합니다.");
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }
        }
    }
}
