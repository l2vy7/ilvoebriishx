package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C7190a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C7206f;
import com.google.android.gms.common.internal.C4604n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: com.google.android.gms.common.api.internal.b3 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7224b3 extends C7248g3 {

    /* renamed from: f */
    private final SparseArray<C7219a3> f28977f = new SparseArray<>();

    private C7224b3(C7254i iVar) {
        super(iVar, C7190a.m29483q());
        this.mLifecycleFragment.mo29868b("AutoManageHelper", this);
    }

    /* renamed from: i */
    public static C7224b3 m29610i(C7249h hVar) {
        C7254i fragment = LifecycleCallback.getFragment(hVar);
        C7224b3 b3Var = (C7224b3) fragment.mo29869f("AutoManageHelper", C7224b3.class);
        if (b3Var != null) {
            return b3Var;
        }
        return new C7224b3(fragment);
    }

    /* renamed from: l */
    private final C7219a3 m29611l(int i) {
        if (this.f28977f.size() <= i) {
            return null;
        }
        SparseArray<C7219a3> sparseArray = this.f28977f;
        return sparseArray.get(sparseArray.keyAt(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29807b(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C7219a3 a3Var = this.f28977f.get(i);
        if (a3Var != null) {
            mo29823k(i);
            C7206f.C7209c cVar = a3Var.f28966d;
            if (cVar != null) {
                cVar.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo29808c() {
        for (int i = 0; i < this.f28977f.size(); i++) {
            C7219a3 l = m29611l(i);
            if (l != null) {
                l.f28965c.mo29770f();
            }
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f28977f.size(); i++) {
            C7219a3 l = m29611l(i);
            if (l != null) {
                printWriter.append(str).append("GoogleApiClient #").print(l.f28964b);
                printWriter.println(":");
                l.f28965c.mo29772h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: j */
    public final void mo29822j(int i, C7206f fVar, C7206f.C7209c cVar) {
        C4604n.m20099l(fVar, "GoogleApiClient instance cannot be null");
        boolean z = this.f28977f.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        C4604n.m20102o(z, sb.toString());
        C7235d3 d3Var = this.f29013c.get();
        boolean z2 = this.f29012b;
        String valueOf = String.valueOf(d3Var);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        C7219a3 a3Var = new C7219a3(this, i, fVar, cVar);
        fVar.mo29775o(a3Var);
        this.f28977f.put(i, a3Var);
        if (this.f29012b && d3Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(fVar.toString()));
            fVar.mo29770f();
        }
    }

    /* renamed from: k */
    public final void mo29823k(int i) {
        C7219a3 a3Var = this.f28977f.get(i);
        this.f28977f.remove(i);
        if (a3Var != null) {
            a3Var.f28965c.mo29776p(a3Var);
            a3Var.f28965c.mo29771g();
        }
    }

    public final void onStart() {
        super.onStart();
        boolean z = this.f29012b;
        String valueOf = String.valueOf(this.f28977f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.f29013c.get() == null) {
            for (int i = 0; i < this.f28977f.size(); i++) {
                C7219a3 l = m29611l(i);
                if (l != null) {
                    l.f28965c.mo29770f();
                }
            }
        }
    }

    public final void onStop() {
        super.onStop();
        for (int i = 0; i < this.f28977f.size(); i++) {
            C7219a3 l = m29611l(i);
            if (l != null) {
                l.f28965c.mo29771g();
            }
        }
    }
}
