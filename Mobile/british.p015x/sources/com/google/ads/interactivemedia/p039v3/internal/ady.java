package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ady */
/* compiled from: IMASDK */
final class ady implements akk<Long> {

    /* renamed from: a */
    private static final Pattern f14348a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    ady() {
    }

    /* renamed from: b */
    public static final Long m13251b(InputStream inputStream) throws IOException {
        String str;
        String readLine = new BufferedReader(new InputStreamReader(inputStream, arm.f15614b)).readLine();
        try {
            Matcher matcher = f14348a.matcher(readLine);
            if (!matcher.matches()) {
                String valueOf = String.valueOf(readLine);
                if (valueOf.length() != 0) {
                    str = "Couldn't parse timestamp: ".concat(valueOf);
                } else {
                    str = new String("Couldn't parse timestamp: ");
                }
                throw new C4144lb(str);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = true != "+".equals(matcher.group(4)) ? -1 : 1;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= j * (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw new C4144lb((Throwable) e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo13517a(Uri uri, InputStream inputStream) throws IOException {
        return m13251b(inputStream);
    }
}
