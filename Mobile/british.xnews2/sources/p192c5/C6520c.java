package p192c5;

import android.content.Context;

/* renamed from: c5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6520c {

    /* renamed from: b */
    private static C6520c f26593b = new C6520c();

    /* renamed from: a */
    private C6519b f26594a = null;

    /* renamed from: a */
    public static C6519b m28321a(Context context) {
        return f26593b.mo24358b(context);
    }

    /* renamed from: b */
    public final synchronized C6519b mo24358b(Context context) {
        if (this.f26594a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f26594a = new C6519b(context);
        }
        return this.f26594a;
    }
}
