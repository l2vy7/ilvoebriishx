package com.google.firebase.messaging;

import java.util.Locale;

/* renamed from: com.google.firebase.messaging.a */
public final class C10464a extends Exception {

    /* renamed from: b */
    private final int f48971b;

    C10464a(String str) {
        super(str);
        int i = 4;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.hashCode();
            char c = 65535;
            switch (lowerCase.hashCode()) {
                case -1743242157:
                    if (lowerCase.equals("service_not_available")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1290953729:
                    if (lowerCase.equals("toomanymessages")) {
                        c = 1;
                        break;
                    }
                    break;
                case -920906446:
                    if (lowerCase.equals("invalid_parameters")) {
                        c = 2;
                        break;
                    }
                    break;
                case -617027085:
                    if (lowerCase.equals("messagetoobig")) {
                        c = 3;
                        break;
                    }
                    break;
                case -95047692:
                    if (lowerCase.equals("missing_to")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 3;
                    break;
                case 1:
                    break;
                case 2:
                case 4:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
            }
        }
        i = 0;
        this.f48971b = i;
    }
}
