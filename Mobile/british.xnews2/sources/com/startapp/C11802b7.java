package com.startapp;

/* renamed from: com.startapp.b7 */
/* compiled from: Sta */
public class C11802b7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f52623a;

    /* renamed from: b */
    public final /* synthetic */ String f52624b;

    /* renamed from: c */
    public final /* synthetic */ long f52625c;

    /* renamed from: d */
    public final /* synthetic */ C11781a7 f52626d;

    public C11802b7(C11781a7 a7Var, String str, String str2, long j) {
        this.f52626d = a7Var;
        this.f52623a = str;
        this.f52624b = str2;
        this.f52625c = j;
    }

    public void run() {
        C11781a7 a7Var = this.f52626d;
        String str = this.f52623a;
        String str2 = this.f52624b;
        long j = this.f52625c;
        a7Var.getClass();
        try {
            a7Var.f52574b.mo45207a(str, str2, System.currentTimeMillis(), j);
        } catch (Throwable th) {
            if (a7Var.mo45136a(1)) {
                C5004d4.m22887a(th);
            }
        }
    }
}
