package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.C4952a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* renamed from: com.ironsource.mediationsdk.utils.g */
public final class C11491g {

    /* renamed from: d */
    private static final C11491g f51568d = new C11491g();

    /* renamed from: a */
    private String f51569a = "";

    /* renamed from: b */
    private String f51570b = "";

    /* renamed from: c */
    private String f51571c = "";

    /* renamed from: a */
    public static C11491g m51272a() {
        return f51568d;
    }

    /* renamed from: b */
    public final String mo44552b() {
        if (TextUtils.isEmpty(this.f51569a)) {
            this.f51569a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f51569a;
    }

    /* renamed from: c */
    public final synchronized String mo44553c() {
        if (TextUtils.isEmpty(this.f51570b)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 32; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f51570b = sb.toString();
        }
        return this.f51570b;
    }

    /* renamed from: d */
    public final String mo44554d() {
        if (TextUtils.isEmpty(this.f51571c)) {
            try {
                this.f51571c = C4952a.C49531.m22718a(mo44553c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e) {
                String str = "Session key encryption exception: " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f51571c;
    }
}
