package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o44 implements t64 {

    /* renamed from: b */
    protected final t64[] f36276b;

    public o44(t64[] t64Arr) {
        this.f36276b = t64Arr;
    }

    /* renamed from: b */
    public final boolean mo18200b(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long zzc = zzc();
            if (zzc != Long.MIN_VALUE) {
                boolean z2 = false;
                for (t64 t64 : this.f36276b) {
                    long zzc2 = t64.zzc();
                    boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j2;
                    if (zzc2 == zzc || z3) {
                        z2 |= t64.mo18200b(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo18201c(long j) {
        for (t64 c : this.f36276b) {
            c.mo18201c(j);
        }
    }

    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (t64 zzb : this.f36276b) {
            long zzb2 = zzb.zzb();
            if (zzb2 != Long.MIN_VALUE) {
                j = Math.min(j, zzb2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (t64 zzc : this.f36276b) {
            long zzc2 = zzc.zzc();
            if (zzc2 != Long.MIN_VALUE) {
                j = Math.min(j, zzc2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzo() {
        for (t64 zzo : this.f36276b) {
            if (zzo.zzo()) {
                return true;
            }
        }
        return false;
    }
}
