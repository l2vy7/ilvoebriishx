package com.startapp;

import android.os.Handler;

/* renamed from: com.startapp.o3 */
/* compiled from: Sta */
public class C12105o3 implements C12071n3 {

    /* renamed from: a */
    public final Handler f53950a;

    public C12105o3(Handler handler) {
        this.f53950a = handler;
    }

    /* renamed from: a */
    public void mo45565a(Runnable runnable, long j) {
        this.f53950a.postDelayed(runnable, j);
    }

    public void execute(Runnable runnable) {
        this.f53950a.post(runnable);
    }

    /* renamed from: a */
    public void mo45564a(Runnable runnable) {
        this.f53950a.removeCallbacks(runnable);
    }
}
