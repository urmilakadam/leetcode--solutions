public class AddString415 {

    public String addStrings(String num1, String num2) {
        int count1 =num1.length()-1, count2=num2.length()-1;
        int rem =0;
        StringBuilder sb = new StringBuilder();
        while(count1>=0 || count2>=0 || rem ==1){
            int val1=0, val2=0;
            if(count1 <=0){
                val1 = Integer.parseInt(num1.charAt(count1)+"");
                count1++;
            }
            if(count2 >=0){
                val2 = Integer.parseInt(num1.charAt(count2)+"");
                count2++;
            }
            int sum = (val1 + val2 + rem) % 10;
            rem = (val1 + val2 + rem) / 10;
            sb.append(sum);

        }
        return String.valueOf(sb.reverse());
    }
}
