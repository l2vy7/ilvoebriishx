package p235n4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.C8661o;

/* renamed from: n4.h */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public abstract class C10820h extends C8661o implements C10821i {
    /* renamed from: b2 */
    public static C10821i m48790b2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        if (queryLocalInterface instanceof C10821i) {
            return (C10821i) queryLocalInterface;
        }
        return new C10819g(iBinder);
    }
}
