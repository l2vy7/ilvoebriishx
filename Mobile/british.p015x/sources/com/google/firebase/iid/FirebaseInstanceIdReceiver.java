package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6492o;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: d */
    private static C10447t f48843d;
    @GuardedBy("FirebaseInstanceIdReceiver.class")

    /* renamed from: e */
    private static C10447t f48844e;

    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    public static int m48023d(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        boolean z = true;
        boolean z2 = C6492o.m28288k() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m48026g(broadcastReceiver, context, str, intent);
        }
        int e = C10434i.m48059c().mo41886e(context, str, intent);
        if (!C6492o.m28288k() || e != 402) {
            return e;
        }
        m48026g(broadcastReceiver, context, str, intent);
        return 403;
    }

    /* renamed from: e */
    private static synchronized C10447t m48024e(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (f48844e == null) {
                    f48844e = new C10447t(context, str);
                }
                C10447t tVar = f48844e;
                return tVar;
            }
            if (f48843d == null) {
                f48843d = new C10447t(context, str);
            }
            C10447t tVar2 = f48843d;
            return tVar2;
        }
    }

    /* renamed from: f */
    private final void m48025f(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent((ComponentName) null);
        intent.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if ("google.com/iid".equals(intent.getStringExtra("from")) || "com.google.firebase.INSTANCE_ID_EVENT".equals(str)) {
            str2 = "com.google.firebase.INSTANCE_ID_EVENT";
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || "com.google.firebase.MESSAGING_EVENT".equals(str)) {
            str2 = "com.google.firebase.MESSAGING_EVENT";
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i = -1;
        if (str2 != null) {
            i = m48023d(this, context, str2, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    /* renamed from: g */
    private static int m48026g(BroadcastReceiver broadcastReceiver, Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Binding to service: ".concat(valueOf) : new String("Binding to service: "));
        }
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m48024e(context, str).mo41911a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m48025f(context, intent2, intent.getAction());
            } else {
                m48025f(context, intent, intent.getAction());
            }
        }
    }
}
