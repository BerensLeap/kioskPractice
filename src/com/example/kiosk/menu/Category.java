package com.example.kiosk.menu;

import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.List;

public interface Category { // 메서드 시그니처만 선언

    List<MenuItem> menuitems = new ArrayList<>();
    void displayCategory(); // 카테고리 출력

    MenuItem getChoice(int num); // 사용자가 선택한 메뉴 반환

    String getCategoryName(); // 카테고리 이름 반환



}
