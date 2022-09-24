package p128p0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: p0.b */
/* compiled from: CursorFilter */
class C5877b extends Filter {

    /* renamed from: a */
    C5878a f24644a;

    /* renamed from: p0.b$a */
    /* compiled from: CursorFilter */
    interface C5878a {
        /* renamed from: a */
        CharSequence mo2344a(Cursor cursor);

        /* renamed from: b */
        void mo2345b(Cursor cursor);

        /* renamed from: c */
        Cursor mo22810c();

        /* renamed from: d */
        Cursor mo2346d(CharSequence charSequence);
    }

    C5877b(C5878a aVar) {
        this.f24644a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f24644a.mo2344a((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f24644a.mo2346d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
            filterResults.values = d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c = this.f24644a.mo22810c();
        Object obj = filterResults.values;
        if (obj != null && obj != c) {
            this.f24644a.mo2345b((Cursor) obj);
        }
    }
}
