package androidx.work;

import android.annotation.SuppressLint;

/* renamed from: androidx.work.p */
/* compiled from: Operation */
public interface C1488p {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C1490b.C1493c f6501a = new C1490b.C1493c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C1490b.C1492b f6502b = new C1490b.C1492b();

    /* renamed from: androidx.work.p$b */
    /* compiled from: Operation */
    public static abstract class C1490b {

        /* renamed from: androidx.work.p$b$a */
        /* compiled from: Operation */
        public static final class C1491a extends C1490b {

            /* renamed from: a */
            private final Throwable f6503a;

            public C1491a(Throwable th) {
                this.f6503a = th;
            }

            /* renamed from: a */
            public Throwable mo7022a() {
                return this.f6503a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f6503a.getMessage()});
            }
        }

        /* renamed from: androidx.work.p$b$b */
        /* compiled from: Operation */
        public static final class C1492b extends C1490b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C1492b() {
            }
        }

        /* renamed from: androidx.work.p$b$c */
        /* compiled from: Operation */
        public static final class C1493c extends C1490b {
            public String toString() {
                return "SUCCESS";
            }

            private C1493c() {
            }
        }

        C1490b() {
        }
    }
}
