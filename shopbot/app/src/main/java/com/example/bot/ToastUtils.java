package com.example.bot;





import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    public static void toastMessage(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

}
