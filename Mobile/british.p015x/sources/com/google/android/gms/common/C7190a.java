package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C7254i;
import com.google.android.gms.common.api.internal.C7307s1;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.C4604n;
import com.google.android.gms.common.internal.C7373b0;
import com.google.android.gms.common.internal.C7441y;
import com.ironsource.sdk.p289c.C11539d;
import p001a0.C0026i;
import p006a5.C6487i;
import p006a5.C6492o;
import p193c5.C6518a;
import p225k4.C10636b;
import p225k4.C10637c;
import p229l5.C10718f;
import p252t4.C11012b;
import p252t4.C11016f;

/* renamed from: com.google.android.gms.common.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7190a extends C7353b {

    /* renamed from: d */
    public static final int f28875d = C7353b.f29212a;

    /* renamed from: e */
    private static final Object f28876e = new Object();

    /* renamed from: f */
    private static final C7190a f28877f = new C7190a();

    /* renamed from: c */
    private String f28878c;

    /* renamed from: q */
    public static C7190a m29483q() {
        return f28877f;
    }

    /* renamed from: A */
    public final boolean mo29704A(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent p;
        if (C6518a.m28312a(context) || (p = mo29712p(context, connectionResult)) == null) {
            return false;
        }
        mo29719x(context, connectionResult.mo29682C0(), (String) null, C10718f.m48550a(context, 0, GoogleApiActivity.m29502a(context, p, i, true), C10718f.f49345a | 134217728));
        return true;
    }

    /* renamed from: d */
    public Intent mo29705d(Context context, int i, String str) {
        return super.mo29705d(context, i, str);
    }

    /* renamed from: e */
    public PendingIntent mo29706e(Context context, int i, int i2) {
        return super.mo29706e(context, i, i2);
    }

    /* renamed from: g */
    public final String mo29707g(int i) {
        return super.mo29707g(i);
    }

    /* renamed from: i */
    public int mo29708i(Context context) {
        return super.mo29708i(context);
    }

    /* renamed from: j */
    public int mo29709j(Context context, int i) {
        return super.mo29709j(context, i);
    }

    /* renamed from: m */
    public final boolean mo29710m(int i) {
        return super.mo29710m(i);
    }

    /* renamed from: o */
    public Dialog mo29711o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return mo29715t(activity, i, C7373b0.m29988b(activity, mo29705d(activity, i, C11539d.f51879a), i2), onCancelListener);
    }

    /* renamed from: p */
    public PendingIntent mo29712p(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo29685F0()) {
            return connectionResult.mo29684E0();
        }
        return mo29706e(context, connectionResult.mo29682C0(), 0);
    }

    /* renamed from: r */
    public boolean mo29713r(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = mo29711o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        mo29718w(activity, o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: s */
    public void mo29714s(Context context, int i) {
        mo29719x(context, i, (String) null, mo29975f(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Dialog mo29715t(Context context, int i, C7373b0 b0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C7441y.m30078d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C7441y.m30077c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, b0Var);
        }
        String g = C7441y.m30081g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: u */
    public final Dialog mo29716u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C7441y.m30078d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo29718w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: v */
    public final zabx mo29717v(Context context, C7307s1 s1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabx = new zabx(s1Var);
        context.registerReceiver(zabx, intentFilter);
        zabx.mo29959a(context);
        if (mo29977l(context, "com.google.android.gms")) {
            return zabx;
        }
        s1Var.mo29854a();
        zabx.mo29960b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo29718w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C11016f.m49374f2(dialog, onCancelListener).mo3729e2(((FragmentActivity) activity).mo3505r(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C11012b.m49373a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    /* renamed from: x */
    public final void mo29719x(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo29720y(context);
        } else if (pendingIntent != null) {
            String f = C7441y.m30080f(context, i);
            String e = C7441y.m30079e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C4604n.m20098k(context.getSystemService("notification"));
            C0026i.C0034e D = new C0026i.C0034e(context).mo90w(true).mo78j(true).mo85q(f).mo65D(new C0026i.C0032c().mo61m(e));
            if (C6487i.m28267e(context)) {
                C4604n.m20101n(C6492o.m28284g());
                D.mo63B(context.getApplicationInfo().icon).mo92y(2);
                if (C6487i.m28268f(context)) {
                    D.mo71a(C10636b.f49187a, resources.getString(C10637c.f49206o), pendingIntent);
                } else {
                    D.mo83o(pendingIntent);
                }
            } else {
                D.mo63B(17301642).mo67F(resources.getString(C10637c.f49199h)).mo70I(System.currentTimeMillis()).mo83o(pendingIntent).mo84p(e);
            }
            if (C6492o.m28288k()) {
                C4604n.m20101n(C6492o.m28288k());
                synchronized (f28876e) {
                    str2 = this.f28878c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = C7441y.m30076b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                D.mo80l(str2);
            }
            Notification c = D.mo73c();
            if (i == 1 || i == 2 || i == 3) {
                C7355d.f29216b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, c);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo29720y(Context context) {
        new C7360f(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: z */
    public final boolean mo29721z(Activity activity, C7254i iVar, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog t = mo29715t(activity, i, C7373b0.m29989c(iVar, mo29705d(activity, i, C11539d.f51879a), 2), onCancelListener);
        if (t == null) {
            return false;
        }
        mo29718w(activity, t, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
