package p185z3;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p021c4.C2657a;
import p143r3.C5998d;
import p185z3.C6448c;

@AutoValue
/* renamed from: z3.e */
/* compiled from: SchedulerConfig */
public abstract class C6452e {

    /* renamed from: z3.e$a */
    /* compiled from: SchedulerConfig */
    public static class C6453a {

        /* renamed from: a */
        private C2657a f26506a;

        /* renamed from: b */
        private Map<C5998d, C6454b> f26507b = new HashMap();

        /* renamed from: a */
        public C6453a mo24287a(C5998d dVar, C6454b bVar) {
            this.f26507b.put(dVar, bVar);
            return this;
        }

        /* renamed from: b */
        public C6452e mo24288b() {
            Objects.requireNonNull(this.f26506a, "missing required property: clock");
            if (this.f26507b.keySet().size() >= C5998d.values().length) {
                Map<C5998d, C6454b> map = this.f26507b;
                this.f26507b = new HashMap();
                return C6452e.m28151d(this.f26506a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C6453a mo24289c(C2657a aVar) {
            this.f26506a = aVar;
            return this;
        }
    }

    @AutoValue
    /* renamed from: z3.e$b */
    /* compiled from: SchedulerConfig */
    public static abstract class C6454b {

        @AutoValue.Builder
        /* renamed from: z3.e$b$a */
        /* compiled from: SchedulerConfig */
        public static abstract class C6455a {
            /* renamed from: a */
            public abstract C6454b mo24280a();

            /* renamed from: b */
            public abstract C6455a mo24281b(long j);

            /* renamed from: c */
            public abstract C6455a mo24282c(Set<C6456c> set);

            /* renamed from: d */
            public abstract C6455a mo24283d(long j);
        }

        /* renamed from: a */
        public static C6455a m28162a() {
            return new C6448c.C6450b().mo24282c(Collections.emptySet());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract long mo24274b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Set<C6456c> mo24275c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract long mo24276d();
    }

    /* renamed from: z3.e$c */
    /* compiled from: SchedulerConfig */
    public enum C6456c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m28149a(int i, long j) {
        int i2 = i - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2))));
        double pow = Math.pow(3.0d, (double) i2);
        double d = (double) j;
        Double.isNaN(d);
        return (long) (pow * d * max);
    }

    /* renamed from: b */
    public static C6453a m28150b() {
        return new C6453a();
    }

    /* renamed from: d */
    static C6452e m28151d(C2657a aVar, Map<C5998d, C6454b> map) {
        return new C6447b(aVar, map);
    }

    /* renamed from: f */
    public static C6452e m28152f(C2657a aVar) {
        return m28150b().mo24287a(C5998d.DEFAULT, C6454b.m28162a().mo24281b(30000).mo24283d(86400000).mo24280a()).mo24287a(C5998d.HIGHEST, C6454b.m28162a().mo24281b(1000).mo24283d(86400000).mo24280a()).mo24287a(C5998d.VERY_LOW, C6454b.m28162a().mo24281b(86400000).mo24283d(86400000).mo24282c(m28153i(C6456c.NETWORK_UNMETERED, C6456c.DEVICE_IDLE)).mo24280a()).mo24289c(aVar).mo24288b();
    }

    /* renamed from: i */
    private static <T> Set<T> m28153i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: j */
    private void m28154j(JobInfo.Builder builder, Set<C6456c> set) {
        if (set.contains(C6456c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C6456c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C6456c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* renamed from: c */
    public JobInfo.Builder mo24285c(JobInfo.Builder builder, C5998d dVar, long j, int i) {
        builder.setMinimumLatency(mo24286g(dVar, j, i));
        m28154j(builder, mo24271h().get(dVar).mo24275c());
        return builder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C2657a mo24269e();

    /* renamed from: g */
    public long mo24286g(C5998d dVar, long j, int i) {
        long a = j - mo24269e().mo9336a();
        C6454b bVar = mo24271h().get(dVar);
        return Math.min(Math.max(m28149a(i, bVar.mo24274b()), a), bVar.mo24276d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Map<C5998d, C6454b> mo24271h();
}
