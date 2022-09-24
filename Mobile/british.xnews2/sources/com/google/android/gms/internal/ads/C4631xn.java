package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: com.google.android.gms.internal.ads.xn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4631xn {

    /* renamed from: a */
    private final Object f20982a = new Object();

    /* renamed from: b */
    int f20983b;

    /* renamed from: c */
    private final List<C4630wn> f20984c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C4630wn mo18950a(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f20982a
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.wn> r1 = r8.f20984c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r9 = "Queue empty"
            com.google.android.gms.internal.ads.co0.zze(r9)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.wn> r1 = r8.f20984c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x004c
            java.util.List<com.google.android.gms.internal.ads.wn> r9 = r8.f20984c     // Catch:{ all -> 0x0061 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0061 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L_0x0026:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.wn r5 = (com.google.android.gms.internal.ads.C4630wn) r5     // Catch:{ all -> 0x0061 }
            int r6 = r5.mo18930b()     // Catch:{ all -> 0x0061 }
            if (r6 <= r1) goto L_0x0039
            r4 = r3
        L_0x0039:
            if (r6 <= r1) goto L_0x003d
            r7 = r6
            goto L_0x003e
        L_0x003d:
            r7 = r1
        L_0x003e:
            if (r6 <= r1) goto L_0x0041
            r2 = r5
        L_0x0041:
            int r3 = r3 + 1
            r1 = r7
            goto L_0x0026
        L_0x0045:
            java.util.List<com.google.android.gms.internal.ads.wn> r9 = r8.f20984c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x004c:
            java.util.List<com.google.android.gms.internal.ads.wn> r1 = r8.f20984c     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.wn r1 = (com.google.android.gms.internal.ads.C4630wn) r1     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x005c
            java.util.List<com.google.android.gms.internal.ads.wn> r9 = r8.f20984c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x005c:
            r1.mo18939i()     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0065
        L_0x0064:
            throw r9
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4631xn.mo18950a(boolean):com.google.android.gms.internal.ads.wn");
    }

    /* renamed from: b */
    public final void mo18951b(C4630wn wnVar) {
        synchronized (this.f20982a) {
            if (this.f20984c.size() >= 10) {
                int size = this.f20984c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                co0.zze(sb.toString());
                this.f20984c.remove(0);
            }
            int i = this.f20983b;
            this.f20983b = i + 1;
            wnVar.mo18940j(i);
            wnVar.mo18944n();
            this.f20984c.add(wnVar);
        }
    }

    /* renamed from: c */
    public final boolean mo18952c(C4630wn wnVar) {
        synchronized (this.f20982a) {
            Iterator<C4630wn> it = this.f20984c.iterator();
            while (it.hasNext()) {
                C4630wn next = it.next();
                if (!zzt.zzo().mo18583h().zzI()) {
                    if (wnVar != next && next.mo18932d().equals(wnVar.mo18932d())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzt.zzo().mo18583h().zzJ() && wnVar != next && next.mo18935f().equals(wnVar.mo18935f())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo18953d(C4630wn wnVar) {
        synchronized (this.f20982a) {
            if (this.f20984c.contains(wnVar)) {
                return true;
            }
            return false;
        }
    }
}
