package day06;

import java.util.Scanner;

public class EmployeeManager {

    //    모든 메서드에서 사용하기 위한 변수 선언
    static Scanner sc = new Scanner(System.in);

    //    현재 저장된 사원 수
    static int count = 0;

    //    사원 정보를 저장할 배열
    static String[] memberNumbers = new String[count];
    static String[] memberName = new String[count];
    static String[] memberAge = new String[count];
    static String[] memberDepartments = new String[count];

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

    //    배열 추가 기능을 수행하는 메서드
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

    //    사번 입력
    static String checkDuplicatememNum() {
        String memberNum = sc.next();

        while (true) {
//            flag가 true면 중복되었음을 의미
            boolean flag = false;
            for (int i = 0; i < memberNumbers.length; i++) {
                if (memberNum.equals(memberNumbers[i])) {
//                    사번이 중복된 경우
                    flag = true;
                    System.out.println("이미 등록된 사번입니다.");
                    System.out.print("- 사번 재입력 : ");
                    memberNum = sc.next();
                    break;
                }
            }
//            사번 중복이 안된 경우
            if (!flag) {
                return memberNum;
            }
        }

    }

    //    사원 정보 등록을 위한 메서드
    static void insertMemData() {

        System.out.println("# 사원정보 등록을 시작합니다.");
        System.out.print("- 사번 : ");
        String memberNum = checkDuplicatememNum();

        System.out.print("- 이름 : ");
        String name = sc.next();

        System.out.print("- 나이 : ");
        String age = sc.next();

        System.out.print("- 부서 : ");
        String dep = sc.next();

//        배열 사이즈를 증가시키고 데이터를 추가하는 함수
        memberNumbers = append(memberNumbers, memberNum);
        memberName = append(memberName, name);
        memberAge = append(memberAge, age);
        memberDepartments = append(memberDepartments, dep);
        count++;
        System.out.printf("%s님의 정보가 정상 등록되었습니다.\n", memberNum);
    }

    static void showMemData() {

        if (count > 0) {
            System.out.println("\n================= 전체 사원 정보 =================");
            System.out.printf(" %s%12s%12s%12s\n", "사번", "이름", "나이", "부서");
            System.out.println("================================================");
            for (int i = 0; i < count; i++) {
                System.out.printf(" %s%14s%13s세%12s\n", memberNumbers[i], memberName[i], memberAge[i], memberDepartments[i]);
            }
            System.out.println("================================================");
        } else {
            System.out.println("등록된 사원정보가 없습니다.");
        }
    }

    //    사원 번호를 입력받아 리턴하는 메서드
    static String inputMemNumber(String data) {
        System.out.printf("%s하실 사원의 번호를 입력하세요.\n", data);
        System.out.print("> ");
        return sc.next();

    }

    //    사원 번호를 검색하는 메서드
    static int searchIndex(String memberNum) {
        for (int idx = 0; idx < count; idx++) {
            if (memberNum.equals(memberNumbers[idx])) {
                return idx;
            }
        }
        return -1;
    }

    //    사원 개별 조회를 수행하는 메서드
    static void searchMemData() {
        int index = searchIndex(inputMemNumber("조회"));

        if (index > -1) {
            System.out.println("\n================ 조회된 사원 정보 =================");
            System.out.printf(" %s%12s%12s%12s\n", "사번", "이름", "나이", "부서");
            System.out.println("================================================");
            System.out.printf("%s%14s%13s세%12s\n", memberNumbers[index], memberName[index], memberAge[index], memberDepartments[index]);
            System.out.println("================================================");
        } else {
            System.out.println("조회하신 사원정보는 존재하지 않습니다.");
        }

    }

    //    사원 정보 수정의 세부처리 메서드
    static void dataModify(int index) {
        int num = sc.nextInt();
        switch (num) {
            case 1:
                String beforeAge = memberAge[index];
                System.out.println("- 변경하실 나이를 입력하세요.");
                System.out.print("> ");
                memberAge[index] = sc.next();
                System.out.printf("나이가 %s세에서 %s세로 변경되었습니다.\n", beforeAge, memberAge[index]);

                break;
            case 2:
                String beforeDep = memberAge[index];
                System.out.println("- 변경하실 부서를 입력하세요.");
                System.out.print("> ");
                memberAge[index] = sc.next();
                System.out.printf("부서가 %s에서 %s로 변경되었습니다.\n", beforeDep, memberAge[index]);

                break;
            case 3:
                System.out.println("# 정보수정을 취소합니다.");

                break;
            default:
                System.out.println("변경 메뉴를 잘못 입력했습니다.");
        }
    }

    //    사원 개별 수정을 수행하는 메서드
    static void modifyMemData() {
        int index = searchIndex(inputMemNumber("수정"));

        if (index > -1) {
            System.out.printf("# %s님의 정보를 수정합니다.", memberNumbers[index]);
            System.out.println("[ 1. 나이 변경 | 2. 부서 변경 | 3. 취소 ]");
            dataModify(index);
        } else {
            System.out.println("조회하신 사원정보는 존재하지 않습니다.");
        }
    }

    static void processDel(int index) {
//        삭제될 데이터의 이름정보 복사
        String delName = memberNumbers[index];

        memberNumbers = remove(memberNumbers, index);
        memberName = remove(memberName, index);
        memberAge = remove(memberAge, index);
        memberDepartments = remove(memberDepartments, index);
        count--;

        System.out.printf("# %s님의 정보가 정상 삭제되었습니다.\n", delName);
    }

    static String[] remove(String[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        String[] temp = new String[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        return temp;
    }

    //    사원 개별 삭제를 수행하는 메서드
    static void deleteMemData() {
        String memNumber = inputMemNumber("삭제");
        int index = searchIndex(memNumber);
        if (index > -1) {
            System.out.printf("# %s님의 정보를 삭제합니다.[y/n]", memberNumbers[index]);
            System.out.print("> ");
            String trigger = sc.next();
            switch (trigger) {
                case "y":
                case "Y":
                case "ㅛ":
                    processDel(index);
                    break;

                case "n":
                case "N":
                case "ㅜ":
                    System.out.println("# 정보 삭제를 취소합니다.");
                    break;
            }
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
                    searchMemData();
                    break;
                case 4:
                    modifyMemData();
                    break;
                case 5:
                    deleteMemData();
                    break;
                case 6:
                    exitProgram();
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }
        }
    }
}
