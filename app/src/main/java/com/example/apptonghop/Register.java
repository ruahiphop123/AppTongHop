package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Register extends AppCompatActivity {
    CheckBox cb;
    Button btRegis,btBackToLogin;
    EditText usernew, passnew, passconf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        btRegis = (Button) findViewById(R.id.btnRegister);
        cb = (CheckBox) findViewById(R.id.checkBox);
        btBackToLogin = (Button) findViewById(R.id.btBackToLogin);

        usernew = (EditText) findViewById(R.id.txtUserRegis);
        passnew = (EditText) findViewById(R.id.txtPassRegis);
        passconf = (EditText) findViewById(R.id.txtPassConf);

        btRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.isChecked() == true)
                {
                    if(passnew.getText().toString().equals(passconf.getText().toString())){
                        Intent mhLogin = new Intent();
                        Bundle bundle = new Bundle();
                        Account accnew = new Account();
                        accnew.setTaiKhoan(usernew.getText().toString());
                        accnew.setMatKhau(passnew.getText().toString());
                        bundle.putSerializable("accnew",accnew);
                        mhLogin.putExtra("bundle",bundle);
                        setResult(RESULT_OK,mhLogin);
                        finish();
                    }
                }
                else{
                    Toast.makeText(Register.this, "You must agree the rules", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });
    }
}