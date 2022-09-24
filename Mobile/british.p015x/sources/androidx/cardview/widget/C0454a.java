package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0462g;

/* renamed from: androidx.cardview.widget.a */
/* compiled from: CardViewApi17Impl */
class C0454a extends C0457c {

    /* renamed from: androidx.cardview.widget.a$a */
    /* compiled from: CardViewApi17Impl */
    class C0455a implements C0462g.C0463a {
        C0455a() {
        }

        /* renamed from: a */
        public void mo2433a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0454a() {
    }

    /* renamed from: j */
    public void mo2432j() {
        C0462g.f1803r = new C0455a();
    }
}
