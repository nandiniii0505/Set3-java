class CountDigits {
    public static void main(String[] args) {
    int n = 24680;
    int temp = n;
    int count = 0;
 while (temp != 0) {
    count++;
  temp = temp / 10;
        }
 System.out.println(count);
    }
}
