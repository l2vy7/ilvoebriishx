package p189b5;

import com.google.android.gms.common.internal.C4604n;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6510c implements ThreadFactory {

    /* renamed from: a */
    private final String f26586a;

    /* renamed from: b */
    private final AtomicInteger f26587b = new AtomicInteger();

    /* renamed from: c */
    private final ThreadFactory f26588c = Executors.defaultThreadFactory();

    public C6510c(String str) {
        C4604n.m20099l(str, "Name must not be null");
        this.f26586a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f26588c.newThread(new C6511d(runnable, 0));
        String str = this.f26586a;
        int andIncrement = this.f26587b.getAndIncrement();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
