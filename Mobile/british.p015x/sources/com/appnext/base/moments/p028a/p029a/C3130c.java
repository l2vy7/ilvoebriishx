package com.appnext.base.moments.p028a.p029a;

import android.text.TextUtils;
import com.appnext.base.p023a.p025b.C3122a;
import org.json.JSONObject;

/* renamed from: com.appnext.base.moments.a.a.c */
public class C3130c extends C3122a {

    /* renamed from: cg */
    private String f12215cg;

    /* renamed from: ch */
    private String f12216ch;

    /* renamed from: ci */
    private String f12217ci;

    /* renamed from: cj */
    private String f12218cj;

    /* renamed from: ck */
    private String f12219ck;

    /* renamed from: cl */
    private String f12220cl;

    /* renamed from: cm */
    private String f12221cm;

    /* renamed from: cn */
    private JSONObject f12222cn;

    public C3130c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f12215cg = str;
        this.f12216ch = str2;
        this.f12217ci = str3;
        this.f12218cj = str4;
        this.f12219ck = str5;
        this.f12220cl = str6;
        this.f12221cm = str7;
        if (TextUtils.isEmpty(str8)) {
            this.f12222cn = null;
            return;
        }
        try {
            this.f12222cn = new JSONObject(str8);
        } catch (Throwable unused) {
            this.f12222cn = null;
        }
    }

    /* renamed from: Y */
    public final String mo10563Y() {
        return this.f12215cg;
    }

    /* renamed from: Z */
    public final String mo10564Z() {
        return this.f12216ch;
    }

    /* renamed from: aa */
    public final String mo10565aa() {
        return this.f12217ci;
    }

    /* renamed from: ab */
    public final String mo10566ab() {
        return this.f12218cj;
    }

    /* renamed from: ac */
    public final String mo10567ac() {
        return this.f12219ck;
    }

    /* renamed from: ad */
    public final String mo10568ad() {
        return this.f12220cl;
    }

    /* renamed from: ae */
    public final String mo10569ae() {
        return this.f12220cl;
    }

    /* renamed from: af */
    public final JSONObject mo10570af() {
        return this.f12222cn;
    }
}
