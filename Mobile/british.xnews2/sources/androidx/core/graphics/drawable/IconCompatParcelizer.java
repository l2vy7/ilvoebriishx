package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C1366a;

public class IconCompatParcelizer {
    public static IconCompat read(C1366a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3167a = aVar.mo6576p(iconCompat.f3167a, 1);
        iconCompat.f3169c = aVar.mo6570j(iconCompat.f3169c, 2);
        iconCompat.f3170d = aVar.mo6578r(iconCompat.f3170d, 3);
        iconCompat.f3171e = aVar.mo6576p(iconCompat.f3171e, 4);
        iconCompat.f3172f = aVar.mo6576p(iconCompat.f3172f, 5);
        iconCompat.f3173g = (ColorStateList) aVar.mo6578r(iconCompat.f3173g, 6);
        iconCompat.f3175i = aVar.mo6580t(iconCompat.f3175i, 7);
        iconCompat.f3176j = aVar.mo6580t(iconCompat.f3176j, 8);
        iconCompat.mo3118s();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1366a aVar) {
        aVar.mo6584x(true, true);
        iconCompat.mo3119t(aVar.mo6566f());
        int i = iconCompat.f3167a;
        if (-1 != i) {
            aVar.mo6556F(i, 1);
        }
        byte[] bArr = iconCompat.f3169c;
        if (bArr != null) {
            aVar.mo6552B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3170d;
        if (parcelable != null) {
            aVar.mo6558H(parcelable, 3);
        }
        int i2 = iconCompat.f3171e;
        if (i2 != 0) {
            aVar.mo6556F(i2, 4);
        }
        int i3 = iconCompat.f3172f;
        if (i3 != 0) {
            aVar.mo6556F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3173g;
        if (colorStateList != null) {
            aVar.mo6558H(colorStateList, 6);
        }
        String str = iconCompat.f3175i;
        if (str != null) {
            aVar.mo6560J(str, 7);
        }
        String str2 = iconCompat.f3176j;
        if (str2 != null) {
            aVar.mo6560J(str2, 8);
        }
    }
}
