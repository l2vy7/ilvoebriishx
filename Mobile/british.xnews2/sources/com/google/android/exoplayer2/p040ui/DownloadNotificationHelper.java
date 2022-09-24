package com.google.android.exoplayer2.p040ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import p001a0.C0026i;

/* renamed from: com.google.android.exoplayer2.ui.DownloadNotificationHelper */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final C0026i.C0034e notificationBuilder;

    public DownloadNotificationHelper(Context context, String str) {
        this.notificationBuilder = new C0026i.C0034e(context.getApplicationContext(), str);
    }

    private Notification buildEndStateNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private Notification buildNotification(Context context, int i, PendingIntent pendingIntent, String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        String str2;
        this.notificationBuilder.mo63B(i);
        C0026i.C0034e eVar = this.notificationBuilder;
        C0026i.C0032c cVar = null;
        if (i2 == 0) {
            str2 = null;
        } else {
            str2 = context.getResources().getString(i2);
        }
        eVar.mo85q(str2);
        this.notificationBuilder.mo83o(pendingIntent);
        C0026i.C0034e eVar2 = this.notificationBuilder;
        if (str != null) {
            cVar = new C0026i.C0032c().mo61m(str);
        }
        eVar2.mo65D(cVar);
        this.notificationBuilder.mo93z(i3, i4, z);
        this.notificationBuilder.mo91x(z2);
        this.notificationBuilder.mo62A(z3);
        return this.notificationBuilder.mo73c();
    }

    public Notification buildDownloadCompletedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C6934R.string.exo_download_completed);
    }

    public Notification buildDownloadFailedNotification(Context context, int i, PendingIntent pendingIntent, String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, C6934R.string.exo_download_failed);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification buildProgressNotification(android.content.Context r21, int r22, android.app.PendingIntent r23, java.lang.String r24, java.util.List<com.google.android.exoplayer2.offline.Download> r25) {
        /*
            r20 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
        L_0x0009:
            int r9 = r25.size()
            if (r3 >= r9) goto L_0x0045
            r9 = r25
            java.lang.Object r10 = r9.get(r3)
            com.google.android.exoplayer2.offline.Download r10 = (com.google.android.exoplayer2.offline.Download) r10
            int r11 = r10.state
            r12 = 5
            if (r11 != r12) goto L_0x001e
            r5 = 1
            goto L_0x0042
        L_0x001e:
            r12 = 7
            if (r11 == r12) goto L_0x0025
            r12 = 2
            if (r11 == r12) goto L_0x0025
            goto L_0x0042
        L_0x0025:
            float r4 = r10.getPercentDownloaded()
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x0031
            float r2 = r2 + r4
            r7 = 0
        L_0x0031:
            long r10 = r10.getBytesDownloaded()
            r12 = 0
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x003d
            r4 = 1
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r8 = r8 | r4
            int r6 = r6 + 1
            r4 = 1
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0045:
            if (r4 == 0) goto L_0x004b
            int r3 = com.google.android.exoplayer2.p040ui.C6934R.string.exo_download_downloading
        L_0x0049:
            r14 = r3
            goto L_0x0051
        L_0x004b:
            if (r5 == 0) goto L_0x0050
            int r3 = com.google.android.exoplayer2.p040ui.C6934R.string.exo_download_removing
            goto L_0x0049
        L_0x0050:
            r14 = 0
        L_0x0051:
            if (r4 == 0) goto L_0x0061
            float r3 = (float) r6
            float r2 = r2 / r3
            int r2 = (int) r2
            if (r7 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            r17 = r0
            r16 = r2
            goto L_0x0065
        L_0x0061:
            r16 = 0
            r17 = 1
        L_0x0065:
            r15 = 100
            r18 = 1
            r19 = 0
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            android.app.Notification r0 = r9.buildNotification(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p040ui.DownloadNotificationHelper.buildProgressNotification(android.content.Context, int, android.app.PendingIntent, java.lang.String, java.util.List):android.app.Notification");
    }
}
