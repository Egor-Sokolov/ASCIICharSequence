package com.company;




public class AsciiCharSequence implements CharSequence {
    private final byte[] arrayByte;

    public AsciiCharSequence(byte[] arrayByte) {
        this.arrayByte =arrayByte.clone();
    }


    @Override
    public int length() {
        return arrayByte.length;
    }

    @Override
    public char charAt(int index) {
        return (char) arrayByte[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] arrayByte = this.arrayByte;
        byte[] arrayByteNew = new byte[end - start];

        for(int i = 0; i < end - start; i++){
            arrayByteNew[i] =arrayByte[start+i];
        }
        CharSequence answer = new AsciiCharSequence(arrayByteNew);


        return answer;
    }

    @Override
    public String toString() {

        String string = new String(this.arrayByte);
        return string;
    }
}
