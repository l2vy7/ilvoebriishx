package com.google.android.gms.cast.framework.media;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import p199d5.C10487a;

/* renamed from: com.google.android.gms.cast.framework.media.m0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public interface C7130m0 extends IInterface {
    /* renamed from: K5 */
    WebImage mo29575K5(MediaMetadata mediaMetadata, ImageHints imageHints) throws RemoteException;

    /* renamed from: w4 */
    WebImage mo29576w4(MediaMetadata mediaMetadata, int i) throws RemoteException;

    C10487a zzf() throws RemoteException;
}
