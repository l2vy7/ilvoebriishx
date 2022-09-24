package p153t3;

import com.google.auto.value.AutoValue;
import p142r3.C5996b;
import p142r3.C5997c;
import p142r3.C5999e;
import p153t3.C6129b;

@AutoValue
/* renamed from: t3.l */
/* compiled from: SendRequest */
abstract class C6148l {

    @AutoValue.Builder
    /* renamed from: t3.l$a */
    /* compiled from: SendRequest */
    public static abstract class C6149a {
        /* renamed from: a */
        public abstract C6148l mo23497a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C6149a mo23498b(C5996b bVar);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C6149a mo23499c(C5997c<?> cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C6149a mo23500d(C5999e<?, byte[]> eVar);

        /* renamed from: e */
        public abstract C6149a mo23501e(C6150m mVar);

        /* renamed from: f */
        public abstract C6149a mo23502f(String str);
    }

    C6148l() {
    }

    /* renamed from: a */
    public static C6149a m26979a() {
        return new C6129b.C6131b();
    }

    /* renamed from: b */
    public abstract C5996b mo23489b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract C5997c<?> mo23490c();

    /* renamed from: d */
    public byte[] mo23533d() {
        return mo23491e().apply(mo23490c().mo23090b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C5999e<?, byte[]> mo23491e();

    /* renamed from: f */
    public abstract C6150m mo23493f();

    /* renamed from: g */
    public abstract String mo23494g();
}
