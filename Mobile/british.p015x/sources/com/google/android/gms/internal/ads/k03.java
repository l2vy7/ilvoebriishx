package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k03 {

    /* renamed from: e */
    private static volatile int f34092e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f34093f = 0;

    /* renamed from: a */
    private final Context f34094a;

    /* renamed from: b */
    private final Executor f34095b;

    /* renamed from: c */
    private final Task<j23> f34096c;

    /* renamed from: d */
    private final boolean f34097d;

    k03(Context context, Executor executor, Task<j23> task, boolean z) {
        this.f34094a = context;
        this.f34095b = executor;
        this.f34096c = task;
        this.f34097d = z;
    }

    /* renamed from: a */
    public static k03 m33808a(Context context, Executor executor, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new i03(context, taskCompletionSource));
        } else {
            executor.execute(new j03(taskCompletionSource));
        }
        return new k03(context, executor, taskCompletionSource.getTask(), z);
    }

    /* renamed from: g */
    static void m33809g(int i) {
        f34092e = i;
    }

    /* renamed from: h */
    private final Task<Boolean> m33810h(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        if (!this.f34097d) {
            return this.f34096c.continueWith(this.f34095b, h03.f32567a);
        }
        C8040p7 E = C8181t7.m37699E();
        E.mo34092y(this.f34094a.getPackageName());
        E.mo34089I(j);
        E.mo34091K(f34092e);
        if (exc != null) {
            E.mo34090J(o43.m20755a(exc));
            E.mo34088H(exc.getClass().getName());
        }
        if (str2 != null) {
            E.mo34086B(str2);
        }
        if (str != null) {
            E.mo34087C(str);
        }
        return this.f34096c.continueWith(this.f34095b, new g03(E, i));
    }

    /* renamed from: b */
    public final Task<Boolean> mo33004b(int i, String str) {
        return m33810h(i, 0, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    /* renamed from: c */
    public final Task<Boolean> mo33005c(int i, long j, Exception exc) {
        return m33810h(i, j, exc, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: d */
    public final Task<Boolean> mo33006d(int i, long j) {
        return m33810h(i, j, (Exception) null, (String) null, (Map<String, String>) null, (String) null);
    }

    /* renamed from: e */
    public final Task<Boolean> mo33007e(int i, long j, String str) {
        return m33810h(i, j, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    /* renamed from: f */
    public final Task<Boolean> mo33008f(int i, long j, String str, Map<String, String> map) {
        return m33810h(i, j, (Exception) null, str, (Map<String, String>) null, (String) null);
    }
}
