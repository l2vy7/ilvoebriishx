package p071e2;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import p071e2.C5210e;

/* renamed from: e2.m */
/* compiled from: ParcelFileDescriptorRewinder */
public final class C5224m implements C5210e<ParcelFileDescriptor> {

    /* renamed from: a */
    private final C5226b f22744a;

    /* renamed from: e2.m$a */
    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class C5225a implements C5210e.C5211a<ParcelFileDescriptor> {
        /* renamed from: a */
        public Class<ParcelFileDescriptor> mo21442a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: c */
        public C5210e<ParcelFileDescriptor> mo21443b(ParcelFileDescriptor parcelFileDescriptor) {
            return new C5224m(parcelFileDescriptor);
        }
    }

    /* renamed from: e2.m$b */
    /* compiled from: ParcelFileDescriptorRewinder */
    private static final class C5226b {

        /* renamed from: a */
        private final ParcelFileDescriptor f22745a;

        C5226b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f22745a = parcelFileDescriptor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public ParcelFileDescriptor mo21462a() throws IOException {
            try {
                Os.lseek(this.f22745a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f22745a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    public C5224m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f22744a = new C5226b(parcelFileDescriptor);
    }

    /* renamed from: c */
    public static boolean m23696c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo21441b() {
    }

    /* renamed from: d */
    public ParcelFileDescriptor mo21440a() throws IOException {
        return this.f22744a.mo21462a();
    }
}
