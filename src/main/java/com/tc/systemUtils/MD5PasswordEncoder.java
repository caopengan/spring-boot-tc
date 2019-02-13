package com.tc.systemUtils;

import org.springframework.security.crypto.password.PasswordEncoder;

public class MD5PasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {

        return MD5Util.MD5Encode(String.valueOf(charSequence),"utf-8");
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        if(MD5Util.MD5Encode(String.valueOf(charSequence),"utf-8").equalsIgnoreCase(s)){
            return true;
        }
        return false;
    }
}
