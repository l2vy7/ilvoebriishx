package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C6540C;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ay2 {

    /* renamed from: a */
    private long f29826a;

    /* renamed from: b */
    private long f29827b;

    /* renamed from: c */
    private long f29828c;

    /* renamed from: d */
    private final ThreadLocal<Long> f29829d = new ThreadLocal<>();

    public ay2(long j) {
        mo30577f(0);
    }

    /* renamed from: a */
    public final synchronized long mo30572a(long j) {
        if (this.f29827b == C6540C.TIME_UNSET) {
            long j2 = this.f29826a;
            if (j2 == 9223372036854775806L) {
                Long l = this.f29829d.get();
                Objects.requireNonNull(l);
                j2 = l.longValue();
            }
            this.f29827b = j2 - j;
            notifyAll();
        }
        this.f29828c = j;
        return j + this.f29827b;
    }

    /* renamed from: b */
    public final synchronized long mo30573b(long j) {
        if (j == C6540C.TIME_UNSET) {
            return C6540C.TIME_UNSET;
        }
        long j2 = this.f29828c;
        if (j2 != C6540C.TIME_UNSET) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((-1 + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return mo30572a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long mo30574c() {
        long j = this.f29826a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? C6540C.TIME_UNSET : j;
    }

    /* renamed from: d */
    public final synchronized long mo30575d() {
        long j;
        j = this.f29828c;
        return j != C6540C.TIME_UNSET ? j + this.f29827b : mo30574c();
    }

    /* renamed from: e */
    public final synchronized long mo30576e() {
        return this.f29827b;
    }

    /* renamed from: f */
    public final synchronized void mo30577f(long j) {
        this.f29826a = j;
        this.f29827b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f29828c = C6540C.TIME_UNSET;
    }
}
