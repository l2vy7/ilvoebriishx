package p127p0;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: p0.d */
/* compiled from: SimpleCursorAdapter */
public class C5880d extends C5879c {

    /* renamed from: n */
    protected int[] f24648n;

    /* renamed from: o */
    protected int[] f24649o;

    /* renamed from: p */
    private int f24650p = -1;

    /* renamed from: q */
    private C5881a f24651q;

    /* renamed from: r */
    private C5882b f24652r;

    /* renamed from: s */
    String[] f24653s;

    /* renamed from: p0.d$a */
    /* compiled from: SimpleCursorAdapter */
    public interface C5881a {
        /* renamed from: a */
        CharSequence mo22829a(Cursor cursor);
    }

    /* renamed from: p0.d$b */
    /* compiled from: SimpleCursorAdapter */
    public interface C5882b {
        /* renamed from: a */
        boolean mo8201a(View view, Cursor cursor, int i);
    }

    public C5880d(Context context, int i, Cursor cursor, String[] strArr, int[] iArr, int i2) {
        super(context, i, cursor, i2);
        this.f24649o = iArr;
        this.f24653s = strArr;
        m25943k(cursor, strArr);
    }

    /* renamed from: k */
    private void m25943k(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f24648n;
            if (iArr == null || iArr.length != length) {
                this.f24648n = new int[length];
            }
            for (int i = 0; i < length; i++) {
                this.f24648n[i] = cursor.getColumnIndexOrThrow(strArr[i]);
            }
            return;
        }
        this.f24648n = null;
    }

    /* renamed from: a */
    public CharSequence mo2344a(Cursor cursor) {
        C5881a aVar = this.f24651q;
        if (aVar != null) {
            return aVar.mo22829a(cursor);
        }
        int i = this.f24650p;
        if (i > -1) {
            return cursor.getString(i);
        }
        return super.mo2344a(cursor);
    }

    /* renamed from: e */
    public void mo2347e(View view, Context context, Cursor cursor) {
        C5882b bVar = this.f24652r;
        int[] iArr = this.f24649o;
        int length = iArr.length;
        int[] iArr2 = this.f24648n;
        for (int i = 0; i < length; i++) {
            View findViewById = view.findViewById(iArr[i]);
            if (findViewById != null) {
                if (bVar != null ? bVar.mo8201a(findViewById, cursor, iArr2[i]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        mo22828n((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        mo22827m((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public Cursor mo22818j(Cursor cursor) {
        m25943k(cursor, this.f24653s);
        return super.mo22818j(cursor);
    }

    /* renamed from: l */
    public void mo22826l(C5882b bVar) {
        this.f24652r = bVar;
    }

    /* renamed from: m */
    public void mo22827m(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    /* renamed from: n */
    public void mo22828n(TextView textView, String str) {
        textView.setText(str);
    }
}
