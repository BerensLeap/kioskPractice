package com.example.kiosk;

import com.example.kiosk.menu.Burgers;
import com.example.kiosk.menu.Desserts;
import com.example.kiosk.menu.Drinks;
import com.example.kiosk.menu.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    void start() {
        Scanner scanner = new Scanner(System.in);

        List<Menu> menus = new ArrayList<>();
        menus.add(new Burgers());
        menus.add(new Desserts());
        menus.add(new Drinks());

        while (true) {
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println((i + 1) + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");
            System.out.print("카테고리 선택: ");

            int categoryChoice = scanner.nextInt();
            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (categoryChoice > 0 && categoryChoice <= menus.size()) {
                Menu selectedCategory = menus.get(categoryChoice - 1);
                selectedCategory.displayCategory();                 // 선택된 카테고리 내 메뉴 항목을 출력

                System.out.print("메뉴 선택: ");
                int menuChoice = scanner.nextInt();
                MenuItem selectedMenuItem = selectedCategory.getChoice(menuChoice);

                if (selectedMenuItem != null) {
                    System.out.println("선택한 메뉴: " + selectedMenuItem);
                } else {
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
                }
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
