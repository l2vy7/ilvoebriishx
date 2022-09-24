package p114m4;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8794w9;
import p198d5.C10487a;
import p243q4.C10922b;

/* renamed from: m4.p */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10775p {

    /* renamed from: c */
    private static final C10922b f49506c = new C10922b(RtspHeaders.SESSION);

    /* renamed from: a */
    private final C10742b0 f49507a;

    /* renamed from: b */
    private final C10771m0 f49508b;

    protected C10775p(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        C10771m0 m0Var = new C10771m0(this, (C10769l0) null);
        this.f49508b = m0Var;
        this.f49507a = C8794w9.m41376b(context, str, str2, m0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22541a(boolean z);

    /* renamed from: b */
    public long mo22542b() {
        C4604n.m20093f("Must be called from the main thread.");
        return 0;
    }

    /* renamed from: c */
    public boolean mo42943c() {
        C4604n.m20093f("Must be called from the main thread.");
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                return b0Var.zzh();
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "isConnected", C10742b0.class.getSimpleName());
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo42944d() {
        C4604n.m20093f("Must be called from the main thread.");
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                return b0Var.zzi();
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "isConnecting", C10742b0.class.getSimpleName());
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo42945e() {
        C4604n.m20093f("Must be called from the main thread.");
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                return b0Var.zzl();
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "isResuming", C10742b0.class.getSimpleName());
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo42946f(int i) {
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                b0Var.mo42908j4(i);
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", C10742b0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42947g(int i) {
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                b0Var.mo42907i5(i);
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "notifyFailedToStartSession", C10742b0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo42948h(int i) {
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                b0Var.mo42906O5(i);
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "notifySessionEnded", C10742b0.class.getSimpleName());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo22543i(@RecentlyNonNull Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22544j(@RecentlyNonNull Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo22545k(@RecentlyNonNull Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo22546l(@RecentlyNonNull Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo22547m(@RecentlyNonNull Bundle bundle) {
    }

    @RecentlyNullable
    /* renamed from: n */
    public final C10487a mo42949n() {
        C10742b0 b0Var = this.f49507a;
        if (b0Var != null) {
            try {
                return b0Var.zze();
            } catch (RemoteException e) {
                f49506c.mo43191b(e, "Unable to call %s on %s.", "getWrappedObject", C10742b0.class.getSimpleName());
            }
        }
        return null;
    }
}
