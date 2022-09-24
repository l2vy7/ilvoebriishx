package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.media.MediaBrowserCompat;
import android.support.p007v4.media.session.MediaControllerCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.util.List;

public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: androidx.media.session.MediaButtonReceiver$a */
    private static class C0844a extends MediaBrowserCompat.C0119b {

        /* renamed from: c */
        private final Context f3996c;

        /* renamed from: d */
        private final Intent f3997d;

        /* renamed from: e */
        private final BroadcastReceiver.PendingResult f3998e;

        /* renamed from: f */
        private MediaBrowserCompat f3999f;

        C0844a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f3996c = context;
            this.f3997d = intent;
            this.f3998e = pendingResult;
        }

        /* renamed from: e */
        private void m4454e() {
            this.f3999f.mo245b();
            this.f3998e.finish();
        }

        /* renamed from: a */
        public void mo257a() {
            new MediaControllerCompat(this.f3996c, this.f3999f.mo246c()).mo347a((KeyEvent) this.f3997d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            m4454e();
        }

        /* renamed from: b */
        public void mo258b() {
            m4454e();
        }

        /* renamed from: c */
        public void mo259c() {
            m4454e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4151f(MediaBrowserCompat mediaBrowserCompat) {
            this.f3999f = mediaBrowserCompat;
        }
    }

    /* renamed from: a */
    public static ComponentName m4451a(Context context) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    /* renamed from: b */
    private static ComponentName m4452b(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }

    /* renamed from: c */
    private static void m4453c(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
            return;
        }
        ComponentName b = m4452b(context, "android.intent.action.MEDIA_BUTTON");
        if (b != null) {
            intent.setComponent(b);
            m4453c(context, intent);
            return;
        }
        ComponentName b2 = m4452b(context, "android.media.browse.MediaBrowserService");
        if (b2 != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Context applicationContext = context.getApplicationContext();
            C0844a aVar = new C0844a(applicationContext, intent, goAsync);
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, b2, aVar, (Bundle) null);
            aVar.mo4151f(mediaBrowserCompat);
            mediaBrowserCompat.mo244a();
            return;
        }
        throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
    }
}
