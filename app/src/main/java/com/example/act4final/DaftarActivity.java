package com.example.act4final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {


    //Deklarasi Variabel dengan tipe data EditText
    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    //Deklarasi variabel dengan tipe data Floating Action Button
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama = findViewById(R.id.edNama);
        edtAlamat = findViewById(R.id.edAlamat);
        edtEmail = findViewById(R.id.EdEmail);
        edtPassword = findViewById(R.id.edPass);
        edtrepass = findViewById(R.id.edrepas);
        fab = findViewById(R.id.floatingActionButton2);


        //Membuat method untuk event dari floating button
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Membuat kondisi untuk mengecek apakah EditText kosong atau tidak
                if (edtNama.getText().toString().isEmpty()||
                        edtAlamat.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPassword.getText().toString().isEmpty()||
                        edtrepass.getText().toString().isEmpty())
                {
                    //Menampilkan pesan notifikasi jika seluruh EditText wajib diisi
                    Snackbar.make(view, "Wajib isi seluruh data !!!", Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    //Membuat kondisi untuk mengecek apakah isi dari EditText password dan EditText repassword sama atau tidak
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        //Menampilkan pesan notifikasi jika pendaftaraan berhasil
                        Toast.makeText(getApplicationContext(), "Pendaftaraan Berhasil...",Toast.LENGTH_LONG).show();

                        //Method untuk kembali ke activity main
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        //Menampilkan pesan bahwa isi dari EditText password dan EditText repassword tidak sama
                        Snackbar.make(view, "Password dan Repassword harus sama!!!",
                                Snackbar.LENGTH_LONG).show();
                    }

                }
            }
        });
    }
}