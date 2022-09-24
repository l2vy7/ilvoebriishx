package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.DataInputStream;
import java.io.IOException;
import p006a5.C0114k;
import p256v4.C11058b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcdo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdo> CREATOR = new ti0();

    /* renamed from: b */
    ParcelFileDescriptor f43021b;

    /* renamed from: c */
    private Parcelable f43022c = null;

    /* renamed from: d */
    private boolean f43023d = true;

    public zzcdo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f43021b = parcelFileDescriptor;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: C0 */
    public final <T extends SafeParcelable> T mo36264C0(Parcelable.Creator<T> creator) {
        if (this.f43023d) {
            ParcelFileDescriptor parcelFileDescriptor = this.f43021b;
            if (parcelFileDescriptor == null) {
                co0.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                int readInt = dataInputStream.readInt();
                byte[] bArr = new byte[readInt];
                dataInputStream.readFully(bArr, 0, readInt);
                C0114k.m409a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, readInt);
                    obtain.setDataPosition(0);
                    this.f43022c = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f43023d = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                co0.zzh("Could not read from parcel file descriptor", e);
                C0114k.m409a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C0114k.m409a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f43022c;
    }

    /* JADX INFO: finally extract failed */
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        if (this.f43021b == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f43022c.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                    try {
                        po0.f37722a.execute(new si0(autoCloseOutputStream, marshall));
                        parcelFileDescriptor = createPipe[0];
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    e = e2;
                    autoCloseOutputStream = null;
                    co0.zzh("Error transporting the ad response", e);
                    zzt.zzo().mo18592s(e, "LargeParcelTeleporter.pipeData.2");
                    C0114k.m409a(autoCloseOutputStream);
                    this.f43021b = parcelFileDescriptor;
                    int a = C11058b.m49515a(parcel);
                    C11058b.m49535u(parcel, 2, this.f43021b, i, false);
                    C11058b.m49516b(parcel, a);
                }
                this.f43021b = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int a2 = C11058b.m49515a(parcel);
        C11058b.m49535u(parcel, 2, this.f43021b, i, false);
        C11058b.m49516b(parcel, a2);
    }
}
