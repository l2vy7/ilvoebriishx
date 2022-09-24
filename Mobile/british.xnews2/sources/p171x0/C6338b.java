package p171x0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.C0599a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import p089i0.C5421b;
import p089i0.C5432j;
import p171x0.C6339c;

/* renamed from: x0.b */
/* compiled from: CursorLoader */
public class C6338b extends C6336a<Cursor> {

    /* renamed from: p */
    final C6339c<Cursor>.a f26162p = new C6339c.C6340a();

    /* renamed from: q */
    Uri f26163q;

    /* renamed from: r */
    String[] f26164r;

    /* renamed from: s */
    String f26165s;

    /* renamed from: t */
    String[] f26166t;

    /* renamed from: u */
    String f26167u;

    /* renamed from: v */
    Cursor f26168v;

    /* renamed from: w */
    C5421b f26169w;

    public C6338b(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.f26163q = uri;
        this.f26164r = strArr;
        this.f26165s = str;
        this.f26166t = strArr2;
        this.f26167u = str2;
    }

    /* renamed from: B */
    public void mo24116B() {
        super.mo24116B();
        synchronized (this) {
            C5421b bVar = this.f26169w;
            if (bVar != null) {
                bVar.mo21871a();
            }
        }
    }

    /* renamed from: J */
    public void mo24135g(Cursor cursor) {
        if (!mo24148l()) {
            Cursor cursor2 = this.f26168v;
            this.f26168v = cursor;
            if (mo24149m()) {
                super.mo24135g(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: K */
    public Cursor mo24121G() {
        Cursor a;
        synchronized (this) {
            if (!mo24120F()) {
                this.f26169w = new C5421b();
            } else {
                throw new C5432j();
            }
        }
        try {
            a = C0599a.m3288a(mo24146j().getContentResolver(), this.f26163q, this.f26164r, this.f26165s, this.f26166t, this.f26167u, this.f26169w);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f26162p);
            }
            synchronized (this) {
                this.f26169w = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f26169w = null;
                throw th;
            }
        }
    }

    /* renamed from: L */
    public void mo24122H(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo24124h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo24124h(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f26163q);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f26164r));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f26165s);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f26166t));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f26167u);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f26168v);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f26177h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo24136r() {
        super.mo24136r();
        mo24138t();
        Cursor cursor = this.f26168v;
        if (cursor != null && !cursor.isClosed()) {
            this.f26168v.close();
        }
        this.f26168v = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo24137s() {
        Cursor cursor = this.f26168v;
        if (cursor != null) {
            mo24135g(cursor);
        }
        if (mo24158z() || this.f26168v == null) {
            mo24145i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo24138t() {
        mo24141c();
    }
}
