package p199d5;

import android.os.IBinder;
import android.os.IInterface;
import p232m5.C10798b;

/* renamed from: d5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public interface C10487a extends IInterface {

    /* renamed from: d5.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static abstract class C10488a extends C10798b implements C10487a {
        public C10488a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: b2 */
        public static C10487a m48193b2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C10487a ? (C10487a) queryLocalInterface : new C10492d(iBinder);
        }
    }
}
