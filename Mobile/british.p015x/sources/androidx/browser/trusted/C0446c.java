package androidx.browser.trusted;

import android.os.IBinder;
import p009b.C1508a;

/* renamed from: androidx.browser.trusted.c */
/* compiled from: TrustedWebActivityCallbackRemote */
public class C0446c {

    /* renamed from: a */
    private final C1508a f1767a;

    private C0446c(C1508a aVar) {
        this.f1767a = aVar;
    }

    /* renamed from: a */
    static C0446c m2371a(IBinder iBinder) {
        C1508a x = iBinder == null ? null : C1508a.C1509a.m7828x(iBinder);
        if (x == null) {
            return null;
        }
        return new C0446c(x);
    }
}
