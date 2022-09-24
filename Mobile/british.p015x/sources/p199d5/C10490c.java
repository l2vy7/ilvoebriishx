package p199d5;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.internal.C4604n;

/* renamed from: d5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C10490c<T> {

    /* renamed from: a */
    private final String f49006a;

    /* renamed from: b */
    private T f49007b;

    /* renamed from: d5.c$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static class C10491a extends Exception {
        public C10491a(String str) {
            super(str);
        }

        public C10491a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected C10490c(String str) {
        this.f49006a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo30142a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo42606b(Context context) throws C10491a {
        if (this.f49007b == null) {
            C4604n.m20098k(context);
            Context e = C7355d.m29939e(context);
            if (e != null) {
                try {
                    this.f49007b = mo30142a((IBinder) e.getClassLoader().loadClass(this.f49006a).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new C10491a("Could not load creator class.", e2);
                } catch (InstantiationException e3) {
                    throw new C10491a("Could not instantiate creator.", e3);
                } catch (IllegalAccessException e4) {
                    throw new C10491a("Could not access creator.", e4);
                }
            } else {
                throw new C10491a("Could not get remote context.");
            }
        }
        return this.f49007b;
    }
}
