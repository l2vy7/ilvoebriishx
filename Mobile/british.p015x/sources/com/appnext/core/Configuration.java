package com.appnext.core;

import android.text.TextUtils;
import com.google.android.exoplayer2.C6540C;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public abstract class Configuration implements Serializable {
    public Boolean backButtonCanClose;
    private String categories = "";
    public String language = "";
    private String mSpecificCategories = "";
    public int maxVideoLength = 0;
    public int minVideoLength = 0;
    public Boolean mute;
    public String orientation = C3148Ad.ORIENTATION_DEFAULT;
    public String postback = "";

    /* renamed from: x */
    private static String m10649x(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (str.equals(URLDecoder.decode(str, C6540C.UTF8_NAME))) {
                return URLEncoder.encode(str, C6540C.UTF8_NAME);
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract SettingsManager mo10155g();

    public String getCategories() {
        return this.categories;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getMaxVideoLength() {
        return this.maxVideoLength;
    }

    public int getMinVideoLength() {
        return this.minVideoLength;
    }

    public boolean getMute() {
        Boolean bool = this.mute;
        return bool == null ? Boolean.parseBoolean(mo10155g().mo10732y("mute")) : bool.booleanValue();
    }

    public String getOrientation() {
        return this.orientation;
    }

    public String getPostback() {
        return this.postback;
    }

    public String getSpecificCategories() {
        return this.mSpecificCategories;
    }

    @Deprecated
    public boolean isBackButtonCanClose() {
        Boolean bool = this.backButtonCanClose;
        return bool == null ? Boolean.parseBoolean(mo10155g().mo10732y("can_close")) : bool.booleanValue();
    }

    public void setCategories(String str) {
        this.categories = m10649x(str);
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMaxVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Max Length must be higher than 0");
        } else if (i <= 0 || getMinVideoLength() <= 0 || i >= getMinVideoLength()) {
            this.maxVideoLength = i;
        } else {
            throw new IllegalArgumentException("Max Length cannot be lower than min length");
        }
    }

    public void setMinVideoLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Min Length must be higher than 0");
        } else if (i <= 0 || getMaxVideoLength() <= 0 || i <= getMaxVideoLength()) {
            this.minVideoLength = i;
        } else {
            throw new IllegalArgumentException("Min Length cannot be higher than max length");
        }
    }

    public void setMute(boolean z) {
        this.mute = Boolean.valueOf(z);
    }

    public void setOrientation(String str) {
        if (str == null) {
            throw new IllegalArgumentException("orientation type");
        } else if (str.equals(C3148Ad.ORIENTATION_AUTO) || str.equals(C3148Ad.ORIENTATION_DEFAULT) || str.equals(C3148Ad.ORIENTATION_LANDSCAPE) || str.equals(C3148Ad.ORIENTATION_PORTRAIT)) {
            this.orientation = str;
        } else {
            throw new IllegalArgumentException("Wrong orientation type");
        }
    }

    public void setPostback(String str) {
        this.postback = m10649x(str);
    }

    public void setSpecificCategories(String str) {
        this.mSpecificCategories = m10649x(str);
    }
}
