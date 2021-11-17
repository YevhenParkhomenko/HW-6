package com.yevhen_parkhomenko.main;

public class CelebrationService {
    public static void main(String[] args) {
        CelebrationFactory celebrationFactory = new CelebrationFactory();
        Celebration celebration = new CelebrationFactory().startCelebration("Birthday");
        celebration.letsCelebrate();
    }
}
