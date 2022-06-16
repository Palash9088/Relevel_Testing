public class Conditional_Boolean {
    public static void main(String[] args) {

        // && operator as if both conditions are true then
        // it will return true

        int aa=3, bb=30;

        boolean output = (aa == bb) && (bb % aa == 0); // only 1 matched the condition given hence False
        System.out.println(output);


        boolean output1 = (aa == bb) || (bb % 2 ==0); // one condition matched from given 2hence true
         System.out.println(output1);
    }
}
