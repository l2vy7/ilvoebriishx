package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rb3 extends n93<Void> implements Runnable {

    /* renamed from: i */
    private final Runnable f38618i;

    public rb3(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.f38618i = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final String mo18119h() {
        String valueOf = String.valueOf(this.f38618i);
        StringBuilder sb = new StringBuilder(valueOf.length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        try {
            this.f38618i.run();
        } catch (Throwable th) {
            mo18664w(th);
            o43.m20756b(th);
            throw new RuntimeException(th);
        }
    }
}
