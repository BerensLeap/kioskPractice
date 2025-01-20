package com.example.kiosk.menu;

import com.example.kiosk.MenuItem;

import java.util.List;

public abstract class Menu implements Category {

    private String categoryName;
    protected List<MenuItem> items; // BurgersMenu, 등에서 접근 가능

    public Menu(String categoryName, List<MenuItem> items) {
        this.categoryName = categoryName;
        this.items = items;
    }

    @Override
    public void displayCategory() {
        System.out.println("[ " + categoryName + " MENU ]");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    @Override
    public MenuItem getChoice(int num) {
        if (num > 0 && num <= items.size()) {
            return items.get(num - 1);
        }
        return null;
    }


    @Override
    public String getCategoryName() {
        return categoryName;
    }




}
