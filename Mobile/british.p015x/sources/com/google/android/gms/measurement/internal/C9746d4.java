package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
final class C9746d4 extends FutureTask implements Comparable {

    /* renamed from: b */
    private final long f46207b;

    /* renamed from: c */
    final boolean f46208c;

    /* renamed from: d */
    private final String f46209d;

    /* renamed from: e */
    final /* synthetic */ C9766f4 f46210e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9746d4(C9766f4 f4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f46210e = f4Var;
        C4604n.m20098k(str);
        long andIncrement = C9766f4.f46250l.getAndIncrement();
        this.f46207b = andIncrement;
        this.f46209d = str;
        this.f46208c = z;
        if (andIncrement == Long.MAX_VALUE) {
            f4Var.f21269a.mo19276j().mo19282q().mo38856a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C9746d4 d4Var = (C9746d4) obj;
        boolean z = this.f46208c;
        if (z != d4Var.f46208c) {
            return !z ? 1 : -1;
        }
        long j = this.f46207b;
        long j2 = d4Var.f46207b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f46210e.f21269a.mo19276j().mo19284t().mo38857b("Two tasks share the same index. index", Long.valueOf(this.f46207b));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f46210e.f21269a.mo19276j().mo19282q().mo38857b(this.f46209d, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9746d4(C9766f4 f4Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f46210e = f4Var;
        C4604n.m20098k("Task exception on worker thread");
        long andIncrement = C9766f4.f46250l.getAndIncrement();
        this.f46207b = andIncrement;
        this.f46209d = "Task exception on worker thread";
        this.f46208c = z;
        if (andIncrement == Long.MAX_VALUE) {
            f4Var.f21269a.mo19276j().mo19282q().mo38856a("Tasks index overflow");
        }
    }
}
