package com.yevhen_parkhomenko.main;

public class CelebrationFactory {
    public Celebration startCelebration(String holiday)
    {
        if (holiday == null || holiday.isEmpty())
            return null;
        if ("Birthday".equals(holiday)) {
            return new BirthdayCelebration();
        }
        else if ("New Year".equals(holiday)) {
            return new NewYearCelebration();
        }
        else if ("Saint Valentine".equals(holiday)) {
            return new SaintValentineCelebration();
        }
        return null;
    }
}