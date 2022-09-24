package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import p176y0.C6396a;

/* renamed from: com.facebook.d */
/* compiled from: AccessTokenTracker */
public abstract class C3445d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f12989d = "d";

    /* renamed from: a */
    private final BroadcastReceiver f12990a;

    /* renamed from: b */
    private final C6396a f12991b;

    /* renamed from: c */
    private boolean f12992c = false;

    /* renamed from: com.facebook.d$b */
    /* compiled from: AccessTokenTracker */
    private class C3447b extends BroadcastReceiver {
        private C3447b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                C3481f0.m11609T(C3445d.f12989d, "AccessTokenChanged");
                C3445d.this.mo11874d((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public C3445d() {
        C3489g0.m11689k();
        this.f12990a = new C3447b();
        this.f12991b = C6396a.m28074b(C3642m.m12279e());
        mo11875e();
    }

    /* renamed from: b */
    private void m11504b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f12991b.mo24227c(this.f12990a, intentFilter);
    }

    /* renamed from: c */
    public boolean mo11873c() {
        return this.f12992c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo11874d(AccessToken accessToken, AccessToken accessToken2);

    /* renamed from: e */
    public void mo11875e() {
        if (!this.f12992c) {
            m11504b();
            this.f12992c = true;
        }
    }

    /* renamed from: f */
    public void mo11876f() {
        if (this.f12992c) {
            this.f12991b.mo24229e(this.f12990a);
            this.f12992c = false;
        }
    }
}
