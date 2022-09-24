package com.startapp;

/* renamed from: com.startapp.u2 */
/* compiled from: Sta */
public class C12356u2 {

    /* renamed from: a */
    private static C12357a f54807a;

    /* renamed from: com.startapp.u2$a */
    /* compiled from: Sta */
    public interface C12357a {
        /* renamed from: a */
        void mo45365a(Throwable th);
    }

    /* renamed from: com.startapp.u2$b */
    /* compiled from: Sta */
    public static class C12358b {
        /* renamed from: a */
        public static StackTraceElement[] m53527a() {
            return Thread.currentThread().getStackTrace();
        }
    }

    /* renamed from: a */
    public static void m53521a(C12357a aVar) {
        f54807a = aVar;
    }

    /* renamed from: a */
    private static void m53523a(Throwable th, boolean z, boolean z2) {
    }

    /* renamed from: b */
    public static void m53524b(Throwable th) {
        m53523a(th, true, true);
    }

    /* renamed from: c */
    public static void m53525c(Throwable th) {
        C12357a aVar = f54807a;
        if (aVar != null) {
            try {
                aVar.mo45365a(th);
            } catch (Throwable unused) {
            }
        } else {
            m53523a(th, false, false);
        }
    }

    /* renamed from: a */
    public static void m53522a(Throwable th) {
        m53523a(th, true, false);
    }

    /* renamed from: a */
    private static StackTraceElement m53520a(int i) {
        if (i < 0) {
            i = 0;
        }
        StackTraceElement[] a = C12358b.m53527a();
        if (a == null) {
            return null;
        }
        String name = C12358b.class.getName();
        int length = a.length;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = a[i2];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i3 = i2 + 3 + i;
                if (i3 < length) {
                    return a[i3];
                }
                return null;
            }
        }
        return null;
    }
}
