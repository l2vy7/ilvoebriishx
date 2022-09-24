package com.unity3d.scar.adapter.common;

/* renamed from: com.unity3d.scar.adapter.common.a */
/* compiled from: DispatchGroup */
public class C12484a {

    /* renamed from: a */
    private int f55233a;

    /* renamed from: b */
    private Runnable f55234b;

    public C12484a() {
        this.f55233a = 0;
        this.f55233a = 0;
    }

    /* renamed from: d */
    private void m53818d() {
        Runnable runnable;
        if (this.f55233a <= 0 && (runnable = this.f55234b) != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public synchronized void mo46889a() {
        this.f55233a++;
    }

    /* renamed from: b */
    public synchronized void mo46890b() {
        this.f55233a--;
        m53818d();
    }

    /* renamed from: c */
    public void mo46891c(Runnable runnable) {
        this.f55234b = runnable;
        m53818d();
    }
}
