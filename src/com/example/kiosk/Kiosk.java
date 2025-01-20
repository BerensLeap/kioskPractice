package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    void start() {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println(String.format("%-15s | W %-4.1f | %s",     // String.format() 문자열 고정된 폭 유지
                        (i + 1) + ". " + item.getMenuName(),
                        item.getPrice(),
                        item.getDescription()));
            }
            System.out.println("0. 종료");
            System.out.print("선택: ");

            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (num > 0 && num <= menuItems.size()) {
                MenuItem selectedMenu = menuItems.get(num - 1);
                System.out.println(String.format("선택한 메뉴: %-15s | W %-4.1f | %s", // String.format() 문자열 고정된 폭 유지
                        selectedMenu.getMenuName(),
                        selectedMenu.getPrice(),
                        selectedMenu.getDescription()));
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close();

    }
}
