package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.C7254i;

/* renamed from: com.google.android.gms.common.internal.b0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C7373b0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C7373b0 m29988b(Activity activity, Intent intent, int i) {
        return new C7443z(intent, activity, i);
    }

    /* renamed from: c */
    public static C7373b0 m29989c(C7254i iVar, Intent intent, int i) {
        return new C7370a0(intent, iVar, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30039a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo30039a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
