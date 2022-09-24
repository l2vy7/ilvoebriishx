package p148s3;

import com.google.auto.value.AutoValue;
import p148s3.C6038e;

@AutoValue
/* renamed from: s3.k */
/* compiled from: ClientInfo */
public abstract class C6052k {

    @AutoValue.Builder
    /* renamed from: s3.k$a */
    /* compiled from: ClientInfo */
    public static abstract class C6053a {
        /* renamed from: a */
        public abstract C6052k mo23198a();

        /* renamed from: b */
        public abstract C6053a mo23199b(C6025a aVar);

        /* renamed from: c */
        public abstract C6053a mo23200c(C6054b bVar);
    }

    /* renamed from: s3.k$b */
    /* compiled from: ClientInfo */
    public enum C6054b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: b */
        private final int f25194b;

        private C6054b(int i) {
            this.f25194b = i;
        }
    }

    /* renamed from: a */
    public static C6053a m26616a() {
        return new C6038e.C6040b();
    }

    /* renamed from: b */
    public abstract C6025a mo23193b();

    /* renamed from: c */
    public abstract C6054b mo23194c();
}
