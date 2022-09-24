package p009b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b.a */
/* compiled from: ITrustedWebActivityCallback */
public interface C1508a extends IInterface {

    /* renamed from: b.a$a */
    /* compiled from: ITrustedWebActivityCallback */
    public static abstract class C1509a extends Binder implements C1508a {

        /* renamed from: b.a$a$a */
        /* compiled from: ITrustedWebActivityCallback */
        private static class C1510a implements C1508a {

            /* renamed from: b */
            private IBinder f6530b;

            C1510a(IBinder iBinder) {
                this.f6530b = iBinder;
            }

            public IBinder asBinder() {
                return this.f6530b;
            }
        }

        /* renamed from: x */
        public static C1508a m7828x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1508a)) {
                return new C1510a(iBinder);
            }
            return (C1508a) queryLocalInterface;
        }
    }
}
