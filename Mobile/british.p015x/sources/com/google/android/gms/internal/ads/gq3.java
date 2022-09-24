package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gq3 extends iq3 {
    /* synthetic */ gq3(fq3 fq3) {
        super((hq3) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo31642a(Object obj, long j) {
        tp3 tp3 = (tp3) qs3.m36724p(obj, j);
        if (tp3.zzc()) {
            return tp3;
        }
        int size = tp3.size();
        tp3 s = tp3.mo30784s(size == 0 ? 10 : size + size);
        qs3.m36704D(obj, j, s);
        return s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31643b(Object obj, long j) {
        ((tp3) qs3.m36724p(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo31644c(Object obj, Object obj2, long j) {
        tp3 tp3 = (tp3) qs3.m36724p(obj, j);
        tp3 tp32 = (tp3) qs3.m36724p(obj2, j);
        int size = tp3.size();
        int size2 = tp32.size();
        if (size > 0 && size2 > 0) {
            if (!tp3.zzc()) {
                tp3 = tp3.mo30784s(size2 + size);
            }
            tp3.addAll(tp32);
        }
        if (size > 0) {
            tp32 = tp3;
        }
        qs3.m36704D(obj, j, tp32);
    }
}
