package p101k2;

import android.util.Log;
import com.bumptech.glide.C3325f;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p004a3.C0052a;
import p064d2.C5154a;
import p064d2.C5163h;
import p070e2.C5208d;
import p101k2.C5596n;
import p183z2.C6445b;

/* renamed from: k2.d */
/* compiled from: ByteBufferFileLoader */
public class C5566d implements C5596n<File, ByteBuffer> {

    /* renamed from: k2.d$a */
    /* compiled from: ByteBufferFileLoader */
    private static final class C5567a implements C5208d<ByteBuffer> {

        /* renamed from: b */
        private final File f24087b;

        C5567a(File file) {
            this.f24087b = file;
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo21422a() {
            return ByteBuffer.class;
        }

        /* renamed from: b */
        public void mo21427b() {
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return C5154a.LOCAL;
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super ByteBuffer> aVar) {
            try {
                aVar.mo21439f(C0052a.m213a(this.f24087b));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo21438c(e);
            }
        }
    }

    /* renamed from: k2.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C5568b implements C5598o<File, ByteBuffer> {
        /* renamed from: a */
        public C5596n<File, ByteBuffer> mo22118a(C5604r rVar) {
            return new C5566d();
        }
    }

    /* renamed from: c */
    public C5596n.C5597a<ByteBuffer> mo22113a(File file, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(file), new C5567a(file));
    }

    /* renamed from: d */
    public boolean mo22114b(File file) {
        return true;
    }
}
