package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.e */
class C2749e {

    /* renamed from: a */
    private boolean f10749a;

    C2749e() {
    }

    /* renamed from: a */
    public synchronized void mo9656a(long j) {
        if (!this.f10749a) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo9657a(boolean z) {
        this.f10749a = z;
        if (z) {
            notifyAll();
        }
    }

    /* renamed from: a */
    public boolean mo9658a() {
        return this.f10749a;
    }
}
