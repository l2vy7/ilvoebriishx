package com.google.android.exoplayer2.offline;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.offline.DownloadHelper;

/* renamed from: com.google.android.exoplayer2.offline.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6799i implements Handler.Callback {

    /* renamed from: b */
    public final /* synthetic */ DownloadHelper.MediaPreparer f27494b;

    public /* synthetic */ C6799i(DownloadHelper.MediaPreparer mediaPreparer) {
        this.f27494b = mediaPreparer;
    }

    public final boolean handleMessage(Message message) {
        return this.f27494b.handleDownloadHelperCallbackMessage(message);
    }
}
