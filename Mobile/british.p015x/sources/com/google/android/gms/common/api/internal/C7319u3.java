package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p150t.C6077a;
import p232m5.C10801e;

/* renamed from: com.google.android.gms.common.api.internal.u3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7319u3 extends Fragment implements C7254i {

    /* renamed from: p0 */
    private static final WeakHashMap<FragmentActivity, WeakReference<C7319u3>> f29153p0 = new WeakHashMap<>();

    /* renamed from: m0 */
    private final Map<String, LifecycleCallback> f29154m0 = Collections.synchronizedMap(new C6077a());
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public int f29155n0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public Bundle f29156o0;

    /* renamed from: P1 */
    public static C7319u3 m29823P1(FragmentActivity fragmentActivity) {
        C7319u3 u3Var;
        WeakHashMap<FragmentActivity, WeakReference<C7319u3>> weakHashMap = f29153p0;
        WeakReference weakReference = weakHashMap.get(fragmentActivity);
        if (weakReference != null && (u3Var = (C7319u3) weakReference.get()) != null) {
            return u3Var;
        }
        try {
            C7319u3 u3Var2 = (C7319u3) fragmentActivity.mo3505r().mo3592j0("SupportLifecycleFragmentImpl");
            if (u3Var2 == null || u3Var2.mo3422i0()) {
                u3Var2 = new C7319u3();
                fragmentActivity.mo3505r().mo3598m().mo3852d(u3Var2, "SupportLifecycleFragmentImpl").mo3673h();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(u3Var2));
            return u3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: O0 */
    public final void mo3383O0() {
        super.mo3383O0();
        this.f29155n0 = 3;
        for (LifecycleCallback onResume : this.f29154m0.values()) {
            onResume.onResume();
        }
    }

    /* renamed from: P0 */
    public final void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f29154m0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    /* renamed from: Q0 */
    public final void mo3387Q0() {
        super.mo3387Q0();
        this.f29155n0 = 2;
        for (LifecycleCallback onStart : this.f29154m0.values()) {
            onStart.onStart();
        }
    }

    /* renamed from: R0 */
    public final void mo3389R0() {
        super.mo3389R0();
        this.f29155n0 = 4;
        for (LifecycleCallback onStop : this.f29154m0.values()) {
            onStop.onStop();
        }
    }

    /* renamed from: b */
    public final void mo29868b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f29154m0.containsKey(str)) {
            this.f29154m0.put(str, lifecycleCallback);
            if (this.f29155n0 > 0) {
                new C10801e(Looper.getMainLooper()).post(new C7314t3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: f */
    public final <T extends LifecycleCallback> T mo29869f(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f29154m0.get(str));
    }

    /* renamed from: h */
    public final /* synthetic */ Activity mo29870h() {
        return mo3443p();
    }

    /* renamed from: m */
    public final void mo3432m(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3432m(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f29154m0.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: o0 */
    public final void mo3438o0(int i, int i2, Intent intent) {
        super.mo3438o0(i, i2, intent);
        for (LifecycleCallback onActivityResult : this.f29154m0.values()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: t0 */
    public final void mo3457t0(Bundle bundle) {
        super.mo3457t0(bundle);
        this.f29155n0 = 1;
        this.f29156o0 = bundle;
        for (Map.Entry next : this.f29154m0.entrySet()) {
            ((LifecycleCallback) next.getValue()).onCreate(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    /* renamed from: y0 */
    public final void mo3471y0() {
        super.mo3471y0();
        this.f29155n0 = 5;
        for (LifecycleCallback onDestroy : this.f29154m0.values()) {
            onDestroy.onDestroy();
        }
    }
}
