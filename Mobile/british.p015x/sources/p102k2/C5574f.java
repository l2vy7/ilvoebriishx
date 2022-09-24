package p102k2;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.C3325f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p065d2.C5154a;
import p065d2.C5163h;
import p071e2.C5208d;
import p102k2.C5596n;
import p184z2.C6445b;

/* renamed from: k2.f */
/* compiled from: FileLoader */
public class C5574f<Data> implements C5596n<File, Data> {

    /* renamed from: a */
    private final C5579d<Data> f24094a;

    /* renamed from: k2.f$a */
    /* compiled from: FileLoader */
    public static class C5575a<Data> implements C5598o<File, Data> {

        /* renamed from: a */
        private final C5579d<Data> f24095a;

        public C5575a(C5579d<Data> dVar) {
            this.f24095a = dVar;
        }

        /* renamed from: a */
        public final C5596n<File, Data> mo22118a(C5604r rVar) {
            return new C5574f(this.f24095a);
        }
    }

    /* renamed from: k2.f$b */
    /* compiled from: FileLoader */
    public static class C5576b extends C5575a<ParcelFileDescriptor> {

        /* renamed from: k2.f$b$a */
        /* compiled from: FileLoader */
        class C5577a implements C5579d<ParcelFileDescriptor> {
            C5577a() {
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo22135a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo22136b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo22137c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C5576b() {
            super(new C5577a());
        }
    }

    /* renamed from: k2.f$c */
    /* compiled from: FileLoader */
    private static final class C5578c<Data> implements C5208d<Data> {

        /* renamed from: b */
        private final File f24096b;

        /* renamed from: c */
        private final C5579d<Data> f24097c;

        /* renamed from: d */
        private Data f24098d;

        C5578c(File file, C5579d<Data> dVar) {
            this.f24096b = file;
            this.f24097c = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo21422a() {
            return this.f24097c.mo22135a();
        }

        /* renamed from: b */
        public void mo21427b() {
            Data data = this.f24098d;
            if (data != null) {
                try {
                    this.f24097c.mo22136b(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        /* renamed from: d */
        public C5154a mo21430d() {
            return C5154a.LOCAL;
        }

        /* renamed from: e */
        public void mo21431e(C3325f fVar, C5208d.C5209a<? super Data> aVar) {
            try {
                Data c = this.f24097c.mo22137c(this.f24096b);
                this.f24098d = c;
                aVar.mo21439f(c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo21438c(e);
            }
        }
    }

    /* renamed from: k2.f$d */
    /* compiled from: FileLoader */
    public interface C5579d<Data> {
        /* renamed from: a */
        Class<Data> mo22135a();

        /* renamed from: b */
        void mo22136b(Data data) throws IOException;

        /* renamed from: c */
        Data mo22137c(File file) throws FileNotFoundException;
    }

    /* renamed from: k2.f$e */
    /* compiled from: FileLoader */
    public static class C5580e extends C5575a<InputStream> {

        /* renamed from: k2.f$e$a */
        /* compiled from: FileLoader */
        class C5581a implements C5579d<InputStream> {
            C5581a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo22135a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo22136b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo22137c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C5580e() {
            super(new C5581a());
        }
    }

    public C5574f(C5579d<Data> dVar) {
        this.f24094a = dVar;
    }

    /* renamed from: c */
    public C5596n.C5597a<Data> mo22113a(File file, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(file), new C5578c(file, this.f24094a));
    }

    /* renamed from: d */
    public boolean mo22114b(File file) {
        return true;
    }
}
