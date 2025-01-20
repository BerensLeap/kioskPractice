package com.example.kiosk.menu;

import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Desserts extends Menu{
    public Desserts() {
        super("Desserts", new ArrayList<>());
        items.add(new MenuItem("Chocolate Custard", 4.9, "부드럽고 진한 초콜릿 커스터드"));
        items.add(new MenuItem("Vanilla Shake", 4.5, "달콤하고 부드러운 바닐라 쉐이크"));
        items.add(new MenuItem("Frozen Yogurt", 3.8, "상큼하고 건강한 프로즌 요거트"));
        items.add(new MenuItem("Choco Pie", 3.2, "촉촉한 초콜릿 파이"));
    }
}
