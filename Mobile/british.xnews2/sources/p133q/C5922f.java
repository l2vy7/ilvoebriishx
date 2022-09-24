package p133q;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import p000a.C0000a;
import p000a.C0003b;

/* renamed from: q.f */
/* compiled from: CustomTabsSession */
public final class C5922f {

    /* renamed from: a */
    private final Object f24799a = new Object();

    /* renamed from: b */
    private final C0003b f24800b;

    /* renamed from: c */
    private final C0000a f24801c;

    /* renamed from: d */
    private final ComponentName f24802d;

    /* renamed from: e */
    private final PendingIntent f24803e;

    C5922f(C0003b bVar, C0000a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f24800b = bVar;
        this.f24801c = aVar;
        this.f24802d = componentName;
        this.f24803e = pendingIntent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo22915a() {
        return this.f24801c.asBinder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentName mo22916b() {
        return this.f24802d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public PendingIntent mo22917c() {
        return this.f24803e;
    }
}
