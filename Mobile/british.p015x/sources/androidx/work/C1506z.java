package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.z */
/* compiled from: WorkerFactory */
public abstract class C1506z {

    /* renamed from: a */
    private static final String f6529a = C1483m.m7773f("WorkerFactory");

    /* renamed from: androidx.work.z$a */
    /* compiled from: WorkerFactory */
    class C1507a extends C1506z {
        C1507a() {
        }

        /* renamed from: a */
        public ListenableWorker mo7057a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static C1506z m7824c() {
        return new C1507a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo7057a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker mo7058b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo7057a(context, str, workerParameters);
        if (a == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                C1483m c = C1483m.m7771c();
                String str2 = f6529a;
                c.mo7014b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C1483m c2 = C1483m.m7771c();
                    String str3 = f6529a;
                    c2.mo7014b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.isUsed()) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
