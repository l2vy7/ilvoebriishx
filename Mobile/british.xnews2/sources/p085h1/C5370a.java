package p085h1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: h1.a */
/* compiled from: CopyLock */
public class C5370a {

    /* renamed from: e */
    private static final Map<String, Lock> f23639e = new HashMap();

    /* renamed from: a */
    private final File f23640a;

    /* renamed from: b */
    private final Lock f23641b;

    /* renamed from: c */
    private final boolean f23642c;

    /* renamed from: d */
    private FileChannel f23643d;

    public C5370a(String str, File file, boolean z) {
        File file2 = new File(file, str + ".lck");
        this.f23640a = file2;
        this.f23641b = m24184a(file2.getAbsolutePath());
        this.f23642c = z;
    }

    /* renamed from: a */
    private static Lock m24184a(String str) {
        Lock lock;
        Map<String, Lock> map = f23639e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    /* renamed from: b */
    public void mo21782b() {
        this.f23641b.lock();
        if (this.f23642c) {
            try {
                FileChannel channel = new FileOutputStream(this.f23640a).getChannel();
                this.f23643d = channel;
                channel.lock();
            } catch (IOException e) {
                throw new IllegalStateException("Unable to grab copy lock.", e);
            }
        }
    }

    /* renamed from: c */
    public void mo21783c() {
        FileChannel fileChannel = this.f23643d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f23641b.unlock();
    }
}
