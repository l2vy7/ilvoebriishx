package com.facebook;

import android.content.Intent;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import p177y0.C6396a;

/* renamed from: com.facebook.w */
/* compiled from: ProfileManager */
public final class C3754w {

    /* renamed from: d */
    private static volatile C3754w f13866d;

    /* renamed from: a */
    private final C6396a f13867a;

    /* renamed from: b */
    private final C3753v f13868b;

    /* renamed from: c */
    private Profile f13869c;

    C3754w(C6396a aVar, C3753v vVar) {
        C3489g0.m11687i(aVar, "localBroadcastManager");
        C3489g0.m11687i(vVar, "profileCache");
        this.f13867a = aVar;
        this.f13868b = vVar;
    }

    /* renamed from: b */
    static C3754w m12656b() {
        if (f13866d == null) {
            synchronized (C3754w.class) {
                if (f13866d == null) {
                    f13866d = new C3754w(C6396a.m28074b(C3642m.m12279e()), new C3753v());
                }
            }
        }
        return f13866d;
    }

    /* renamed from: d */
    private void m12657d(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f13867a.mo24228d(intent);
    }

    /* renamed from: f */
    private void m12658f(Profile profile, boolean z) {
        Profile profile2 = this.f13869c;
        this.f13869c = profile;
        if (z) {
            if (profile != null) {
                this.f13868b.mo12610c(profile);
            } else {
                this.f13868b.mo12608a();
            }
        }
        if (!C3481f0.m11618b(profile2, profile)) {
            m12657d(profile2, profile);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Profile mo12611a() {
        return this.f13869c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo12612c() {
        Profile b = this.f13868b.mo12609b();
        if (b == null) {
            return false;
        }
        m12658f(b, false);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo12613e(Profile profile) {
        m12658f(profile, true);
    }
}
