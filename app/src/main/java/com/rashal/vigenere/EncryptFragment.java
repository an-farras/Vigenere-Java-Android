package com.rashal.vigenere;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import static com.rashal.vigenere.Vigenere.*;

public class EncryptFragment extends Fragment implements View.OnClickListener{

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup contaier, Bundle SavedInstanceState) {
        rootView = layoutInflater.inflate(R.layout.fragment_encrypt, contaier, false);

        Button encryptButton = rootView.findViewById(R.id.startEncrypt);
        encryptButton.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.startEncrypt) {
            EditText plainText = rootView.findViewById(R.id.plain_text);
            String plain = plainText.getText().toString();
            EditText encryptKey = rootView.findViewById(R.id.encrypt_key);
            String key = encryptKey.getText().toString();
            TextView cipherText = rootView.findViewById(R.id.cipher_text);

            String cipher = encryptText(plain, key);
            cipherText.setText(cipher);
        }
    }
}