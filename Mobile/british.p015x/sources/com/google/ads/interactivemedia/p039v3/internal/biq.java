package com.google.ads.interactivemedia.p039v3.internal;

import java.util.TimeZone;

/* renamed from: com.google.ads.interactivemedia.v3.internal.biq */
/* compiled from: IMASDK */
public final class biq {

    /* renamed from: a */
    private static final TimeZone f16426a = TimeZone.getTimeZone("UTC");

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01d6 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01de }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m15929a(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            r1 = r17
            r2 = r18
            r3 = 2
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r4 = r0 + 4
            int r0 = m15931c(r1, r0, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r5 = 45
            boolean r6 = m15930b(r1, r4, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r6 == 0) goto L_0x0019
            int r4 = r4 + 1
        L_0x0019:
            int r6 = r4 + 2
            int r4 = m15931c(r1, r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            boolean r7 = m15930b(r1, r6, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r7 == 0) goto L_0x0027
            int r6 = r6 + 1
        L_0x0027:
            int r7 = r6 + 2
            int r6 = m15931c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r8 = 84
            boolean r8 = m15930b(r1, r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r8 != 0) goto L_0x004a
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r9 > r7) goto L_0x004a
            java.util.GregorianCalendar r5 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r4 = r4 + -1
            r5.<init>(r0, r4, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r2.setIndex(r7)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.util.Date r0 = r5.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            return r0
        L_0x004a:
            r9 = 43
            r10 = 90
            r11 = 1
            if (r8 == 0) goto L_0x00d9
            int r7 = r7 + 1
            int r8 = r7 + 2
            int r7 = m15931c(r1, r7, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r13 = 58
            boolean r14 = m15930b(r1, r8, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r14 == 0) goto L_0x0063
            int r8 = r8 + 1
        L_0x0063:
            int r14 = r8 + 2
            int r8 = m15931c(r1, r8, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            boolean r13 = m15930b(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r13 == 0) goto L_0x0071
            int r14 = r14 + 1
        L_0x0071:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r13 <= r14) goto L_0x00d6
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r13 == r10) goto L_0x00d6
            if (r13 == r9) goto L_0x00d6
            if (r13 == r5) goto L_0x00d6
            int r13 = r14 + 2
            int r14 = m15931c(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r15 = 59
            if (r14 <= r15) goto L_0x0091
            r15 = 63
            if (r14 >= r15) goto L_0x0091
            r14 = 59
        L_0x0091:
            r15 = 46
            boolean r15 = m15930b(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r15 == 0) goto L_0x00d2
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x009d:
            int r12 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r15 >= r12) goto L_0x00b5
            char r12 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r5 = 48
            if (r12 < r5) goto L_0x00ba
            r5 = 57
            if (r12 <= r5) goto L_0x00b0
            goto L_0x00ba
        L_0x00b0:
            int r15 = r15 + 1
            r5 = 45
            goto L_0x009d
        L_0x00b5:
            int r5 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r15 = r5
        L_0x00ba:
            int r5 = r13 + 3
            int r5 = java.lang.Math.min(r15, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r12 = m15931c(r1, r13, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r5 = r5 - r13
            if (r5 == r11) goto L_0x00cd
            if (r5 == r3) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r12 = r12 * 10
            goto L_0x00cf
        L_0x00cd:
            int r12 = r12 * 100
        L_0x00cf:
            r5 = r7
            r7 = r15
            goto L_0x00dd
        L_0x00d2:
            r5 = r7
            r7 = r13
            r12 = 0
            goto L_0x00dd
        L_0x00d6:
            r5 = r7
            r7 = r14
            goto L_0x00db
        L_0x00d9:
            r5 = 0
            r8 = 0
        L_0x00db:
            r12 = 0
            r14 = 0
        L_0x00dd:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r13 <= r7) goto L_0x01d6
            char r13 = r1.charAt(r7)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r15 = 5
            if (r13 != r10) goto L_0x00ef
            java.util.TimeZone r9 = f16426a     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r7 = r7 + r11
            goto L_0x01a4
        L_0x00ef:
            if (r13 == r9) goto L_0x0114
            r9 = 45
            if (r13 != r9) goto L_0x00f6
            goto L_0x0114
        L_0x00f6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r5 = 31
            r4.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r5 = "Invalid time zone indicator '"
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r4.append(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r5 = "'"
            r4.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r4 = r4.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
        L_0x0114:
            java.lang.String r9 = r1.substring(r7)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r10 >= r15) goto L_0x0124
            java.lang.String r10 = "00"
            java.lang.String r9 = r9.concat(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
        L_0x0124:
            int r10 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r7 = r7 + r10
            java.lang.String r10 = "+0000"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r10 != 0) goto L_0x01a1
            java.lang.String r10 = "+00:00"
            boolean r10 = r10.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r10 == 0) goto L_0x013a
            goto L_0x01a1
        L_0x013a:
            java.lang.String r10 = "GMT"
            int r13 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r13 == 0) goto L_0x0147
            java.lang.String r9 = r10.concat(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            goto L_0x014c
        L_0x0147:
            java.lang.String r9 = new java.lang.String     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r9.<init>(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
        L_0x014c:
            java.util.TimeZone r10 = java.util.TimeZone.getTimeZone(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r13 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            boolean r16 = r13.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r16 != 0) goto L_0x019f
            java.lang.String r15 = ":"
            java.lang.String r3 = ""
            java.lang.String r3 = r13.replace(r15, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            boolean r3 = r3.equals(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            if (r3 == 0) goto L_0x0169
            goto L_0x019f
        L_0x0169:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r3 = r10.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r4 = java.lang.String.valueOf(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r4 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r4 = r4 + 53
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r5 = r5.length()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r5.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r4 = "Mismatching time zone indicator: "
            r5.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r5.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r4 = " given, resolves to "
            r5.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r5.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r3 = r5.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
        L_0x019f:
            r9 = r10
            goto L_0x01a4
        L_0x01a1:
            java.util.TimeZone r3 = f16426a     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r9 = r3
        L_0x01a4:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r3.<init>(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r9 = 0
            r3.setLenient(r9)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r3.set(r11, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            int r4 = r4 + -1
            r9 = 2
            r3.set(r9, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0 = 5
            r3.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0 = 11
            r3.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0 = 12
            r3.set(r0, r8)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0 = 13
            r3.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r0 = 14
            r3.set(r0, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            r2.setIndex(r7)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.util.Date r0 = r3.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            return r0
        L_0x01d6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01e2, NumberFormatException -> 0x01e0, IllegalArgumentException -> 0x01de }
        L_0x01de:
            r0 = move-exception
            goto L_0x01e3
        L_0x01e0:
            r0 = move-exception
            goto L_0x01e3
        L_0x01e2:
            r0 = move-exception
        L_0x01e3:
            if (r1 != 0) goto L_0x01e7
            r1 = 0
            goto L_0x0201
        L_0x01e7:
            int r3 = r17.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 2
            int r3 = r3 + r5
            r4.<init>(r3)
            r3 = 34
            r4.append(r3)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
        L_0x0201:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x020d
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0231
        L_0x020d:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 2
            int r4 = r4 + r6
            r5.<init>(r4)
            java.lang.String r4 = "("
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x0231:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r5 = r5 + 25
            int r5 = r5 + r6
            r7.<init>(r5)
            java.lang.String r5 = "Failed to parse date ["
            r7.append(r5)
            r7.append(r1)
            java.lang.String r1 = "]: "
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = r7.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            goto L_0x026b
        L_0x026a:
            throw r4
        L_0x026b:
            goto L_0x026a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.biq.m15929a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    /* renamed from: b */
    private static boolean m15930b(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    /* renamed from: c */
    private static int m15931c(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        String str2;
        String str3;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                String valueOf = String.valueOf(str.substring(i, i2));
                if (valueOf.length() != 0) {
                    str3 = "Invalid number: ".concat(valueOf);
                } else {
                    str3 = new String("Invalid number: ");
                }
                throw new NumberFormatException(str3);
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                String valueOf2 = String.valueOf(str.substring(i, i2));
                if (valueOf2.length() != 0) {
                    str2 = "Invalid number: ".concat(valueOf2);
                } else {
                    str2 = new String("Invalid number: ");
                }
                throw new NumberFormatException(str2);
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}
