package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class d93<V, X extends Throwable, F, T> extends ra3<V> implements Runnable {
    @CheckForNull

    /* renamed from: i */
    mb3<? extends V> f20255i;
    @CheckForNull

    /* renamed from: j */
    Class<X> f20256j;
    @CheckForNull

    /* renamed from: k */
    F f20257k;

    d93(mb3<? extends V> mb3, Class<X> cls, F f) {
        Objects.requireNonNull(mb3);
        this.f20255i = mb3;
        this.f20256j = cls;
        Objects.requireNonNull(f);
        this.f20257k = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract T mo18226E(F f, X x) throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public abstract void mo18227F(T t);

    /* access modifiers changed from: protected */
    @CheckForNull
    /* renamed from: h */
    public final String mo18119h() {
        String str;
        mb3<? extends V> mb3 = this.f20255i;
        Class<X> cls = this.f20256j;
        F f = this.f20257k;
        String h = super.mo18119h();
        if (mb3 != null) {
            String obj = mb3.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls != null && f != null) {
            String obj2 = cls.toString();
            String obj3 = f.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 29 + obj2.length() + obj3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(obj2);
            sb2.append("], fallback=[");
            sb2.append(obj3);
            sb2.append("]");
            return sb2.toString();
        } else if (h != null) {
            return h.length() != 0 ? str.concat(h) : new String(str);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo18120i() {
        mo18661t(this.f20255i);
        this.f20255i = null;
        this.f20256j = null;
        this.f20257k = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.mb3<? extends V> r0 = r10.f20255i
            java.lang.Class<X> r1 = r10.f20256j
            F r2 = r10.f20257k
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r1 != 0) goto L_0x0011
            r6 = 1
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            r5 = r5 | r6
            if (r2 != 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            r3 = r3 | r5
            if (r3 != 0) goto L_0x00ad
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L_0x0022
            goto L_0x00ad
        L_0x0022:
            r3 = 0
            r10.f20255i = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.ec3     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            if (r4 == 0) goto L_0x0031
            r4 = r0
            com.google.android.gms.internal.ads.ec3 r4 = (com.google.android.gms.internal.ads.ec3) r4     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            java.lang.Throwable r4 = r4.mo18655b()     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0032
        L_0x0031:
            r4 = r3
        L_0x0032:
            if (r4 != 0) goto L_0x003a
            java.lang.Object r5 = com.google.android.gms.internal.ads.bb3.m30656p(r0)     // Catch:{ ExecutionException -> 0x003c, all -> 0x0039 }
            goto L_0x0083
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            r5 = r3
            goto L_0x0083
        L_0x003c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L_0x0081
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            r9.append(r7)
            r9.append(r6)
            java.lang.String r6 = " threw "
            r9.append(r6)
            r9.append(r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L_0x0081:
            r4 = r5
            goto L_0x003a
        L_0x0083:
            if (r4 != 0) goto L_0x0089
            r10.mo18663v(r5)
            return
        L_0x0089:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r0 = r10.mo18226E(r2, r4)     // Catch:{ all -> 0x009b }
            r10.f20256j = r3
            r10.f20257k = r3
            r10.mo18227F(r0)
            return
        L_0x009b:
            r0 = move-exception
            r10.mo18664w(r0)     // Catch:{ all -> 0x00a4 }
            r10.f20256j = r3
            r10.f20257k = r3
            return
        L_0x00a4:
            r0 = move-exception
            r10.f20256j = r3
            r10.f20257k = r3
            throw r0
        L_0x00aa:
            r10.mo18665x(r0)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d93.run():void");
    }
}
