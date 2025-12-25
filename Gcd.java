class GCDNo {
    public static void main(String[] args) {
        int a = 24, b = 36;
while (b != 0) {
  int r = a % b;
       a = b;
       b = r;
        }
 System.out.println("GCD = " + a);
    }
}
