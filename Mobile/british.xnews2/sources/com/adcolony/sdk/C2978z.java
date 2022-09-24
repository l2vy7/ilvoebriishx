package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.z */
class C2978z {

    /* renamed from: c */
    static C2978z f11943c = new C2978z(3, false);

    /* renamed from: d */
    static C2978z f11944d = new C2978z(3, true);

    /* renamed from: e */
    static C2978z f11945e = new C2978z(2, false);

    /* renamed from: f */
    static C2978z f11946f = new C2978z(2, true);

    /* renamed from: g */
    static C2978z f11947g = new C2978z(1, false);

    /* renamed from: h */
    static C2978z f11948h = new C2978z(1, true);

    /* renamed from: i */
    static C2978z f11949i = new C2978z(0, false);

    /* renamed from: j */
    static C2978z f11950j = new C2978z(0, true);

    /* renamed from: a */
    private int f11951a;

    /* renamed from: b */
    private boolean f11952b;

    /* renamed from: com.adcolony.sdk.z$a */
    static class C2979a {

        /* renamed from: a */
        StringBuilder f11953a = new StringBuilder();

        C2979a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2979a mo10084a(char c) {
            if (c != 10) {
                this.f11953a.append(c);
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2979a mo10088a(String str) {
            this.f11953a.append(str);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2979a mo10087a(Object obj) {
            if (obj != null) {
                this.f11953a.append(obj.toString());
            } else {
                this.f11953a.append("null");
            }
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2979a mo10085a(double d) {
            C2916s0.m10060a(d, 2, this.f11953a);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2979a mo10086a(int i) {
            this.f11953a.append(i);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2979a mo10089a(boolean z) {
            this.f11953a.append(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo10090a(C2978z zVar) {
            zVar.m10341a(this.f11953a.toString());
        }
    }

    C2978z(int i, boolean z) {
        this.f11951a = i;
        this.f11952b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10341a(String str) {
        C2684a.m9409c().mo9728o().mo9553a(this.f11951a, str, this.f11952b);
    }
}
