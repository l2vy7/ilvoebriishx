package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.q */
/* compiled from: ViewModel */
public abstract class C0789q {

    /* renamed from: a */
    private final Map<String, Object> f3861a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3862b = false;

    /* renamed from: b */
    private static void m4315b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4022a() {
        this.f3862b = true;
        Map<String, Object> map = this.f3861a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f3861a.values()) {
                    m4315b(b);
                }
            }
        }
        mo3789d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4023c(String str) {
        T t;
        Map<String, Object> map = this.f3861a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3861a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo3789d() {
    }
}
