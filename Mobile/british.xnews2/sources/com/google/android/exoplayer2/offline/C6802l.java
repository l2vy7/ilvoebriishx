package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.offline.DownloadManager;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.offline.l */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6802l implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C6802l f27497b = new C6802l();

    private /* synthetic */ C6802l() {
    }

    public final int compare(Object obj, Object obj2) {
        return DownloadManager.InternalHandler.compareStartTimes((Download) obj, (Download) obj2);
    }
}
