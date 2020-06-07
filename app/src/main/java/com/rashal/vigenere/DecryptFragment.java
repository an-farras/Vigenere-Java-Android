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

public class DecryptFragment extends Fragment implements View.OnClickListener{

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup contaier, Bundle SavedInstanceState) {
        rootView = layoutInflater.inflate(R.layout.fragment_decrypt, contaier, false);

        Button decryptButton = rootView.findViewById(R.id.startDecrypt);
        decryptButton.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.startDecrypt) {
            EditText encryptedText = rootView.findViewById(R.id.encrypted_text);
            String cipher = encryptedText.getText().toString();
            TextView decryptedText = rootView.findViewById(R.id.decrypted_text);
            EditText decryptKey = rootView.findViewById(R.id.decrypt_key);
            String key = decryptKey.getText().toString();
            String plain = decryptText(cipher, key);
            decryptedText.setText(plain);
        }
    }
}
