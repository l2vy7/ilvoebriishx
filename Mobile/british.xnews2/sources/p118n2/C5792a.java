package p118n2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import p004a3.C0065j;
import p064d2.C5163h;
import p064d2.C5165j;
import p081g2.C5323v;

/* renamed from: n2.a */
/* compiled from: BitmapDrawableDecoder */
public class C5792a<DataType> implements C5165j<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final C5165j<DataType, Bitmap> f24504a;

    /* renamed from: b */
    private final Resources f24505b;

    public C5792a(Resources resources, C5165j<DataType, Bitmap> jVar) {
        this.f24505b = (Resources) C0065j.m247d(resources);
        this.f24504a = (C5165j) C0065j.m247d(jVar);
    }

    /* renamed from: a */
    public boolean mo21344a(DataType datatype, C5163h hVar) throws IOException {
        return this.f24504a.mo21344a(datatype, hVar);
    }

    /* renamed from: b */
    public C5323v<BitmapDrawable> mo21345b(DataType datatype, int i, int i2, C5163h hVar) throws IOException {
        return C5844u.m25817e(this.f24505b, this.f24504a.mo21345b(datatype, i, i2, hVar));
    }
}
