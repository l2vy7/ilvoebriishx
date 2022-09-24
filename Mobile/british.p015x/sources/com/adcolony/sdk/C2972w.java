package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.w */
class C2972w {

    /* renamed from: a */
    private String f11934a;

    /* renamed from: b */
    private String f11935b;

    /* renamed from: c */
    private String f11936c;

    /* renamed from: d */
    private String f11937d = "%s_%s_%s";

    public C2972w(String str, String str2, String str3) {
        this.f11934a = str;
        this.f11935b = str2;
        this.f11936c = str3;
    }

    /* renamed from: a */
    public String mo10079a() {
        return this.f11936c;
    }

    /* renamed from: b */
    public String mo10080b() {
        return String.format(this.f11937d, new Object[]{mo10081c(), mo10082d(), mo10079a()});
    }

    /* renamed from: c */
    public String mo10081c() {
        return this.f11934a;
    }

    /* renamed from: d */
    public String mo10082d() {
        return this.f11935b;
    }
}
