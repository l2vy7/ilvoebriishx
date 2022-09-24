package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sy2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    private static final sy2 f39121f = new sy2();

    /* renamed from: a */
    private Context f39122a;

    /* renamed from: b */
    private BroadcastReceiver f39123b;

    /* renamed from: c */
    private boolean f39124c;

    /* renamed from: d */
    private boolean f39125d;

    /* renamed from: e */
    private xy2 f39126e;

    private sy2() {
    }

    /* renamed from: a */
    public static sy2 m37611a() {
        return f39121f;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m37612b(sy2 sy2, boolean z) {
        if (sy2.f39125d != z) {
            sy2.f39125d = z;
            if (sy2.f39124c) {
                sy2.m37613h();
                if (sy2.f39126e == null) {
                    return;
                }
                if (sy2.mo34835f()) {
                    uz2.m38622d().mo35340i();
                } else {
                    uz2.m38622d().mo35339h();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m37613h() {
        boolean z = this.f39125d;
        for (fy2 g : qy2.m36822a().mo34441c()) {
            ez2 g2 = g.mo31962g();
            if (g2.mo31705k()) {
                wy2.m39303a().mo35690b(g2.mo31695a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: c */
    public final void mo34832c(Context context) {
        this.f39122a = context.getApplicationContext();
    }

    /* renamed from: d */
    public final void mo34833d() {
        this.f39123b = new ry2(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f39122a.registerReceiver(this.f39123b, intentFilter);
        this.f39124c = true;
        m37613h();
    }

    /* renamed from: e */
    public final void mo34834e() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f39122a;
        if (!(context == null || (broadcastReceiver = this.f39123b) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.f39123b = null;
        }
        this.f39124c = false;
        this.f39125d = false;
        this.f39126e = null;
    }

    /* renamed from: f */
    public final boolean mo34835f() {
        return !this.f39125d;
    }

    /* renamed from: g */
    public final void mo34836g(xy2 xy2) {
        this.f39126e = xy2;
    }
}
