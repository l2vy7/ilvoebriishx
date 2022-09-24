package p128p0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: p0.c */
/* compiled from: ResourceCursorAdapter */
public abstract class C5879c extends C5874a {

    /* renamed from: k */
    private int f24645k;

    /* renamed from: l */
    private int f24646l;

    /* renamed from: m */
    private LayoutInflater f24647m;

    @Deprecated
    public C5879c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f24646l = i;
        this.f24645k = i;
        this.f24647m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: g */
    public View mo22812g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f24647m.inflate(this.f24646l, viewGroup, false);
    }

    /* renamed from: h */
    public View mo2350h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f24647m.inflate(this.f24645k, viewGroup, false);
    }

    public C5879c(Context context, int i, Cursor cursor, int i2) {
        super(context, cursor, i2);
        this.f24646l = i;
        this.f24645k = i;
        this.f24647m = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
