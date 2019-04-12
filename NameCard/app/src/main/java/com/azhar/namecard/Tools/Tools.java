package com.azhar.namecard.Tools;

import android.content.Context;

/**
 * Created by Azhar Rivaldi on 09/04/2019.
 */

public class Tools {

    public static int dpToPx(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * scale);
    }
}
