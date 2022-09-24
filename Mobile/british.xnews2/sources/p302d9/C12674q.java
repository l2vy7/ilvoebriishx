package p302d9;

import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: d9.q */
/* compiled from: DateUtils */
public final class C12674q {

    /* renamed from: a */
    private static final String[] f55313a = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE, dd MMM yyyy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: b */
    private static final Date f55314b;

    /* renamed from: c */
    public static final TimeZone f55315c;

    /* renamed from: d9.q$a */
    /* compiled from: DateUtils */
    static final class C12675a {

        /* renamed from: a */
        private static final ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> f55316a = new C12676a();

        /* renamed from: d9.q$a$a */
        /* compiled from: DateUtils */
        static class C12676a extends ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> {
            C12676a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public SoftReference<Map<String, SimpleDateFormat>> initialValue() {
                return new SoftReference<>(new HashMap());
            }
        }

        /* renamed from: a */
        public static SimpleDateFormat m53949a(String str) {
            ThreadLocal<SoftReference<Map<String, SimpleDateFormat>>> threadLocal = f55316a;
            Map map = (Map) threadLocal.get().get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(new SoftReference(map));
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) map.get(str);
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str, Locale.US);
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            map.put(str, simpleDateFormat2);
            return simpleDateFormat2;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        f55315c = timeZone;
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(timeZone);
        instance.set(2000, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        f55314b = instance.getTime();
    }

    /* renamed from: a */
    public static Date m53947a(String str, String[] strArr) throws C12673p {
        return m53948b(str, strArr, (Date) null);
    }

    /* renamed from: b */
    public static Date m53948b(String str, String[] strArr, Date date) throws C12673p {
        if (str != null) {
            if (strArr == null) {
                strArr = f55313a;
            }
            if (date == null) {
                date = f55314b;
            }
            if (str.length() > 1 && str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1);
            }
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                SimpleDateFormat a = C12675a.m53949a(strArr[i]);
                a.set2DigitYearStart(date);
                try {
                    return a.parse(str);
                } catch (ParseException unused) {
                    i++;
                }
            }
            throw new C12673p("Unable to parse the date " + str);
        }
        throw new IllegalArgumentException("dateValue is null");
    }
}
