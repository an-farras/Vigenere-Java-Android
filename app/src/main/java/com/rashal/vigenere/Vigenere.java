package com.rashal.vigenere;

class Vigenere {

    private static String generateKey(String str, String initialKey) {
        StringBuilder keyBuilder = new StringBuilder(initialKey);
        for (int i = 0; ; i++) {
            if (i == initialKey.length())
                i = 0;
            if (keyBuilder.length() == str.length())
                break;
            keyBuilder.append(keyBuilder.charAt(i));
        }
        return keyBuilder.toString();
    }

    static String encryptText(String str, String initialKey) {
        String key = generateKey(str, initialKey);
        StringBuilder cipherText= new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            int x = (str.charAt(i) + key.charAt(i)) % 255;

            cipherText.append((char) (x));
        }
        return cipherText.toString();
    }

    static String decryptText(String cipher, String initialKey) {
        String key = generateKey(cipher, initialKey);
        StringBuilder plainText= new StringBuilder();

        for (int i = 0 ; i < cipher.length() && i < key.length(); i++)
        {
            int x = (cipher.charAt(i) - key.charAt(i)) %255;

            plainText.append((char) (x));
        }
        return plainText.toString();
    }
}
