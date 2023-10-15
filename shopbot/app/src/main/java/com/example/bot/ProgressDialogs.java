package com.example.bot;




import android.app.ProgressDialog;
import android.content.Context;

public class ProgressDialogs {

    public static ProgressDialog dialog;

    public static void showDialog(Context context) {
        dialog = new ProgressDialog(context);

        dialog.setTitle("ff");

        dialog.setMessage("cf");

        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        dialog.setCancelable(false);

        dialog.setCanceledOnTouchOutside(false);

        dialog.show();
    }

    public static void dismissDialog(){
        dialog.dismiss();
    }

}
