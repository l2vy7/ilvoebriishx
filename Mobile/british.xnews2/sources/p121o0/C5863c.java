package p121o0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: o0.c */
/* compiled from: InputContentInfoCompat */
public final class C5863c {

    /* renamed from: a */
    private final C5866c f24608a;

    /* renamed from: o0.c$b */
    /* compiled from: InputContentInfoCompat */
    private static final class C5865b implements C5866c {

        /* renamed from: a */
        private final Uri f24610a;

        /* renamed from: b */
        private final ClipDescription f24611b;

        /* renamed from: c */
        private final Uri f24612c;

        C5865b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24610a = uri;
            this.f24611b = clipDescription;
            this.f24612c = uri2;
        }
    }

    /* renamed from: o0.c$c */
    /* compiled from: InputContentInfoCompat */
    private interface C5866c {
    }

    public C5863c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f24608a = new C5864a(uri, clipDescription, uri2);
        } else {
            this.f24608a = new C5865b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: a */
    public static C5863c m25857a(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C5863c(new C5864a(obj));
        }
        return null;
    }

    /* renamed from: o0.c$a */
    /* compiled from: InputContentInfoCompat */
    private static final class C5864a implements C5866c {

        /* renamed from: a */
        final InputContentInfo f24609a;

        C5864a(Object obj) {
            this.f24609a = (InputContentInfo) obj;
        }

        C5864a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f24609a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private C5863c(C5866c cVar) {
        this.f24608a = cVar;
    }
}
