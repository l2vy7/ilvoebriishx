package com.adcolony.sdk;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.adcolony.sdk.a0 */
class C2686a0 {

    /* renamed from: e */
    static final SimpleDateFormat f10588e = new SimpleDateFormat("yyyyMMdd'T'HHmmss.SSSZ", Locale.US);

    /* renamed from: f */
    static final String f10589f = "message";

    /* renamed from: g */
    static final String f10590g = "timestamp";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Date f10591a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f10592b;

    /* renamed from: c */
    protected String f10593c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2972w f10594d;

    /* renamed from: com.adcolony.sdk.a0$a */
    static class C2687a {

        /* renamed from: a */
        protected C2686a0 f10595a = new C2686a0();

        C2687a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2687a mo9541a(int i) {
            int unused = this.f10595a.f10592b = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2687a mo9542a(C2972w wVar) {
            C2972w unused = this.f10595a.f10594d = wVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2687a mo9543a(String str) {
            this.f10595a.f10593c = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2687a mo9544a(Date date) {
            Date unused = this.f10595a.f10591a = date;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2686a0 mo9545a() {
            if (this.f10595a.f10591a == null) {
                Date unused = this.f10595a.f10591a = new Date(System.currentTimeMillis());
            }
            return this.f10595a;
        }
    }

    C2686a0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9536b() {
        return this.f10592b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9537c() {
        int i = this.f10592b;
        if (i == -1) {
            return "Fatal";
        }
        if (i == 0) {
            return "Error";
        }
        if (i == 1) {
            return "Warn";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN LOG LEVEL" : "Debug";
        }
        return "Info";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9538d() {
        return this.f10593c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo9539e() {
        return f10588e.format(this.f10591a);
    }

    public String toString() {
        return mo9539e() + " " + mo9537c() + "/" + mo9533a().mo10079a() + ": " + mo9538d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9535a(C2972w wVar) {
        this.f10594d = wVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9534a(int i) {
        this.f10592b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2972w mo9533a() {
        return this.f10594d;
    }
}
