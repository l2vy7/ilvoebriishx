package p148s3;

import com.google.auto.value.AutoValue;
import java.util.List;
import p148s3.C6044g;

@AutoValue
/* renamed from: s3.m */
/* compiled from: LogRequest */
public abstract class C6057m {

    @AutoValue.Builder
    /* renamed from: s3.m$a */
    /* compiled from: LogRequest */
    public static abstract class C6058a {
        /* renamed from: a */
        public abstract C6057m mo23229a();

        /* renamed from: b */
        public abstract C6058a mo23230b(C6052k kVar);

        /* renamed from: c */
        public abstract C6058a mo23231c(List<C6055l> list);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C6058a mo23232d(Integer num);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract C6058a mo23233e(String str);

        /* renamed from: f */
        public abstract C6058a mo23234f(C6064p pVar);

        /* renamed from: g */
        public abstract C6058a mo23235g(long j);

        /* renamed from: h */
        public abstract C6058a mo23236h(long j);

        /* renamed from: i */
        public C6058a mo23249i(int i) {
            return mo23232d(Integer.valueOf(i));
        }

        /* renamed from: j */
        public C6058a mo23250j(String str) {
            return mo23233e(str);
        }
    }

    /* renamed from: a */
    public static C6058a m26640a() {
        return new C6044g.C6046b();
    }

    /* renamed from: b */
    public abstract C6052k mo23219b();

    /* renamed from: c */
    public abstract List<C6055l> mo23220c();

    /* renamed from: d */
    public abstract Integer mo23221d();

    /* renamed from: e */
    public abstract String mo23222e();

    /* renamed from: f */
    public abstract C6064p mo23224f();

    /* renamed from: g */
    public abstract long mo23225g();

    /* renamed from: h */
    public abstract long mo23226h();
}
