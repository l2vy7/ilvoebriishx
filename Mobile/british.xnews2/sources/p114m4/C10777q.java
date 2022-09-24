package p114m4;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C4604n;
import java.util.Objects;
import p198d5.C10487a;
import p198d5.C10489b;
import p243q4.C10922b;

/* renamed from: m4.q */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C10777q {

    /* renamed from: c */
    private static final C10922b f49510c = new C10922b("SessionManager");

    /* renamed from: a */
    private final C10747d0 f49511a;

    /* renamed from: b */
    private final Context f49512b;

    public C10777q(C10747d0 d0Var, Context context) {
        this.f49511a = d0Var;
        this.f49512b = context;
    }

    /* renamed from: a */
    public void mo42950a(@RecentlyNonNull C10779r<C10775p> rVar) throws NullPointerException {
        C4604n.m20093f("Must be called from the main thread.");
        mo42951b(rVar, C10775p.class);
    }

    /* renamed from: b */
    public <T extends C10775p> void mo42951b(@RecentlyNonNull C10779r<T> rVar, @RecentlyNonNull Class<T> cls) throws NullPointerException {
        Objects.requireNonNull(rVar, "SessionManagerListener can't be null");
        C4604n.m20098k(cls);
        C4604n.m20093f("Must be called from the main thread.");
        try {
            this.f49511a.mo42915m5(new C5760n0(rVar, cls));
        } catch (RemoteException e) {
            f49510c.mo43191b(e, "Unable to call %s on %s.", "addSessionManagerListener", C10747d0.class.getSimpleName());
        }
    }

    /* renamed from: c */
    public void mo42952c(boolean z) {
        C4604n.m20093f("Must be called from the main thread.");
        try {
            f49510c.mo43194e("End session for %s", this.f49512b.getPackageName());
            this.f49511a.mo42913X0(true, z);
        } catch (RemoteException e) {
            f49510c.mo43191b(e, "Unable to call %s on %s.", "endCurrentSession", C10747d0.class.getSimpleName());
        }
    }

    @RecentlyNullable
    /* renamed from: d */
    public C5759d mo42953d() {
        C4604n.m20093f("Must be called from the main thread.");
        C10775p e = mo42954e();
        if (e == null || !(e instanceof C5759d)) {
            return null;
        }
        return (C5759d) e;
    }

    @RecentlyNullable
    /* renamed from: e */
    public C10775p mo42954e() {
        C4604n.m20093f("Must be called from the main thread.");
        try {
            return (C10775p) C10489b.m48194f3(this.f49511a.zze());
        } catch (RemoteException e) {
            f49510c.mo43191b(e, "Unable to call %s on %s.", "getWrappedCurrentSession", C10747d0.class.getSimpleName());
            return null;
        }
    }

    /* renamed from: f */
    public void mo42955f(@RecentlyNonNull C10779r<C10775p> rVar) {
        C4604n.m20093f("Must be called from the main thread.");
        mo42956g(rVar, C10775p.class);
    }

    /* renamed from: g */
    public <T extends C10775p> void mo42956g(@RecentlyNonNull C10779r<T> rVar, @RecentlyNonNull Class cls) {
        C4604n.m20098k(cls);
        C4604n.m20093f("Must be called from the main thread.");
        if (rVar != null) {
            try {
                this.f49511a.mo42914i6(new C5760n0(rVar, cls));
            } catch (RemoteException e) {
                f49510c.mo43191b(e, "Unable to call %s on %s.", "removeSessionManagerListener", C10747d0.class.getSimpleName());
            }
        }
    }

    @RecentlyNullable
    /* renamed from: h */
    public final C10487a mo42957h() {
        try {
            return this.f49511a.zzk();
        } catch (RemoteException e) {
            f49510c.mo43191b(e, "Unable to call %s on %s.", "getWrappedThis", C10747d0.class.getSimpleName());
            return null;
        }
    }
}
