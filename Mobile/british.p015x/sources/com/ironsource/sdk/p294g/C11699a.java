package com.ironsource.sdk.p294g;

/* renamed from: com.ironsource.sdk.g.a */
public final class C11699a extends C11710f {

    /* renamed from: h */
    private static String f52360h = "type";

    /* renamed from: i */
    private static String f52361i = "numOfAdUnits";

    /* renamed from: j */
    private static String f52362j = "firstCampaignCredits";

    /* renamed from: k */
    private static String f52363k = "totalNumberCredits";

    /* renamed from: l */
    private static String f52364l = "productType";

    /* renamed from: a */
    public String f52365a;

    /* renamed from: b */
    public String f52366b;

    /* renamed from: c */
    public boolean f52367c;

    /* renamed from: e */
    private String f52368e;

    /* renamed from: f */
    private String f52369f;

    /* renamed from: g */
    private String f52370g;

    public C11699a(String str) {
        super(str);
        boolean z;
        if (mo45019a(f52360h)) {
            this.f52368e = mo45022d(f52360h);
        }
        if (mo45019a(f52361i)) {
            this.f52366b = mo45022d(f52361i);
            z = true;
        } else {
            z = false;
        }
        this.f52367c = z;
        if (mo45019a(f52362j)) {
            this.f52369f = mo45022d(f52362j);
        }
        if (mo45019a(f52363k)) {
            this.f52370g = mo45022d(f52363k);
        }
        if (mo45019a(f52364l)) {
            this.f52365a = mo45022d(f52364l);
        }
    }
}
