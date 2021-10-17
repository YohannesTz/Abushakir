package com.github.besufikad17.abushakir.util;

public class CalendarExceptions extends Exception {
    public static class BealNameException extends Exception {
        public BealNameException(String s) {
            super(s);
        }
    }

    public static class MonthNumberException extends Exception {
        public MonthNumberException(String s) {
            super(s);
        }
    }

    public static class WeekNumberException extends Exception {
        public WeekNumberException(String s) {
            super(s);
        }
    }

    public static class EthiopicNumberException extends Exception {
        public EthiopicNumberException(String s) {
            super(s);
        }
    }
}