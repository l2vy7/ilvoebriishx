package p114m4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.C4580e;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.internal.cast.C8794w9;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.dataflow.qual.Pure;
import p108l4.C10657a;
import p108l4.C10697p0;
import p234n4.C10828p;
import p243q4.C10922b;
import p243q4.C10944n;

/* renamed from: m4.d */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class C5759d extends C10775p {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final C10922b f24421n = new C10922b("CastSession");

    /* renamed from: d */
    private final Context f24422d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Set<C10657a.C10662d> f24423e = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10763i1 f24424f;

    /* renamed from: g */
    private final CastOptions f24425g;

    /* renamed from: h */
    private final C10828p f24426h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C10697p0 f24427i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4580e f24428j;

    /* renamed from: k */
    private CastDevice f24429k;

    /* renamed from: l */
    private C10657a.C10658a f24430l;

    /* renamed from: m */
    private final C10784t0 f24431m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5759d(Context context, String str, String str2, CastOptions castOptions, C10828p pVar) {
        super(context, str, str2);
        C10784t0 t0Var = C10784t0.f49522a;
        this.f24422d = context.getApplicationContext();
        this.f24425g = castOptions;
        this.f24426h = pVar;
        this.f24431m = t0Var;
        this.f24424f = C8794w9.m41377c(context, castOptions, mo42949n(), new C10792x0(this, (C10786u0) null));
    }

    /* renamed from: A */
    static /* synthetic */ void m25477A(C5759d dVar, String str, Task task) {
        if (dVar.f24424f != null) {
            try {
                if (task.isSuccessful()) {
                    C10657a.C10658a aVar = (C10657a.C10658a) task.getResult();
                    dVar.f24430l = aVar;
                    if (aVar.mo29527p0() != null && aVar.mo29527p0().mo29735G0()) {
                        f24421n.mo43190a("%s() -> success result", str);
                        C4580e eVar = new C4580e(new C10944n((String) null));
                        dVar.f24428j = eVar;
                        eVar.mo17830O(dVar.f24427i);
                        dVar.f24428j.mo17831P();
                        dVar.f24426h.mo42989b(dVar.f24428j, dVar.mo22549p());
                        dVar.f24424f.mo42928j1((ApplicationMetadata) C4604n.m20098k(aVar.mo42794Z()), aVar.mo42797u(), (String) C4604n.m20098k(aVar.getSessionId()), aVar.mo42796j());
                        return;
                    } else if (aVar.mo29527p0() != null) {
                        f24421n.mo43190a("%s() -> failure result", str);
                        dVar.f24424f.mo42930o(aVar.mo29527p0().mo29732D0());
                        return;
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof C7203b) {
                        dVar.f24424f.mo42930o(((C7203b) exception).mo29766b());
                        return;
                    }
                }
                dVar.f24424f.mo42930o(2476);
            } catch (RemoteException e) {
                f24421n.mo43191b(e, "Unable to call %s on %s.", "methods", C10763i1.class.getSimpleName());
            }
        }
    }

    /* renamed from: B */
    private final void m25478B(Bundle bundle) {
        CastMediaOptions castMediaOptions;
        NotificationOptions notificationOptions;
        CastDevice F0 = CastDevice.m29040F0(bundle);
        this.f24429k = F0;
        if (F0 != null) {
            C10697p0 p0Var = this.f24427i;
            if (p0Var != null) {
                p0Var.zzc();
                this.f24427i = null;
            }
            boolean z = true;
            f24421n.mo43190a("Acquiring a connection to Google Play Services for %s", this.f24429k);
            CastDevice castDevice = (CastDevice) C4604n.m20098k(this.f24429k);
            Bundle bundle2 = new Bundle();
            CastOptions castOptions = this.f24425g;
            if (castOptions == null) {
                castMediaOptions = null;
            } else {
                castMediaOptions = castOptions.mo29419C0();
            }
            if (castMediaOptions == null) {
                notificationOptions = null;
            } else {
                notificationOptions = castMediaOptions.mo29461G0();
            }
            boolean z2 = castMediaOptions != null && castMediaOptions.zza();
            Intent intent = new Intent(this.f24422d, MediaTransferReceiver.class);
            intent.setPackage(this.f24422d.getPackageName());
            boolean z3 = !this.f24422d.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
            if (notificationOptions == null) {
                z = false;
            }
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z2);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", z3);
            C10657a.C10660c.C10661a aVar = new C10657a.C10660c.C10661a(castDevice, new C10794y0(this, (C10786u0) null));
            aVar.mo42801b(bundle2);
            C10697p0 a = C10657a.m48474a(this.f24422d, aVar.mo42800a());
            a.mo22364c(new C10796z0(this, (C10786u0) null));
            this.f24427i = a;
            a.zzb();
        } else if (mo42945e()) {
            mo42946f(2153);
        } else {
            mo42947g(2151);
        }
    }

    /* renamed from: x */
    static /* synthetic */ void m25482x(C5759d dVar, int i) {
        dVar.f24426h.mo42990h(i);
        C10697p0 p0Var = dVar.f24427i;
        if (p0Var != null) {
            p0Var.zzc();
            dVar.f24427i = null;
        }
        dVar.f24429k = null;
        C4580e eVar = dVar.f24428j;
        if (eVar != null) {
            eVar.mo17830O((C10697p0) null);
            dVar.f24428j = null;
        }
        dVar.f24430l = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22541a(boolean z) {
        C10763i1 i1Var = this.f24424f;
        if (i1Var != null) {
            try {
                i1Var.mo42926A0(z, 0);
            } catch (RemoteException e) {
                f24421n.mo43191b(e, "Unable to call %s on %s.", "disconnectFromDevice", C10763i1.class.getSimpleName());
            }
            mo42948h(0);
        }
    }

    /* renamed from: b */
    public long mo22542b() {
        C4604n.m20093f("Must be called from the main thread.");
        C4580e eVar = this.f24428j;
        if (eVar == null) {
            return 0;
        }
        return eVar.mo17849n() - this.f24428j.mo17842g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo22543i(@RecentlyNonNull Bundle bundle) {
        this.f24429k = CastDevice.m29040F0(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22544j(@RecentlyNonNull Bundle bundle) {
        this.f24429k = CastDevice.m29040F0(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo22545k(@RecentlyNonNull Bundle bundle) {
        m25478B(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo22546l(@RecentlyNonNull Bundle bundle) {
        m25478B(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo22547m(@RecentlyNonNull Bundle bundle) {
        this.f24429k = CastDevice.m29040F0(bundle);
    }

    /* renamed from: o */
    public void mo22548o(@RecentlyNonNull C10657a.C10662d dVar) {
        C4604n.m20093f("Must be called from the main thread.");
        if (dVar != null) {
            this.f24423e.add(dVar);
        }
    }

    @RecentlyNullable
    @Pure
    /* renamed from: p */
    public CastDevice mo22549p() {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24429k;
    }

    @RecentlyNullable
    /* renamed from: q */
    public C4580e mo22550q() {
        C4604n.m20093f("Must be called from the main thread.");
        return this.f24428j;
    }

    /* renamed from: r */
    public boolean mo22551r() throws IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        C10697p0 p0Var = this.f24427i;
        return p0Var != null && p0Var.zzk();
    }

    /* renamed from: s */
    public void mo22552s(@RecentlyNonNull C10657a.C10662d dVar) {
        C4604n.m20093f("Must be called from the main thread.");
        if (dVar != null) {
            this.f24423e.remove(dVar);
        }
    }

    /* renamed from: t */
    public void mo22553t(boolean z) throws IOException, IllegalStateException {
        C4604n.m20093f("Must be called from the main thread.");
        C10697p0 p0Var = this.f24427i;
        if (p0Var != null) {
            p0Var.mo22354F(z);
        }
    }
}
