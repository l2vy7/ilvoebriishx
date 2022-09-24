package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class nt2 {

    /* renamed from: a */
    private final mt2 f36128a = new mt2();

    /* renamed from: b */
    private int f36129b;

    /* renamed from: c */
    private int f36130c;

    /* renamed from: d */
    private int f36131d;

    /* renamed from: e */
    private int f36132e;

    /* renamed from: f */
    private int f36133f;

    nt2() {
    }

    /* renamed from: a */
    public final mt2 mo33755a() {
        mt2 a = this.f36128a.clone();
        mt2 mt2 = this.f36128a;
        mt2.f35616b = false;
        mt2.f35617c = false;
        return a;
    }

    /* renamed from: b */
    public final String mo33756b() {
        return "\n\tPool does not exist: " + this.f36131d + "\n\tNew pools created: " + this.f36129b + "\n\tPools removed: " + this.f36130c + "\n\tEntries added: " + this.f36133f + "\n\tNo entries retrieved: " + this.f36132e + "\n";
    }

    /* renamed from: c */
    public final void mo33757c() {
        this.f36133f++;
    }

    /* renamed from: d */
    public final void mo33758d() {
        this.f36129b++;
        this.f36128a.f35616b = true;
    }

    /* renamed from: e */
    public final void mo33759e() {
        this.f36132e++;
    }

    /* renamed from: f */
    public final void mo33760f() {
        this.f36131d++;
    }

    /* renamed from: g */
    public final void mo33761g() {
        this.f36130c++;
        this.f36128a.f35617c = true;
    }
}
