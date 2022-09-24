package com.facebook;

import com.facebook.internal.C3511k;
import java.util.Random;
import p120n3.C5853b;

/* renamed from: com.facebook.j */
/* compiled from: FacebookException */
public class C3572j extends RuntimeException {

    /* renamed from: com.facebook.j$a */
    /* compiled from: FacebookException */
    class C3573a implements C3511k.C3514c {

        /* renamed from: a */
        final /* synthetic */ String f13291a;

        C3573a(String str) {
            this.f13291a = str;
        }

        /* renamed from: a */
        public void mo11842a(boolean z) {
            if (z) {
                try {
                    C5853b.m25849c(this.f13291a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public C3572j() {
    }

    public String toString() {
        return getMessage();
    }

    public C3572j(String str) {
        super(str);
        Random random = new Random();
        if (str != null && C3642m.m12296v() && random.nextInt(100) > 50) {
            C3511k.m11755a(C3511k.C3515d.ErrorReport, new C3573a(str));
        }
    }

    public C3572j(String str, Object... objArr) {
        this(String.format(str, objArr));
    }

    public C3572j(String str, Throwable th) {
        super(str, th);
    }

    public C3572j(Throwable th) {
        super(th);
    }
}
