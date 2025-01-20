package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    void start() {
        Scanner scanner = new Scanner(System.in);
        List<MenuItem> menuItems = new ArrayList<>();
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println(String.format("%-15s | W %-4.1f | %s",     // String.format() 문자열 고정된 폭 유지
                        (i + 1) + ". " + item.getname(),
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
                        selectedMenu.getname(),
                        selectedMenu.getPrice(),
                        selectedMenu.getDescription()));
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close();

    }
}
