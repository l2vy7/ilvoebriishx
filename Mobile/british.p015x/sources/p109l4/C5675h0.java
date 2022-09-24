package p109l4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzam;
import com.google.android.gms.cast.zzbl;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7203b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C7259j;
import com.google.android.gms.common.api.internal.C7285o;
import com.google.android.gms.common.api.internal.C7310t;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7372b;
import com.google.android.gms.internal.cast.C8564i0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p109l4.C10657a;
import p244q4.C10920a;
import p244q4.C10922b;
import p244q4.C10928e;
import p244q4.C10932g;
import p244q4.C10936i;
import p244q4.C10941k0;

@SuppressLint({"UseSparseArrays"})
/* renamed from: l4.h0 */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public final class C5675h0 extends C4591e<C10657a.C10660c> implements C10697p0 {
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final C10922b f24257w = new C10922b("CastClient");

    /* renamed from: x */
    private static final C7191a.C7192a<C10941k0, C10657a.C10660c> f24258x;

    /* renamed from: y */
    private static final C7191a<C10657a.C10660c> f24259y;

    /* renamed from: z */
    public static final /* synthetic */ int f24260z = 0;

    /* renamed from: a */
    final C10680g0 f24261a = new C10680g0(this);

    /* renamed from: b */
    private Handler f24262b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f24263c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f24264d;

    /* renamed from: e */
    TaskCompletionSource<C10657a.C10658a> f24265e;

    /* renamed from: f */
    TaskCompletionSource<Status> f24266f;

    /* renamed from: g */
    private final AtomicLong f24267g;

    /* renamed from: h */
    private final Object f24268h = new Object();

    /* renamed from: i */
    private final Object f24269i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ApplicationMetadata f24270j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f24271k;

    /* renamed from: l */
    private double f24272l;

    /* renamed from: m */
    private boolean f24273m;

    /* renamed from: n */
    private int f24274n;

    /* renamed from: o */
    private int f24275o;

    /* renamed from: p */
    private zzam f24276p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final CastDevice f24277q;

    /* renamed from: r */
    final Map<Long, TaskCompletionSource<Void>> f24278r;

    /* renamed from: s */
    final Map<String, C10657a.C10663e> f24279s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C10657a.C10662d f24280t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final List<C10695o0> f24281u = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f24282v;

    static {
        C10711y yVar = new C10711y();
        f24258x = yVar;
        f24259y = new C7191a<>("Cast.API_CXLESS", yVar, C10936i.f49822b);
    }

    C5675h0(Context context, C10657a.C10660c cVar) {
        super(context, f24259y, cVar, C4591e.C4592a.f19970c);
        C4604n.m20099l(context, "context cannot be null");
        C4604n.m20099l(cVar, "CastOptions cannot be null");
        this.f24280t = cVar.f49247c;
        this.f24277q = cVar.f49246b;
        this.f24278r = new HashMap();
        this.f24279s = new HashMap();
        this.f24267g = new AtomicLong(0);
        this.f24282v = 1;
        mo22356K();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final Task<Boolean> m25036B(C10932g gVar) {
        return doUnregisterEventListener((C7259j.C7260a) C4604n.m20099l(registerListener(gVar, "castDeviceControllerListenerKey").mo29874b(), "Key must not be null"), 8415);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m25037C() {
        f24257w.mo43190a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f24279s) {
            this.f24279s.clear();
        }
    }

    /* renamed from: D */
    private final void m25038D() {
        boolean z = true;
        if (this.f24282v == 1) {
            z = false;
        }
        C4604n.m20102o(z, "Not active connection");
    }

    /* renamed from: E */
    private final void m25039E() {
        C4604n.m20102o(this.f24282v == 2, "Not connected to device");
    }

    /* renamed from: G */
    private final void m25040G(TaskCompletionSource<C10657a.C10658a> taskCompletionSource) {
        synchronized (this.f24268h) {
            if (this.f24265e != null) {
                m25041H(2477);
            }
            this.f24265e = taskCompletionSource;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m25041H(int i) {
        synchronized (this.f24268h) {
            TaskCompletionSource<C10657a.C10658a> taskCompletionSource = this.f24265e;
            if (taskCompletionSource != null) {
                taskCompletionSource.setException(m25042I(i));
            }
            this.f24265e = null;
        }
    }

    /* renamed from: I */
    private static C7203b m25042I(int i) {
        return C7372b.m29987a(new Status(i));
    }

    /* renamed from: h */
    static /* synthetic */ Handler m25043h(C5675h0 h0Var) {
        if (h0Var.f24262b == null) {
            h0Var.f24262b = new C8564i0(h0Var.getLooper());
        }
        return h0Var.f24262b;
    }

    /* renamed from: k */
    static /* synthetic */ void m25046k(C5675h0 h0Var, C10657a.C10658a aVar) {
        synchronized (h0Var.f24268h) {
            TaskCompletionSource<C10657a.C10658a> taskCompletionSource = h0Var.f24265e;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(aVar);
            }
            h0Var.f24265e = null;
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m25048m(C5675h0 h0Var, int i) {
        synchronized (h0Var.f24269i) {
            TaskCompletionSource<Status> taskCompletionSource = h0Var.f24266f;
            if (taskCompletionSource != null) {
                if (i == 0) {
                    taskCompletionSource.setResult(new Status(0));
                } else {
                    taskCompletionSource.setException(m25042I(i));
                }
                h0Var.f24266f = null;
            }
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m25051p(C5675h0 h0Var, long j, int i) {
        TaskCompletionSource taskCompletionSource;
        synchronized (h0Var.f24278r) {
            Map<Long, TaskCompletionSource<Void>> map = h0Var.f24278r;
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = map.get(valueOf);
            h0Var.f24278r.remove(valueOf);
        }
        if (taskCompletionSource == null) {
            return;
        }
        if (i == 0) {
            taskCompletionSource.setResult(null);
        } else {
            taskCompletionSource.setException(m25042I(i));
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m25053r(C5675h0 h0Var, zza zza) {
        boolean z;
        String C0 = zza.mo29620C0();
        if (!C10920a.m49143f(C0, h0Var.f24271k)) {
            h0Var.f24271k = C0;
            z = true;
        } else {
            z = false;
        }
        f24257w.mo43190a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(h0Var.f24264d));
        C10657a.C10662d dVar = h0Var.f24280t;
        if (dVar != null && (z || h0Var.f24264d)) {
            dVar.mo42805d();
        }
        h0Var.f24264d = false;
    }

    /* renamed from: s */
    static /* synthetic */ void m25054s(C5675h0 h0Var, zzy zzy) {
        boolean z;
        boolean z2;
        boolean z3;
        ApplicationMetadata F0 = zzy.mo29627F0();
        if (!C10920a.m49143f(F0, h0Var.f24270j)) {
            h0Var.f24270j = F0;
            h0Var.f24280t.mo42804c(F0);
        }
        double C0 = zzy.mo29624C0();
        if (Double.isNaN(C0) || Math.abs(C0 - h0Var.f24272l) <= 1.0E-7d) {
            z = false;
        } else {
            h0Var.f24272l = C0;
            z = true;
        }
        boolean D0 = zzy.mo29625D0();
        if (D0 != h0Var.f24273m) {
            h0Var.f24273m = D0;
            z = true;
        }
        C10922b bVar = f24257w;
        bVar.mo43190a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(h0Var.f24263c));
        C10657a.C10662d dVar = h0Var.f24280t;
        if (dVar != null && (z || h0Var.f24263c)) {
            dVar.mo36584f();
        }
        Double.isNaN(zzy.mo29629H0());
        int zzc = zzy.zzc();
        if (zzc != h0Var.f24274n) {
            h0Var.f24274n = zzc;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.mo43190a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(h0Var.f24263c));
        C10657a.C10662d dVar2 = h0Var.f24280t;
        if (dVar2 != null && (z2 || h0Var.f24263c)) {
            dVar2.mo42802a(h0Var.f24274n);
        }
        int E0 = zzy.mo29626E0();
        if (E0 != h0Var.f24275o) {
            h0Var.f24275o = E0;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.mo43190a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(h0Var.f24263c));
        C10657a.C10662d dVar3 = h0Var.f24280t;
        if (dVar3 != null && (z3 || h0Var.f24263c)) {
            dVar3.mo42806e(h0Var.f24275o);
        }
        if (!C10920a.m49143f(h0Var.f24276p, zzy.mo29628G0())) {
            h0Var.f24276p = zzy.mo29628G0();
        }
        h0Var.f24263c = false;
    }

    /* renamed from: y */
    static /* synthetic */ void m25059y(C5675h0 h0Var) {
        h0Var.f24274n = -1;
        h0Var.f24275o = -1;
        h0Var.f24270j = null;
        h0Var.f24271k = null;
        h0Var.f24272l = 0.0d;
        h0Var.mo22356K();
        h0Var.f24273m = false;
        h0Var.f24276p = null;
    }

    /* renamed from: F */
    public final Task<Void> mo22354F(boolean z) {
        return doWrite(C7310t.m29801a().mo29938b(new C10694o(this, z)).mo29941e(8412).mo29937a());
    }

    /* renamed from: J */
    public final Task<C10657a.C10658a> mo22355J(String str, String str2, zzbl zzbl) {
        return doWrite(C7310t.m29801a().mo29938b(new C10708v(this, str, str2, (zzbl) null)).mo29941e(8407).mo29937a());
    }

    /* access modifiers changed from: package-private */
    @RequiresNonNull({"device"})
    /* renamed from: K */
    public final double mo22356K() {
        if (this.f24277q.mo29186J0(2048)) {
            return 0.02d;
        }
        if (!this.f24277q.mo29186J0(4) || this.f24277q.mo29186J0(1) || "Chromecast Audio".equals(this.f24277q.mo29184H0())) {
            return 0.05d;
        }
        return 0.02d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final /* synthetic */ void mo22357L(C10657a.C10663e eVar, String str, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        m25038D();
        if (eVar != null) {
            ((C10928e) k0Var.getService()).mo43207P(str);
        }
        taskCompletionSource.setResult(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final /* synthetic */ void mo22358M(String str, C10657a.C10663e eVar, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        m25038D();
        ((C10928e) k0Var.getService()).mo43207P(str);
        if (eVar != null) {
            ((C10928e) k0Var.getService()).mo43206B(str);
        }
        taskCompletionSource.setResult(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo22359N(boolean z, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((C10928e) k0Var.getService()).mo43209o6(z, this.f24272l, this.f24273m);
        taskCompletionSource.setResult(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo22360O(String str, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        m25039E();
        ((C10928e) k0Var.getService()).mo43208n6(str);
        synchronized (this.f24269i) {
            if (this.f24266f != null) {
                taskCompletionSource.setException(m25042I(2001));
            } else {
                this.f24266f = taskCompletionSource;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final /* synthetic */ void mo22361P(String str, String str2, zzbl zzbl, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        m25039E();
        ((C10928e) k0Var.getService()).mo43212r6(str, str2, (zzbl) null);
        m25040G(taskCompletionSource);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo22362Q(String str, LaunchOptions launchOptions, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        m25039E();
        ((C10928e) k0Var.getService()).mo43211q6(str, launchOptions);
        m25040G(taskCompletionSource);
    }

    /* renamed from: a */
    public final Task<Void> mo22363a(String str, String str2) {
        C10920a.m49142e(str);
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("The message payload cannot be null or empty");
        } else if (str2.length() <= 524288) {
            return doWrite(C7310t.m29801a().mo29938b(new C10704t(this, (String) null, str, str2)).mo29941e(8405).mo29937a());
        } else {
            f24257w.mo43195f("Message send failed. Message exceeds maximum size", new Object[0]);
            throw new IllegalArgumentException("Message exceeds maximum size524288");
        }
    }

    /* renamed from: c */
    public final void mo22364c(C10695o0 o0Var) {
        C4604n.m20098k(o0Var);
        this.f24281u.add(o0Var);
    }

    /* renamed from: c0 */
    public final Task<Void> mo22365c0(String str) {
        C10657a.C10663e remove;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f24279s) {
                remove = this.f24279s.remove(str);
            }
            return doWrite(C7310t.m29801a().mo29938b(new C10698q(this, remove, str)).mo29941e(8414).mo29937a());
        }
        throw new IllegalArgumentException("Channel namespace cannot be null or empty");
    }

    /* renamed from: e */
    public final Task<C10657a.C10658a> mo22366e(String str, LaunchOptions launchOptions) {
        return doWrite(C7310t.m29801a().mo29938b(new C10706u(this, str, launchOptions)).mo29941e(8406).mo29937a());
    }

    /* renamed from: f */
    public final Task<Void> mo22367f(String str, C10657a.C10663e eVar) {
        C10920a.m49142e(str);
        if (eVar != null) {
            synchronized (this.f24279s) {
                this.f24279s.put(str, eVar);
            }
        }
        return doWrite(C7310t.m29801a().mo29938b(new C10696p(this, str, eVar)).mo29941e(8413).mo29937a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo22368g(String str, String str2, String str3, C10941k0 k0Var, TaskCompletionSource taskCompletionSource) throws RemoteException {
        long incrementAndGet = this.f24267g.incrementAndGet();
        m25039E();
        try {
            this.f24278r.put(Long.valueOf(incrementAndGet), taskCompletionSource);
            ((C10928e) k0Var.getService()).mo43210p6(str2, str3, incrementAndGet);
        } catch (RemoteException e) {
            this.f24278r.remove(Long.valueOf(incrementAndGet));
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: x */
    public final Task<Status> mo22369x(String str) {
        return doWrite(C7310t.m29801a().mo29938b(new C10710x(this, str)).mo29941e(8409).mo29937a());
    }

    public final Task<Void> zzb() {
        C7259j registerListener = registerListener(this.f24261a, "castDeviceControllerListenerKey");
        C7285o.C7286a a = C7285o.m29716a();
        C10692n nVar = new C10692n(this);
        return doRegisterEventListener(a.mo29912f(registerListener).mo29908b(nVar).mo29911e(C10700r.f49322a).mo29909c(C10690m.f49303b).mo29910d(8428).mo29907a());
    }

    public final Task<Void> zzc() {
        Task<Void> doWrite = doWrite(C7310t.m29801a().mo29938b(C10702s.f49324a).mo29941e(8403).mo29937a());
        m25037C();
        m25036B(this.f24261a);
        return doWrite;
    }

    public final boolean zzk() {
        m25039E();
        return this.f24273m;
    }
}
