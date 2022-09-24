package p128p0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import p128p0.C5877b;

/* renamed from: p0.a */
/* compiled from: CursorAdapter */
public abstract class C5874a extends BaseAdapter implements Filterable, C5877b.C5878a {

    /* renamed from: b */
    protected boolean f24633b;

    /* renamed from: c */
    protected boolean f24634c;

    /* renamed from: d */
    protected Cursor f24635d;

    /* renamed from: e */
    protected Context f24636e;

    /* renamed from: f */
    protected int f24637f;

    /* renamed from: g */
    protected C5875a f24638g;

    /* renamed from: h */
    protected DataSetObserver f24639h;

    /* renamed from: i */
    protected C5877b f24640i;

    /* renamed from: j */
    protected FilterQueryProvider f24641j;

    /* renamed from: p0.a$a */
    /* compiled from: CursorAdapter */
    private class C5875a extends ContentObserver {
        C5875a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C5874a.this.mo22817i();
        }
    }

    /* renamed from: p0.a$b */
    /* compiled from: CursorAdapter */
    private class C5876b extends DataSetObserver {
        C5876b() {
        }

        public void onChanged() {
            C5874a aVar = C5874a.this;
            aVar.f24633b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C5874a aVar = C5874a.this;
            aVar.f24633b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public C5874a(Context context, Cursor cursor, boolean z) {
        mo22811f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public CharSequence mo2344a(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    /* renamed from: b */
    public void mo2345b(Cursor cursor) {
        Cursor j = mo22818j(cursor);
        if (j != null) {
            j.close();
        }
    }

    /* renamed from: c */
    public Cursor mo22810c() {
        return this.f24635d;
    }

    /* renamed from: d */
    public Cursor mo2346d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f24641j;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f24635d;
    }

    /* renamed from: e */
    public abstract void mo2347e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo22811f(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f24634c = true;
        } else {
            this.f24634c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f24635d = cursor;
        this.f24633b = z;
        this.f24636e = context;
        this.f24637f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f24638g = new C5875a();
            this.f24639h = new C5876b();
        } else {
            this.f24638g = null;
            this.f24639h = null;
        }
        if (z) {
            C5875a aVar = this.f24638g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f24639h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo22812g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f24633b || (cursor = this.f24635d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f24633b) {
            return null;
        }
        this.f24635d.moveToPosition(i);
        if (view == null) {
            view = mo22812g(this.f24636e, this.f24635d, viewGroup);
        }
        mo2347e(view, this.f24636e, this.f24635d);
        return view;
    }

    public Filter getFilter() {
        if (this.f24640i == null) {
            this.f24640i = new C5877b(this);
        }
        return this.f24640i;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f24633b || (cursor = this.f24635d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f24635d;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f24633b || (cursor = this.f24635d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f24635d.getLong(this.f24637f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f24633b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f24635d.moveToPosition(i)) {
            if (view == null) {
                view = mo2350h(this.f24636e, this.f24635d, viewGroup);
            }
            mo2347e(view, this.f24636e, this.f24635d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public abstract View mo2350h(Context context, Cursor cursor, ViewGroup viewGroup);

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo22817i() {
        Cursor cursor;
        if (this.f24634c && (cursor = this.f24635d) != null && !cursor.isClosed()) {
            this.f24633b = this.f24635d.requery();
        }
    }

    /* renamed from: j */
    public Cursor mo22818j(Cursor cursor) {
        Cursor cursor2 = this.f24635d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C5875a aVar = this.f24638g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f24639h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f24635d = cursor;
        if (cursor != null) {
            C5875a aVar2 = this.f24638g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f24639h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f24637f = cursor.getColumnIndexOrThrow("_id");
            this.f24633b = true;
            notifyDataSetChanged();
        } else {
            this.f24637f = -1;
            this.f24633b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public C5874a(Context context, Cursor cursor, int i) {
        mo22811f(context, cursor, i);
    }
}
