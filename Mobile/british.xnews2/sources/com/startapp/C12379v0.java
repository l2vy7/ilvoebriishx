package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.startapp.v0 */
/* compiled from: Sta */
public abstract class C12379v0 {

    /* renamed from: a */
    public final Context f54863a;

    /* renamed from: b */
    public final C12128p7 f54864b;

    /* renamed from: c */
    public final Handler f54865c;

    /* renamed from: d */
    public final Runnable f54866d = new C12380a();

    /* renamed from: com.startapp.v0$a */
    /* compiled from: Sta */
    public class C12380a implements Runnable {
        public C12380a() {
        }

        public void run() {
            C12379v0.this.mo45343a();
        }
    }

    /* renamed from: com.startapp.v0$b */
    /* compiled from: Sta */
    public class C12381b implements C12128p7 {

        /* renamed from: a */
        public boolean f54868a;

        /* renamed from: b */
        public final /* synthetic */ C12128p7 f54869b;

        public C12381b(C12128p7 p7Var) {
            this.f54869b = p7Var;
        }

        /* renamed from: a */
        public synchronized void mo45392a(Object obj) {
            if (!this.f54868a) {
                this.f54868a = true;
                C12379v0.this.f54865c.removeCallbacksAndMessages((Object) null);
                this.f54869b.mo45392a(obj);
            }
        }
    }

    public C12379v0(Context context, C12128p7 p7Var) {
        this.f54863a = context;
        this.f54864b = new C12381b(p7Var);
        this.f54865c = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public abstract void mo45343a();
}
