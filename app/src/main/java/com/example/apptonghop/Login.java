package com.example.apptonghop;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Login extends AppCompatActivity {

    Button btLogin;
    TextView tvToRegis;
    List<Account> admin;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        admin = new ArrayList<>();
        admin.add(new Account("ntd","123"));
        admin.add(new Account("1","1"));

        user = (EditText) findViewById(R.id.inputUsername);
        pass = (EditText) findViewById(R.id.inputPassword);

//        Intent intent = getIntent();
//        if(intent != null) {
//            Account newAcc = (Account) intent.getSerializableExtra("newAccount");
//            admin.add(newAcc);
//        }

        btLogin = (Button) findViewById(R.id.btnLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkPass()){
                    Intent mhHome = new Intent(Login.this, Home.class);
                    startActivity(mhHome);
                }
                else{
                    Toast.makeText(Login.this, "Sai tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvToRegis = (TextView) findViewById(R.id.tvToRegis);
        tvToRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhRegis = new Intent(Login.this,Register.class);
                getResult.launch(mhRegis);
            }
        });
    }
    public boolean checkPass(){
        boolean check = false;
        for (Account x : admin)
        {
            String userCheck = x.getTaiKhoan();
            String passCheck = x.getMatKhau();
            if (userCheck.equals(user.getText().toString()) && passCheck.equals(pass.getText().toString())){
                check = true;
                break;
            }
        }
        return check;
    }
    private ActivityResultLauncher<Intent> getResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK){
                        Intent data = result.getData();
                        Bundle dataBundle = data.getBundleExtra("bundle");
                        Account newacc = (Account) dataBundle.getSerializable("accnew");
                        admin.add(newacc);
                        user.setText(newacc.getTaiKhoan());
                        pass.setText(newacc.getMatKhau());
                    }
                    if (result.getResultCode() == Activity.RESULT_CANCELED){
                        Toast.makeText(Login.this,"Bạn chưa tạo tài khoản",Toast.LENGTH_SHORT).show();
                    }
                }
            }
    );
}