package com.facebook.internal;

import com.facebook.C3642m;
import p183z1.C6436a;
import p183z1.C6442c;

/* renamed from: com.facebook.internal.u */
/* compiled from: InstallReferrerUtil */
public class C3555u {

    /* renamed from: com.facebook.internal.u$a */
    /* compiled from: InstallReferrerUtil */
    static class C3556a implements C6442c {

        /* renamed from: a */
        final /* synthetic */ C6436a f13269a;

        /* renamed from: b */
        final /* synthetic */ C3557b f13270b;

        C3556a(C6436a aVar, C3557b bVar) {
            this.f13269a = aVar;
            this.f13270b = bVar;
        }

        /* renamed from: a */
        public void mo12075a(int i) {
            if (i == 0) {
                try {
                    String a = this.f13269a.mo24258a().mo24264a();
                    if (a != null && (a.contains("fb") || a.contains("facebook"))) {
                        this.f13270b.mo11840a(a);
                    }
                    C3555u.m11880e();
                } catch (Exception unused) {
                }
            } else if (i == 2) {
                C3555u.m11880e();
            }
        }

        /* renamed from: b */
        public void mo12076b() {
        }
    }

    /* renamed from: com.facebook.internal.u$b */
    /* compiled from: InstallReferrerUtil */
    public interface C3557b {
        /* renamed from: a */
        void mo11840a(String str);
    }

    /* renamed from: b */
    private static boolean m11877b() {
        return C3642m.m12279e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    private static void m11878c(C3557b bVar) {
        C6436a a = C6436a.m28119b(C3642m.m12279e()).mo24260a();
        a.mo24259c(new C3556a(a, bVar));
    }

    /* renamed from: d */
    public static void m11879d(C3557b bVar) {
        if (!m11877b()) {
            m11878c(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m11880e() {
        C3642m.m12279e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
