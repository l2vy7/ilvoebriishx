package com.google.ads.interactivemedia.p039v3.internal;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ay */
/* compiled from: IMASDK */
public final class C3870ay {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static final C3870ay f15896a = new C3870ay();

    /* renamed from: b */
    private Context f15897b;

    /* renamed from: c */
    private BroadcastReceiver f15898c;

    /* renamed from: d */
    private boolean f15899d;

    /* renamed from: e */
    private boolean f15900e;

    /* renamed from: f */
    private C3876bd f15901f;

    private C3870ay() {
    }

    /* renamed from: a */
    public static C3870ay m15173a() {
        return f15896a;
    }

    /* renamed from: f */
    static /* synthetic */ void m15174f(C3870ay ayVar, boolean z) {
        if (ayVar.f15900e != z) {
            ayVar.f15900e = z;
            if (ayVar.f15899d) {
                ayVar.m15175h();
                if (ayVar.f15901f == null) {
                    return;
                }
                if (ayVar.mo14771e()) {
                    C3895bw.m16881b().mo15599c();
                } else {
                    C3895bw.m16881b().mo15601e();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m15175h() {
        boolean z = this.f15900e;
        for (C3846ap h : C3855aw.m14982a().mo14651e()) {
            C3882bj h2 = h.mo14171h();
            if (h2.mo15152e()) {
                C3875bc.m15575a().mo14885g(h2.mo15151d(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: b */
    public final void mo14768b(Context context) {
        this.f15897b = context.getApplicationContext();
    }

    /* renamed from: c */
    public final void mo14769c() {
        this.f15898c = new C3869ax(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f15897b.registerReceiver(this.f15898c, intentFilter);
        this.f15899d = true;
        m15175h();
    }

    /* renamed from: d */
    public final void mo14770d() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f15897b;
        if (!(context == null || (broadcastReceiver = this.f15898c) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.f15898c = null;
        }
        this.f15899d = false;
        this.f15900e = false;
        this.f15901f = null;
    }

    /* renamed from: e */
    public final boolean mo14771e() {
        return !this.f15900e;
    }

    /* renamed from: g */
    public final void mo14772g(C3876bd bdVar) {
        this.f15901f = bdVar;
    }
}
