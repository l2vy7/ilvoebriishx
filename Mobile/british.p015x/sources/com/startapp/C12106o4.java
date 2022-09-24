package com.startapp;

import android.os.Build;

/* renamed from: com.startapp.o4 */
/* compiled from: Sta */
public abstract class C12106o4 implements Runnable, Comparable<C12106o4> {

    /* renamed from: a */
    public final C5004d4 f53951a;

    /* renamed from: b */
    public final C11899f4 f53952b;

    /* renamed from: c */
    public final C11956i4 f53953c;

    /* renamed from: d */
    public final Exception f53954d = new Exception();

    public C12106o4(C5004d4 d4Var, C11899f4 f4Var, C11956i4 i4Var) {
        this.f53951a = d4Var;
        this.f53952b = f4Var;
        this.f53953c = i4Var;
    }

    /* renamed from: a */
    public abstract int mo45566a() throws Exception;

    /* renamed from: a */
    public Throwable mo45637a(Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            th.addSuppressed(this.f53954d);
        }
        return th;
    }

    public int compareTo(Object obj) {
        return ((C12106o4) obj).f53952b.f52936c - this.f53952b.f52936c;
    }

    public final void run() {
        C11956i4 i4Var;
        int i = 0;
        try {
            i = mo45566a();
            i4Var = this.f53953c;
            if (i4Var == null) {
                return;
            }
        } catch (OutOfMemoryError unused) {
            if (this.f53953c != null) {
                this.f53953c.mo45138a(this.f53951a, 0);
                return;
            }
            return;
        } catch (Throwable th) {
            C11956i4 i4Var2 = this.f53953c;
            if (i4Var2 != null) {
                i4Var2.mo45138a(this.f53951a, 0);
            }
            throw th;
        }
        i4Var.mo45138a(this.f53951a, i);
    }
}
