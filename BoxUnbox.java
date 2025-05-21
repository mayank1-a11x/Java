public class BoxUnbox {
    public static void main(String[] args) {
        Integer boxInteger = Integer.valueOf(10);
        Double boxDouble = Double.valueOf(3.14);
        Character boxCharacter = Character.valueOf('A');
        Boolean boxBoolean = Boolean.valueOf(true);

        int unboxInt = boxInteger.intValue();
        double unboxDouble = boxDouble.doubleValue();
        char unboxChar = boxCharacter.charValue();
        boolean unboxBoolean = boxBoolean.booleanValue();

        System.out.println("---BOX VALUES---");
        System.out.println("Integer: " + boxInteger);
        System.out.println("Double: " + boxDouble);
        System.out.println("Character: " + boxCharacter);
        System.out.println("Boolean: " + boxBoolean);

        System.out.println("---UNBOX VALUES---");
        System.out.println("int: " + unboxInt);
        System.out.println("double: " + unboxDouble);
        System.out.println("char: " + unboxChar);
        System.out.println("boolean: " + unboxBoolean);
    }
}
