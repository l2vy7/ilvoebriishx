package p190b5;

import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: b5.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6509b implements ThreadFactory {

    /* renamed from: a */
    private final String f26584a;

    /* renamed from: b */
    private final ThreadFactory f26585b = Executors.defaultThreadFactory();

    public C6509b(String str) {
        C4604n.m20099l(str, "Name must not be null");
        this.f26584a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f26585b.newThread(new C6511d(runnable, 0));
        newThread.setName(this.f26584a);
        return newThread;
    }
}
