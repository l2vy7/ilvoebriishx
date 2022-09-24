package p001a0;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.content.C0600b;
import java.util.Arrays;

/* renamed from: a0.a */
/* compiled from: ActivityCompat */
public class C0008a extends C0600b {

    /* renamed from: d */
    private static C0012d f4d;

    /* renamed from: a0.a$a */
    /* compiled from: ActivityCompat */
    class C0009a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String[] f5b;

        /* renamed from: c */
        final /* synthetic */ Activity f6c;

        /* renamed from: d */
        final /* synthetic */ int f7d;

        C0009a(String[] strArr, Activity activity, int i) {
            this.f5b = strArr;
            this.f6c = activity;
            this.f7d = i;
        }

        public void run() {
            int[] iArr = new int[this.f5b.length];
            PackageManager packageManager = this.f6c.getPackageManager();
            String packageName = this.f6c.getPackageName();
            int length = this.f5b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f5b[i], packageName);
            }
            ((C0011c) this.f6c).onRequestPermissionsResult(this.f7d, this.f5b, iArr);
        }
    }

    /* renamed from: a0.a$b */
    /* compiled from: ActivityCompat */
    class C0010b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f8b;

        C0010b(Activity activity) {
            this.f8b = activity;
        }

        public void run() {
            if (!this.f8b.isFinishing() && !C0016d.m48i(this.f8b)) {
                this.f8b.recreate();
            }
        }
    }

    /* renamed from: a0.a$c */
    /* compiled from: ActivityCompat */
    public interface C0011c {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: a0.a$d */
    /* compiled from: ActivityCompat */
    public interface C0012d {
        /* renamed from: a */
        boolean mo31a(Activity activity, String[] strArr, int i);
    }

    /* renamed from: a0.a$e */
    /* compiled from: ActivityCompat */
    public interface C0013e {
        /* renamed from: b */
        void mo32b(int i);
    }

    /* renamed from: n */
    public static void m32n(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    /* renamed from: o */
    public static void m33o(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
        } else if (i <= 23) {
            new Handler(activity.getMainLooper()).post(new C0010b(activity));
        } else if (!C0016d.m48i(activity)) {
            activity.recreate();
        }
    }

    /* renamed from: p */
    public static void m34p(Activity activity, String[] strArr, int i) {
        C0012d dVar = f4d;
        if (dVar == null || !dVar.mo31a(activity, strArr, i)) {
            int length = strArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof C0013e) {
                    ((C0013e) activity).mo32b(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof C0011c) {
                new Handler(Looper.getMainLooper()).post(new C0009a(strArr, activity, i));
            }
        }
    }

    /* renamed from: q */
    public static void m35q(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: r */
    public static void m36r(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }
}
