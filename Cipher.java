package datastructureassinment;

public class Cipher {

    public Cipher() {
    }

    public String encoder(String phase, int shift) {
        phase = phase.toLowerCase();
        String encodedPhase = "";
        char[] phaseAsChar = phase.toCharArray();
        for (int i = 0; i < phaseAsChar.length; i++) {
            if (phaseAsChar[i] != ' ') {
                //concept from slides of array stack 
                phaseAsChar[i] = (char) ((phaseAsChar[i] + shift - 97) % 26 + 97);
            }
            encodedPhase = String.valueOf(phaseAsChar);
        }
        return encodedPhase;
    }
    public String decoder(String phase,int shift){
        String decodedPhase ="";
        char[] phaseAsChar = phase.toCharArray();
        for (int i = 0; i < phaseAsChar.length; i++) {
            if (phaseAsChar[i] != ' ') {
                //concept from slides of array stack 
                phaseAsChar[i] = (char) ((phaseAsChar[i] - shift - 123) % 26 + 123);
            }
            decodedPhase = String.valueOf(phaseAsChar);
        }
        return decodedPhase;
    }

}
