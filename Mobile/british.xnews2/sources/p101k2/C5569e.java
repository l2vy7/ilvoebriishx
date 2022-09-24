package p101k2;

import android.util.Base64;
import com.bumptech.glide.C3325f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p064d2.C5154a;
import p064d2.C5163h;
import p070e2.C5208d;
import p101k2.C5596n;
import p183z2.C6445b;

/* renamed from: k2.e */
/* compiled from: DataUrlLoader */
public final class C5569e<Model, Data> implements C5596n<Model, Data> {

    /* renamed from: a */
    private final C5570a<Data> f24088a;

    /* renamed from: k2.e$a */
    /* compiled from: DataUrlLoader */
    public interface C5570a<Data> {
        /* renamed from: a */
        Class<Data> mo22128a();

        /* renamed from: b */
        void mo22129b(Data data) throws IOException;

        /* renamed from: c */
        Data mo22130c(String str) throws IllegalArgumentException;
    }

    /* renamed from: k2.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C5571b<Data> implements C5208d<Data> {

        /* renamed from: b */
        private final String f24089b;

        /* renamed from: c */
        private final C5570a<Data> f24090c;

        /* renamed from: d */
        private Data f24091d;

        C5571b(String str, C5570a<Data> aVar) {
            this.f24089b = str;
            this.f24090c = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo21422a() {
            return this.f24090c.mo22128a();
        }

        /* renamed from: b */
        public void mo21427b() {
            try {
                this.f24090c.mo22129b(this.f24091d);
            } catch (IOException unused) {
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
                Data c = this.f24090c.mo22130c(this.f24089b);
                this.f24091d = c;
                aVar.mo21439f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo21438c(e);
            }
        }
    }

    /* renamed from: k2.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C5572c<Model> implements C5598o<Model, InputStream> {

        /* renamed from: a */
        private final C5570a<InputStream> f24092a = new C5573a();

        /* renamed from: k2.e$c$a */
        /* compiled from: DataUrlLoader */
        class C5573a implements C5570a<InputStream> {
            C5573a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo22128a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo22129b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo22130c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        /* renamed from: a */
        public C5596n<Model, InputStream> mo22118a(C5604r rVar) {
            return new C5569e(this.f24092a);
        }
    }

    public C5569e(C5570a<Data> aVar) {
        this.f24088a = aVar;
    }

    /* renamed from: a */
    public C5596n.C5597a<Data> mo22113a(Model model, int i, int i2, C5163h hVar) {
        return new C5596n.C5597a<>(new C6445b(model), new C5571b(model.toString(), this.f24088a));
    }

    /* renamed from: b */
    public boolean mo22114b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
