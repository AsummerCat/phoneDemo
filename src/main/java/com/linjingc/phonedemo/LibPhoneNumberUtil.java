package com.linjingc.phonedemo;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

/**
 * @author cxc
 */
public class LibPhoneNumberUtil {
    //    CountryCodeToRegionCodeMap 区号维护在这里
    private static final String DEFAULT_COUNTRY_ISO = "86";

    private static final PhoneNumberUtil PHONE_NUMBER_UTIL = PhoneNumberUtil.getInstance();

    /**
     * @param phoneNumber 手机号
     * @param areaCode    手机区号
     * @Description 手机校验逻辑
     */
    public static boolean doValid(String areaCode, String phoneNumber) {
        int code = Integer.parseInt(areaCode);
        long phone = Long.parseLong(phoneNumber);
        Phonenumber.PhoneNumber pn = new Phonenumber.PhoneNumber();
        pn.setCountryCode(code);
        pn.setNationalNumber(phone);
        return PHONE_NUMBER_UTIL.isValidNumber(pn);
    }


    /**
     * 验证国内手机号
     */
    public static boolean doValid(String phoneNumber) {
        return doValid(DEFAULT_COUNTRY_ISO, phoneNumber);
    }
}