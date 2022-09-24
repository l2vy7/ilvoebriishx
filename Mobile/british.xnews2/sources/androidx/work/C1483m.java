package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.m */
/* compiled from: Logger */
public abstract class C1483m {

    /* renamed from: a */
    private static C1483m f6491a = null;

    /* renamed from: b */
    private static final int f6492b = 20;

    /* renamed from: androidx.work.m$a */
    /* compiled from: Logger */
    public static class C1484a extends C1483m {

        /* renamed from: c */
        private int f6493c;

        public C1484a(int i) {
            super(i);
            this.f6493c = i;
        }

        /* renamed from: a */
        public void mo7013a(String str, String str2, Throwable... thArr) {
            if (this.f6493c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo7014b(String str, String str2, Throwable... thArr) {
            if (this.f6493c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo7015d(String str, String str2, Throwable... thArr) {
            if (this.f6493c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: g */
        public void mo7016g(String str, String str2, Throwable... thArr) {
            if (this.f6493c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        /* renamed from: h */
        public void mo7017h(String str, String str2, Throwable... thArr) {
            if (this.f6493c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public C1483m(int i) {
    }

    /* renamed from: c */
    public static synchronized C1483m m7771c() {
        C1483m mVar;
        synchronized (C1483m.class) {
            if (f6491a == null) {
                f6491a = new C1484a(3);
            }
            mVar = f6491a;
        }
        return mVar;
    }

    /* renamed from: e */
    public static synchronized void m7772e(C1483m mVar) {
        synchronized (C1483m.class) {
            f6491a = mVar;
        }
    }

    /* renamed from: f */
    public static String m7773f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f6492b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo7013a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo7014b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo7015d(String str, String str2, Throwable... thArr);

    /* renamed from: g */
    public abstract void mo7016g(String str, String str2, Throwable... thArr);

    /* renamed from: h */
    public abstract void mo7017h(String str, String str2, Throwable... thArr);
}
