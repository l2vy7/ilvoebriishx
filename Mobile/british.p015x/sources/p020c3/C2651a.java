package p020c3;

import android.app.Activity;
import com.facebook.C3642m;
import com.facebook.internal.C3459b;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: c3.a */
/* compiled from: MetadataIndexer */
public final class C2651a {

    /* renamed from: a */
    private static final String f10454a = "c3.a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final AtomicBoolean f10455b = new AtomicBoolean(false);

    /* renamed from: c3.a$a */
    /* compiled from: MetadataIndexer */
    static class C2652a implements Runnable {
        C2652a() {
        }

        public void run() {
            if (!C3459b.m11546l(C3642m.m12279e())) {
                C2651a.f10455b.set(true);
                C2651a.m9289e();
            }
        }
    }

    /* renamed from: c */
    public static void m9287c() {
        try {
            C3642m.m12288n().execute(new C2652a());
        } catch (Exception e) {
            C3481f0.m11608S(f10454a, e);
        }
    }

    /* renamed from: d */
    public static void m9288d(Activity activity) {
        try {
            if (!f10455b.get()) {
                return;
            }
            if (!C2654c.m9296d().isEmpty()) {
                C2655d.m9308g(activity);
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m9289e() {
        String h;
        C3520m o = C3522n.m11809o(C3642m.m12280f(), false);
        if (o != null && (h = o.mo12003h()) != null) {
            C2654c.m9298g(h);
        }
    }
}
