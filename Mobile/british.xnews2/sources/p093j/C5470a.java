package p093j;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: j.a */
/* compiled from: AllCapsTransformationMethod */
public class C5470a implements TransformationMethod {

    /* renamed from: b */
    private Locale f23842b;

    public C5470a(Context context) {
        this.f23842b = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f23842b);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
