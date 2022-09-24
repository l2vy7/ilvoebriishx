package p231l7;

import com.google.auto.value.AutoValue;
import p231l7.C10728b;

@AutoValue
/* renamed from: l7.f */
/* compiled from: TokenResult */
public abstract class C10736f {

    @AutoValue.Builder
    /* renamed from: l7.f$a */
    /* compiled from: TokenResult */
    public static abstract class C10737a {
        /* renamed from: a */
        public abstract C10736f mo42897a();

        /* renamed from: b */
        public abstract C10737a mo42898b(C10738b bVar);

        /* renamed from: c */
        public abstract C10737a mo42899c(String str);

        /* renamed from: d */
        public abstract C10737a mo42900d(long j);
    }

    /* renamed from: l7.f$b */
    /* compiled from: TokenResult */
    public enum C10738b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static C10737a m48612a() {
        return new C10728b.C10730b().mo42900d(0);
    }

    /* renamed from: b */
    public abstract C10738b mo42891b();

    /* renamed from: c */
    public abstract String mo42892c();

    /* renamed from: d */
    public abstract long mo42893d();
}
