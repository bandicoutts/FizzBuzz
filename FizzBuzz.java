class FizzBuzz {

    private static void evaluateNumbers(){
        for (int i = 0; i <= 100; i++){
            String result = "";
            if (i % 3 == 0){
                result += "Fizz";
            }
            if (i % 5 == 0){
                result += "Buzz";
            }
            if (i % 3 != 0 && i % 5 != 0){
                result += i;
            }
            System.out.println(result);
        }
    }


    public static void main(String[] args) {
        evaluateNumbers();
    }

}