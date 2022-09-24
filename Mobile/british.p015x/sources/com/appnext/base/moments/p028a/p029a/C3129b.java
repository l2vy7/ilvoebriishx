package com.appnext.base.moments.p028a.p029a;

import com.appnext.base.p023a.p025b.C3122a;
import java.util.Date;

/* renamed from: com.appnext.base.moments.a.a.b */
public final class C3129b extends C3122a {

    /* renamed from: cc */
    private String f12211cc;

    /* renamed from: cd */
    private String f12212cd;

    /* renamed from: ce */
    private String f12213ce;

    /* renamed from: cf */
    private Date f12214cf;
    private String mDataType;

    public C3129b(String str, String str2, String str3) {
        this(str, str, str2, (Date) null, str3);
    }

    /* renamed from: U */
    public final String mo10558U() {
        return this.f12211cc;
    }

    /* renamed from: V */
    public final String mo10559V() {
        return this.f12213ce;
    }

    /* renamed from: W */
    public final Date mo10560W() {
        return this.f12214cf;
    }

    /* renamed from: X */
    public final String mo10561X() {
        return this.mDataType;
    }

    public final String getType() {
        return this.f12212cd;
    }

    public C3129b(String str, String str2, String str3, Date date, String str4) {
        this.f12211cc = str;
        this.f12212cd = str2;
        this.f12213ce = str3;
        this.f12214cf = date;
        this.mDataType = str4;
    }
}
