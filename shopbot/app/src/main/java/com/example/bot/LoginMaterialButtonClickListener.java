package com.example.bot;


import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginMaterialButtonClickListener implements View.OnClickListener {

    private Context context;
    private String email;
    private String password;
    private FirebaseAuth auth;
    private Activity activity;
    private OnCompleteListener<AuthResult> _auth_sign_in_listener;


    public LoginMaterialButtonClickListener(Context context, EditText email, EditText password, FirebaseAuth auth, OnCompleteListener<AuthResult> _auth_sign_in_listener, Activity activity){
        this.context = context;
        this.email = email.getText().toString();
        this.password = password.getText().toString();
        this.auth = auth;
        this._auth_sign_in_listener = _auth_sign_in_listener;
        this.activity = activity;
    }
    @Override
    public void onClick(View p1) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
            if(email != null && !email.isEmpty()){

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
                    if(password != null && !password.isEmpty()){
                        ProgressDialogs.showDialog(context);
                        signIn();
                    }else{
                        ToastUtils.toastMessage(context, "Password can't be empty");
                    }
                }
            }else{
                ToastUtils.toastMessage(context, "Email can't be empty");
            }
        }
    }

    private void signIn(){
        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(activity, _auth_sign_in_listener);
    }


}
