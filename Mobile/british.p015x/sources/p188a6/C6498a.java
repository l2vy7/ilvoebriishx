package p188a6;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.C9565l6;
import com.google.android.gms.internal.vision.zzk;
import com.google.android.gms.internal.vision.zzu;
import com.google.android.gms.vision.barcode.Barcode;
import p187z5.C11145b;
import p187z5.C6471c;

/* renamed from: a6.a */
/* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
public final class C6498a extends C11145b<Barcode> {

    /* renamed from: c */
    private final C9565l6 f26578c;

    /* renamed from: a6.a$a */
    /* compiled from: com.google.android.gms:play-services-vision@@20.1.2 */
    public static class C6499a {

        /* renamed from: a */
        private Context f26579a;

        /* renamed from: b */
        private zzk f26580b = new zzk();

        public C6499a(Context context) {
            this.f26579a = context;
        }

        /* renamed from: a */
        public C6498a mo24325a() {
            return new C6498a(new C9565l6(this.f26579a, this.f26580b));
        }

        /* renamed from: b */
        public C6499a mo24326b(int i) {
            this.f26580b.f46050b = i;
            return this;
        }
    }

    private C6498a(C9565l6 l6Var) {
        this.f26578c = l6Var;
    }

    /* renamed from: a */
    public final SparseArray<Barcode> mo24322a(C6471c cVar) {
        Barcode[] barcodeArr;
        if (cVar != null) {
            zzu C0 = zzu.m44925C0(cVar);
            if (cVar.mo24303a() != null) {
                barcodeArr = this.f26578c.mo38491f(cVar.mo24303a(), C0);
                if (barcodeArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                barcodeArr = this.f26578c.mo38492g(cVar.mo24304b(), C0);
            }
            SparseArray<Barcode> sparseArray = new SparseArray<>(barcodeArr.length);
            for (Barcode barcode : barcodeArr) {
                sparseArray.append(barcode.f47013c.hashCode(), barcode);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }

    /* renamed from: b */
    public final boolean mo24323b() {
        return this.f26578c.mo38549a();
    }

    /* renamed from: d */
    public final void mo24324d() {
        super.mo24324d();
        this.f26578c.mo38550d();
    }
}
