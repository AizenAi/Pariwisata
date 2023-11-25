package com.example.pariwisata;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileFragment extends Fragment {

    private static final int PICK_IMAGE_REQUEST = 1000;
    ShapeableImageView shapeableImageView;
    FirebaseAuth auth;
    Button buttonlog;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        auth = FirebaseAuth.getInstance();
        buttonlog = view.findViewById(R.id.logout);
        textView = view.findViewById(R.id.gettext);
        shapeableImageView = view.findViewById(R.id.imageU);
        Button buttonLogout = view.findViewById(R.id.logout);
        Button buttonImageUpload = view.findViewById(R.id.imageupl);
        FirebaseUser user = auth.getCurrentUser();

        if (auth.getCurrentUser() == null) {
            Intent intent = new Intent(getActivity(), formlogin.class);
            startActivity(intent);
            getActivity().finish();
        }else {
            String userEmail = user.getEmail();
            if (userEmail != null) {
                textView.setText(userEmail);
            } else {

                textView.setText("Email Not Available");
            }
        }

        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getActivity(), formlogin.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        buttonImageUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent image = new Intent(Intent.ACTION_PICK);
                image.setType("image/*");
                startActivityForResult(image, PICK_IMAGE_REQUEST);
            }
        });

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                Uri selectedImageUri = data.getData();
                shapeableImageView.setImageURI(selectedImageUri);
                shapeableImageView.setTag(selectedImageUri);
            }
        }
    }
}
