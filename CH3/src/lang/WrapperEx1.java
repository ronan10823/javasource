package lang;

public class WrapperEx1 {
    public static void main(String[] args) {
        // boolean => Boolean
        boolean b = true;
        // Boolean boolean1 = new Boolean(b); 
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false;
        
        // byte => Byte
        Byte byte1 = 1;
        Byte byte2 = Byte.valueOf((byte) 1);

        // char => Character
        Character ch = 'a';
        Character ch2 = Character.valueOf('a');

        // short => Short
        // int => Integer
        Integer.parseInt("15");
        // long => Long
        Long long1 = 15L;
        Long.parseLong("15.5");
        // float => Float
        Float float1 = 16.5f; 
        Float.parseFloat("16.48");
        // double => Double
        Double double1 = 18.5d;
        Double.parseDouble("172.56");
    }
}
