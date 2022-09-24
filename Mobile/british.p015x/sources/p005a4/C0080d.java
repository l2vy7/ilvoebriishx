package p005a4;

import com.google.auto.value.AutoValue;
import p005a4.C0068a;

@AutoValue
/* renamed from: a4.d */
/* compiled from: EventStoreConfig */
abstract class C0080d {

    /* renamed from: a */
    static final C0080d f220a = m340a().mo211f(10485760).mo209d(200).mo207b(10000).mo208c(604800000).mo210e(81920).mo206a();

    @AutoValue.Builder
    /* renamed from: a4.d$a */
    /* compiled from: EventStoreConfig */
    static abstract class C0081a {
        C0081a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C0080d mo206a();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C0081a mo207b(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract C0081a mo208c(long j);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C0081a mo209d(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract C0081a mo210e(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public abstract C0081a mo211f(long j);
    }

    C0080d() {
    }

    /* renamed from: a */
    static C0081a m340a() {
        return new C0068a.C0070b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo198b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract long mo199c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo200d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo201e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract long mo203f();
}
