package p241p4;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.core.content.C0600b;
import p016c0.C2617a;
import p062d0.C5135a;
import p243q4.C10922b;

/* renamed from: p4.e */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C10867e {

    /* renamed from: a */
    private static final C10922b f49656a = new C10922b("WidgetUtil");

    @TargetApi(17)
    /* renamed from: a */
    public static Bitmap m48883a(Context context, Bitmap bitmap, float f, float f2) {
        C10922b bVar = f49656a;
        bVar.mo43190a("Begin blurring bitmap %s, original width = %d, original height = %d.", bitmap, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * 0.25f);
        int round2 = Math.round(((float) bitmap.getHeight()) * 0.25f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        Bitmap createBitmap = Bitmap.createBitmap(round, round2, createScaledBitmap.getConfig());
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, createFromBitmap.getElement());
        create2.setInput(createFromBitmap);
        create2.setRadius(7.5f);
        create2.forEach(createTyped);
        createTyped.copyTo(createBitmap);
        create.destroy();
        bVar.mo43190a("End blurring bitmap %s, original width = %d, original height = %d.", createScaledBitmap, Integer.valueOf(round), Integer.valueOf(round2));
        return createBitmap;
    }

    /* renamed from: b */
    public static Drawable m48884b(Context context, int i, int i2) {
        return m48885c(context, i, i2, 0, 17170443);
    }

    /* renamed from: c */
    private static Drawable m48885c(Context context, int i, int i2, int i3, int i4) {
        ColorStateList colorStateList;
        int i5;
        Drawable r = C5135a.m23418r(context.getResources().getDrawable(i2).mutate());
        C5135a.m23416p(r, PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = C0600b.m3293e(context, i);
        } else {
            if (i3 != 0) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i3});
                i5 = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
            } else {
                i5 = C0600b.m3292d(context, i4);
            }
            int[] iArr = {i5, C2617a.m9119m(i5, 128)};
            colorStateList = new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, iArr);
        }
        C5135a.m23415o(r, colorStateList);
        return r;
    }
}
