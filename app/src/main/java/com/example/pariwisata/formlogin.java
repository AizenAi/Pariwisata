package com.example.pariwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class formlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formlogin);

        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress2);
        EditText editTextName = findViewById(R.id.editTextText);

        String enteredEmail = editTextEmail.getText().toString();
        String enteredName = editTextName.getText().toString();

        // Create a bundle and put the text in it with different keys
        Bundle bundle = new Bundle();
        bundle.putString("emailKey", enteredEmail); // Use a different key
        bundle.putString("nameKey", enteredName); // Use a different key

        // Create a new fragment instance and set the arguments
        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(bundle);

        // Start a fragment transaction
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Replace the fragment_container with your fragment
        transaction.replace(R.id.fragment_container, fragment);

        // Add the transaction to the back stack (optional)
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }

    public void masuklogin(View view) {
        Intent intent = new Intent(formlogin.this, MainActivity.class);
        startActivity(intent);

        Toast toast = Toast.makeText(this, "Anda Berhasil Masuk ", Toast.LENGTH_LONG);
        toast.show();
    }
}
