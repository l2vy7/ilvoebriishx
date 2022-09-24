package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p149t.C6077a;
import p231m5.C10801e;

/* renamed from: com.google.android.gms.common.api.internal.s3 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C7309s3 extends Fragment implements C7254i {

    /* renamed from: e */
    private static final WeakHashMap<Activity, WeakReference<C7309s3>> f29134e = new WeakHashMap<>();

    /* renamed from: b */
    private final Map<String, LifecycleCallback> f29135b = Collections.synchronizedMap(new C6077a());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f29136c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f29137d;

    /* renamed from: d */
    public static C7309s3 m29797d(Activity activity) {
        C7309s3 s3Var;
        WeakHashMap<Activity, WeakReference<C7309s3>> weakHashMap = f29134e;
        WeakReference weakReference = weakHashMap.get(activity);
        if (weakReference != null && (s3Var = (C7309s3) weakReference.get()) != null) {
            return s3Var;
        }
        try {
            C7309s3 s3Var2 = (C7309s3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (s3Var2 == null || s3Var2.isRemoving()) {
                s3Var2 = new C7309s3();
                activity.getFragmentManager().beginTransaction().add(s3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(s3Var2));
            return s3Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: b */
    public final void mo29868b(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f29135b.containsKey(str)) {
            this.f29135b.put(str, lifecycleCallback);
            if (this.f29136c > 0) {
                new C10801e(Looper.getMainLooper()).post(new C7304r3(this, lifecycleCallback, str));
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

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f29135b.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: f */
    public final <T extends LifecycleCallback> T mo29869f(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f29135b.get(str));
    }

    /* renamed from: h */
    public final Activity mo29870h() {
        return getActivity();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback onActivityResult : this.f29135b.values()) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29136c = 1;
        this.f29137d = bundle;
        for (Map.Entry next : this.f29135b.entrySet()) {
            ((LifecycleCallback) next.getValue()).onCreate(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f29136c = 5;
        for (LifecycleCallback onDestroy : this.f29135b.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f29136c = 3;
        for (LifecycleCallback onResume : this.f29135b.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f29135b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f29136c = 2;
        for (LifecycleCallback onStart : this.f29135b.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f29136c = 4;
        for (LifecycleCallback onStop : this.f29135b.values()) {
            onStop.onStop();
        }
    }
}
