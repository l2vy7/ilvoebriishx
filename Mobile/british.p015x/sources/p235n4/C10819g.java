package p235n4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C8430a;
import com.google.android.gms.internal.cast.C8431a0;

/* renamed from: n4.g */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10819g extends C8430a implements C10821i {
    C10819g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    /* renamed from: c1 */
    public final Bitmap mo42987c1(Uri uri) throws RemoteException {
        Parcel x = mo36365x();
        C8431a0.m40679d(x, uri);
        Parcel b2 = mo36362b2(1, x);
        Bitmap bitmap = (Bitmap) C8431a0.m40678c(b2, Bitmap.CREATOR);
        b2.recycle();
        return bitmap;
    }
}
