package p134q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p000a.C0003b;

/* renamed from: q.e */
/* compiled from: CustomTabsServiceConnection */
public abstract class C5920e implements ServiceConnection {

    /* renamed from: b */
    private Context f24797b;

    /* renamed from: q.e$a */
    /* compiled from: CustomTabsServiceConnection */
    class C5921a extends C5911c {
        C5921a(C0003b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    /* renamed from: a */
    public abstract void mo22912a(ComponentName componentName, C5911c cVar);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo22913b(Context context) {
        this.f24797b = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f24797b != null) {
            mo22912a(componentName, new C5921a(C0003b.C0004a.m26x(iBinder), componentName, this.f24797b));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
