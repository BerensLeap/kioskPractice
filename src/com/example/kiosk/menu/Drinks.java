package com.example.kiosk.menu;

import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Drinks extends Menu{
    public Drinks() {
        super("Drinks", new ArrayList<>());
        items.add(new MenuItem("Coke", 2.5, "청량감 있는 탄산음료"));
        items.add(new MenuItem("Lemonade", 3.2, "상큼한 레몬이 들어간 수제 에이드"));
        items.add(new MenuItem("Iced Tea", 2.9, "달콤한 복숭아 향의 아이스티"));
        items.add(new MenuItem("Milkshake", 4.5, "바닐라, 초콜릿, 딸기 중 선택 가능한 쉐이크"));
    }
}
