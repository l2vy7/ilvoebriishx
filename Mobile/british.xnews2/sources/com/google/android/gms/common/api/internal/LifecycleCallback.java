package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C4604n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class LifecycleCallback {
    protected final C7254i mLifecycleFragment;

    protected LifecycleCallback(C7254i iVar) {
        this.mLifecycleFragment = iVar;
    }

    @Keep
    private static C7254i getChimeraLifecycleFragmentImpl(C7249h hVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static C7254i getFragment(Activity activity) {
        return getFragment(new C7249h(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity h = this.mLifecycleFragment.mo29870h();
        C4604n.m20098k(h);
        return h;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static C7254i getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static C7254i getFragment(C7249h hVar) {
        if (hVar.mo29865d()) {
            return C7319u3.m29823P1(hVar.mo29863b());
        }
        if (hVar.mo29864c()) {
            return C7309s3.m29797d(hVar.mo29862a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
}
