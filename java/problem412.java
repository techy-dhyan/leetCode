class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> o = new ArrayList<>();
        for (int i = 1;i<n+1;i++){
            if (i%3==0 && i%5==0){o.add("FizzBuzz");}
            else if (i%3==0 ){o.add("Fizz");}
            else if (i%5==0){o.add("Buzz");}
            else {o.add(String.valueOf(i));}
        }
        return o;
    }
}