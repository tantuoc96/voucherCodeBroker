package com.abc.voucherbroker.constant;

public class VoucherConstant {

    public static class Regex {

        public final static String PHONE_GLOBAL_REGEX_STRING = "\\+(9[976]\\d|8[987530]\\d|6[987]\\d|5[90]\\d|42\\d|3[875]\\d|\n" +
                "2[98654321]\\d|9[8543210]|8[6421]|6[6543210]|5[87654321]|\n" +
                "4[987654310]|3[9643210]|2[70]|7|1)\\d{1,14}$";

        public final static String PRICE_REGEX = "^\\d+([.]\\d{1,2})?$";
    }
}
