package com.startapp;

/* renamed from: com.startapp.a9 */
/* compiled from: Sta */
public class C11787a9 implements Runnable {

    /* renamed from: a */
    private final Runnable f52587a;

    public C11787a9(Runnable runnable) {
        this.f52587a = runnable;
    }

    public void run() {
        try {
            this.f52587a.run();
        } catch (Throwable th) {
            C12356u2.m53525c(th);
        }
    }
}
