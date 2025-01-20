package com.example.kiosk;

public enum Member {
    BASIC("일반", 0),
    VIP("특별",20),
    STUDENT("학생",10),
    SOLDIER("군인",10);

    private final String memberType;
    private final int discountRate;

    Member(String memberType, int discountRate) {
        this.memberType = memberType;
        this.discountRate = discountRate;
    }

    public String getMemberType() {
        return memberType;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
