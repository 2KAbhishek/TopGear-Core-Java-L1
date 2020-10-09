class RunTimeError {
    public static void main(String args[]) {
        String sString = "Wipro";
        Object refObject = sString;
        String sStr = (String) refObject;
        Integer objInteger = Integer.valueOf(10);
        refObject = objInteger;
        Integer refInteger = (Integer) refObject;
        sStr = "" + refObject;
    }
}
