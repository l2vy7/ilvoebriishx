package p004a3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: a3.d */
/* compiled from: ExceptionCatchingInputStream */
public class C0057d extends InputStream {

    /* renamed from: d */
    private static final Queue<C0057d> f176d = C0066k.m253e(0);

    /* renamed from: b */
    private InputStream f177b;

    /* renamed from: c */
    private IOException f178c;

    C0057d() {
    }

    /* renamed from: d */
    public static C0057d m224d(InputStream inputStream) {
        C0057d poll;
        Queue<C0057d> queue = f176d;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C0057d();
        }
        poll.mo170f(inputStream);
        return poll;
    }

    public int available() throws IOException {
        return this.f177b.available();
    }

    /* renamed from: c */
    public IOException mo167c() {
        return this.f178c;
    }

    public void close() throws IOException {
        this.f177b.close();
    }

    /* renamed from: e */
    public void mo169e() {
        this.f178c = null;
        this.f177b = null;
        Queue<C0057d> queue = f176d;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo170f(InputStream inputStream) {
        this.f177b = inputStream;
    }

    public void mark(int i) {
        this.f177b.mark(i);
    }

    public boolean markSupported() {
        return this.f177b.markSupported();
    }

    public int read(byte[] bArr) {
        try {
            return this.f177b.read(bArr);
        } catch (IOException e) {
            this.f178c = e;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.f177b.reset();
    }

    public long skip(long j) {
        try {
            return this.f177b.skip(j);
        } catch (IOException e) {
            this.f178c = e;
            return 0;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f177b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f178c = e;
            return -1;
        }
    }

    public int read() {
        try {
            return this.f177b.read();
        } catch (IOException e) {
            this.f178c = e;
            return -1;
        }
    }
}
