package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.vision.barcode.Barcode;
import java.nio.ByteBuffer;
import p199d5.C10489b;

/* renamed from: com.google.android.gms.internal.vision.l6 */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C9565l6 extends C9597p6<C9613r5> {

    /* renamed from: i */
    private final zzk f45740i;

    public C9565l6(Context context, zzk zzk) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f45740i = zzk;
        mo38551e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo38489b(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.C7468a {
        C9573m6 m6Var;
        IBinder d = dynamiteModule.mo30249d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (d == null) {
            m6Var = null;
        } else {
            IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            if (queryLocalInterface instanceof C9573m6) {
                m6Var = (C9573m6) queryLocalInterface;
            } else {
                m6Var = new C9589o6(d);
            }
        }
        if (m6Var == null) {
            return null;
        }
        return m6Var.mo38505V2(C10489b.m48195m6(context), this.f45740i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo38490c() throws RemoteException {
        if (mo38549a()) {
            ((C9613r5) mo38551e()).zzo();
        }
    }

    /* renamed from: f */
    public final Barcode[] mo38491f(Bitmap bitmap, zzu zzu) {
        if (!mo38549a()) {
            return new Barcode[0];
        }
        try {
            return ((C9613r5) mo38551e()).mo38523u1(C10489b.m48195m6(bitmap), zzu);
        } catch (RemoteException e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    /* renamed from: g */
    public final Barcode[] mo38492g(ByteBuffer byteBuffer, zzu zzu) {
        if (!mo38549a()) {
            return new Barcode[0];
        }
        try {
            return ((C9613r5) mo38551e()).mo38522q0(C10489b.m48195m6(byteBuffer), zzu);
        } catch (RemoteException e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }
}
