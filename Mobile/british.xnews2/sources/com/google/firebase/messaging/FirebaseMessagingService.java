package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.C10434i;
import com.google.firebase.iid.zzb;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import p240o7.C10860b;

public class FirebaseMessagingService extends zzb {

    /* renamed from: g */
    private static final Queue<String> f48968g = new ArrayDeque(10);

    /* renamed from: k */
    static void m48170k(Bundle bundle) {
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && str.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Intent mo41873c(Intent intent) {
        return C10434i.m48059c().mo41885d();
    }

    /* renamed from: d */
    public final boolean mo41919d(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!C10860b.m48878e(intent)) {
            return true;
        }
        C10860b.m48876c(intent);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        if (r1.equals("send_error") == false) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41874e(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x0059
        L_0x0017:
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0029
            boolean r0 = p240o7.C10860b.m48878e(r12)
            if (r0 == 0) goto L_0x0058
            p240o7.C10860b.m48874a(r12)
            return
        L_0x0029:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "token"
            java.lang.String r12 = r12.getStringExtra(r0)
            r11.mo41942i(r12)
            return
        L_0x003b:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.String r12 = r12.getAction()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r1 = r12.length()
            if (r1 == 0) goto L_0x0050
            java.lang.String r12 = r0.concat(r12)
            goto L_0x0055
        L_0x0050:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
        L_0x0055:
            android.util.Log.d(r2, r12)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r12.getStringExtra(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 2
            if (r3 == 0) goto L_0x006c
            r3 = 0
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r3)
            goto L_0x007c
        L_0x006c:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putString(r0, r1)
            f7.d r5 = p077f7.C10541d.m48280f(r11)
            com.google.android.gms.tasks.Task r3 = r5.mo42657b(r4, r3)
        L_0x007c:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            r6 = 1
            r7 = 3
            r8 = 0
            if (r5 == 0) goto L_0x0087
        L_0x0085:
            r1 = 0
            goto L_0x00bf
        L_0x0087:
            java.util.Queue<java.lang.String> r5 = f48968g
            boolean r9 = r5.contains(r1)
            if (r9 == 0) goto L_0x00b0
            boolean r5 = android.util.Log.isLoggable(r2, r7)
            if (r5 == 0) goto L_0x00ae
            java.lang.String r5 = "Received duplicate message: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r9 = r1.length()
            if (r9 == 0) goto L_0x00a6
            java.lang.String r1 = r5.concat(r1)
            goto L_0x00ab
        L_0x00a6:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5)
        L_0x00ab:
            android.util.Log.d(r2, r1)
        L_0x00ae:
            r1 = 1
            goto L_0x00bf
        L_0x00b0:
            int r9 = r5.size()
            r10 = 10
            if (r9 < r10) goto L_0x00bb
            r5.remove()
        L_0x00bb:
            r5.add(r1)
            goto L_0x0085
        L_0x00bf:
            if (r1 != 0) goto L_0x0179
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r5 = "gcm"
            if (r1 != 0) goto L_0x00cc
            r1 = r5
        L_0x00cc:
            r9 = -1
            int r10 = r1.hashCode()
            switch(r10) {
                case -2062414158: goto L_0x00f3;
                case 102161: goto L_0x00ea;
                case 814694033: goto L_0x00e1;
                case 814800675: goto L_0x00d6;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            r4 = -1
            goto L_0x00fd
        L_0x00d6:
            java.lang.String r4 = "send_event"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00df
            goto L_0x00d4
        L_0x00df:
            r4 = 3
            goto L_0x00fd
        L_0x00e1:
            java.lang.String r5 = "send_error"
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x00fd
            goto L_0x00d4
        L_0x00ea:
            boolean r4 = r1.equals(r5)
            if (r4 != 0) goto L_0x00f1
            goto L_0x00d4
        L_0x00f1:
            r4 = 1
            goto L_0x00fd
        L_0x00f3:
            java.lang.String r4 = "deleted_messages"
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L_0x00fc
            goto L_0x00d4
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            switch(r4) {
                case 0: goto L_0x0176;
                case 1: goto L_0x013a;
                case 2: goto L_0x011f;
                case 3: goto L_0x0117;
                default: goto L_0x0100;
            }
        L_0x0100:
            java.lang.String r12 = "Received message with unknown type: "
            int r0 = r1.length()
            if (r0 == 0) goto L_0x010d
            java.lang.String r12 = r12.concat(r1)
            goto L_0x0113
        L_0x010d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r12)
            r12 = r0
        L_0x0113:
            android.util.Log.w(r2, r12)
            goto L_0x0179
        L_0x0117:
            java.lang.String r12 = r12.getStringExtra(r0)
            r11.mo41941h(r12)
            goto L_0x0179
        L_0x011f:
            java.lang.String r0 = r12.getStringExtra(r0)
            if (r0 != 0) goto L_0x012b
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r12.getStringExtra(r0)
        L_0x012b:
            com.google.firebase.messaging.a r1 = new com.google.firebase.messaging.a
            java.lang.String r4 = "error"
            java.lang.String r12 = r12.getStringExtra(r4)
            r1.<init>(r12)
            r11.mo41943j(r0, r1)
            goto L_0x0179
        L_0x013a:
            boolean r0 = p240o7.C10860b.m48878e(r12)
            if (r0 == 0) goto L_0x0143
            p240o7.C10860b.m48877d(r12)
        L_0x0143:
            android.os.Bundle r0 = r12.getExtras()
            if (r0 != 0) goto L_0x014e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x014e:
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r0.remove(r1)
            boolean r1 = com.google.firebase.messaging.C10465b.m48187h(r0)
            if (r1 == 0) goto L_0x016d
            com.google.firebase.messaging.b r1 = new com.google.firebase.messaging.b
            r1.<init>(r11)
            boolean r1 = r1.mo41946j(r0)
            if (r1 != 0) goto L_0x0179
            boolean r1 = p240o7.C10860b.m48878e(r12)
            if (r1 == 0) goto L_0x016d
            p240o7.C10860b.m48875b(r12)
        L_0x016d:
            com.google.firebase.messaging.RemoteMessage r12 = new com.google.firebase.messaging.RemoteMessage
            r12.<init>(r0)
            r11.mo7220g(r12)
            goto L_0x0179
        L_0x0176:
            r11.mo41940f()
        L_0x0179:
            r0 = 1
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0185, InterruptedException -> 0x0183, TimeoutException -> 0x0181 }
            com.google.android.gms.tasks.Tasks.await(r3, r0, r12)     // Catch:{ ExecutionException -> 0x0185, InterruptedException -> 0x0183, TimeoutException -> 0x0181 }
            return
        L_0x0181:
            r12 = move-exception
            goto L_0x0186
        L_0x0183:
            r12 = move-exception
            goto L_0x0186
        L_0x0185:
            r12 = move-exception
        L_0x0186:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r0 = r12.length()
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Message ack failed: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            android.util.Log.w(r2, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.mo41874e(android.content.Intent):void");
    }

    /* renamed from: f */
    public void mo41940f() {
    }

    /* renamed from: g */
    public void mo7220g(RemoteMessage remoteMessage) {
    }

    /* renamed from: h */
    public void mo41941h(String str) {
    }

    /* renamed from: i */
    public void mo41942i(String str) {
    }

    /* renamed from: j */
    public void mo41943j(String str, Exception exc) {
    }
}
