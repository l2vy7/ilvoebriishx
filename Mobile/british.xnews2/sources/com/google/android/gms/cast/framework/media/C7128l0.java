package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.C7355d;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.internal.cast.C8431a0;
import com.google.android.gms.internal.cast.C8661o;
import p198d5.C10487a;

/* renamed from: com.google.android.gms.cast.framework.media.l0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C7128l0 extends C8661o implements C7130m0 {
    public C7128l0() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo29574x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            WebImage w4 = mo29576w4((MediaMetadata) C8431a0.m40678c(parcel, MediaMetadata.CREATOR), parcel.readInt());
            parcel2.writeNoException();
            C8431a0.m40680e(parcel2, w4);
        } else if (i == 2) {
            C10487a zzf = zzf();
            parcel2.writeNoException();
            C8431a0.m40681f(parcel2, zzf);
        } else if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(C7355d.f29215a);
        } else if (i != 4) {
            return false;
        } else {
            WebImage K5 = mo29575K5((MediaMetadata) C8431a0.m40678c(parcel, MediaMetadata.CREATOR), (ImageHints) C8431a0.m40678c(parcel, ImageHints.CREATOR));
            parcel2.writeNoException();
            C8431a0.m40680e(parcel2, K5);
        }
        return true;
    }
}
