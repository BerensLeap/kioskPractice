package com.example.kiosk.menu;

import com.example.kiosk.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Burgers extends Menu{
    public Burgers() {
        super("Burgers", new ArrayList<>());
        items.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        items.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        items.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }
}
