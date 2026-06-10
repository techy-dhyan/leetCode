class Solution {
    public boolean isNumber(String s) {
        s = s.strip();

        List<String> list = new ArrayList<>(Arrays.asList("inf", "+inf", "-inf","infinity", "+infinity", "-infinity","nan", "+nan", "-nan"));
        if (list.contains(s.toLowerCase())){
            return false;
        }
        char last = s.charAt(s.length() - 1);
        if (last == 'f' || last == 'F' ||
            last == 'd' || last == 'D') {
            return false;
        }
        try{
            double f = Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    
}