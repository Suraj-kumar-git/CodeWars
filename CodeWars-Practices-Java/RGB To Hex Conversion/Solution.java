public class RgbToHex {

    public static String rgb(int r, int g, int b) {
       r = Math.min(255, Math.max(0, r)); // Ensure r is within valid range
        g = Math.min(255, Math.max(0, g)); // Ensure g is within valid range
        b = Math.min(255, Math.max(0, b)); // Ensure b is within valid range

        String hexR = Integer.toHexString(r);
        String hexG = Integer.toHexString(g);
        String hexB = Integer.toHexString(b);

        // Pad with leading zeros if necessary
        hexR = hexR.length() < 2 ? "0" + hexR : hexR;
        hexG = hexG.length() < 2 ? "0" + hexG : hexG;
        hexB = hexB.length() < 2 ? "0" + hexB : hexB;

        String ans =  hexR + hexG + hexB;
      return ans.toUpperCase();
    }
}
