package com.google.android.exoplayer2.offline;

/* renamed from: com.google.android.exoplayer2.offline.b */
/* compiled from: DownloadCursor */
public final /* synthetic */ class C6792b {
    /* renamed from: a */
    public static boolean m28568a(DownloadCursor downloadCursor) {
        if (downloadCursor.getCount() == 0 || downloadCursor.getPosition() == downloadCursor.getCount()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m28569b(DownloadCursor downloadCursor) {
        if (downloadCursor.getCount() == 0 || downloadCursor.getPosition() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m28570c(DownloadCursor downloadCursor) {
        return downloadCursor.getPosition() == 0 && downloadCursor.getCount() != 0;
    }

    /* renamed from: d */
    public static boolean m28571d(DownloadCursor downloadCursor) {
        int count = downloadCursor.getCount();
        return downloadCursor.getPosition() == count + -1 && count != 0;
    }

    /* renamed from: e */
    public static boolean m28572e(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(0);
    }

    /* renamed from: f */
    public static boolean m28573f(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(downloadCursor.getCount() - 1);
    }

    /* renamed from: g */
    public static boolean m28574g(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(downloadCursor.getPosition() + 1);
    }

    /* renamed from: h */
    public static boolean m28575h(DownloadCursor downloadCursor) {
        return downloadCursor.moveToPosition(downloadCursor.getPosition() - 1);
    }
}
