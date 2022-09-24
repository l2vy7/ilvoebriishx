package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qf0 implements DialogInterface.OnClickListener {

    /* renamed from: b */
    final /* synthetic */ String f38012b;

    /* renamed from: c */
    final /* synthetic */ String f38013c;

    /* renamed from: d */
    final /* synthetic */ sf0 f38014d;

    qf0(sf0 sf0, String str, String str2) {
        this.f38014d = sf0;
        this.f38012b = str;
        this.f38013c = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f38014d.f38962d.getSystemService("download");
        try {
            String str = this.f38012b;
            String str2 = this.f38013c;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzt.zzp();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f38014d.mo35419c("Could not store picture.");
        }
    }
}
