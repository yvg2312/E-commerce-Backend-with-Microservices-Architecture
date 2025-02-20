package com.hoangtien2k3.commonlib.utils;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

public class MessagesUtils {
    private static final ResourceBundle messageBundle = ResourceBundle.getBundle("messages.messages",
        Locale.getDefault());

    private MessagesUtils() {
        //Add constructor
    }

    public static String getMessage(String errorCode, Object... var2) {
        String message;
        try {
            message = messageBundle.getString(errorCode);
        } catch (MissingResourceException ex) {
            // case message_code is not defined.
            message = errorCode;
        }
        FormattingTuple formattingTuple = MessageFormatter.arrayFormat(message, var2);
        return formattingTuple.getMessage();
    }
}
