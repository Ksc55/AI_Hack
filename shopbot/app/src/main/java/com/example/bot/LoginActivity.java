package com.example.bot;







import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class LoginActivity extends AppCompatActivity {

    private ScrollView vscroll1;
    private LinearLayout linear1;
    private ImageView imageview1;
    private EditText edittext1;
    private EditText edittext2;
    private MaterialButton materialbutton1;
    private TextView textview1;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.login);
        initialize(_savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle _savedInstanceState) {
        vscroll1 = findViewById(R.id.vscroll1);
        linear1 = findViewById(R.id.linear1);
        imageview1 = findViewById(R.id.imageview1);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);
        materialbutton1 = findViewById(R.id.materialbutton1);
        textview1 = findViewById(R.id.textview1);
    }

    private void initializeLogic() {
    }

}
