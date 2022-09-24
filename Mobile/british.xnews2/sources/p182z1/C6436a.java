package p182z1;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: z1.a */
/* compiled from: InstallReferrerClient */
public abstract class C6436a {

    /* renamed from: z1.a$b */
    /* compiled from: InstallReferrerClient */
    public static final class C6438b {

        /* renamed from: a */
        private final Context f26480a;

        /* renamed from: a */
        public C6436a mo24260a() {
            Context context = this.f26480a;
            if (context != null) {
                return new C6439b(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C6438b(Context context) {
            this.f26480a = context;
        }
    }

    /* renamed from: b */
    public static C6438b m28119b(Context context) {
        return new C6438b(context);
    }

    /* renamed from: a */
    public abstract C6443d mo24258a() throws RemoteException;

    /* renamed from: c */
    public abstract void mo24259c(C6442c cVar);
}
