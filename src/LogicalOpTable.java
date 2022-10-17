public class LogicalOpTable {

  public static void main(String[] args) {

    byte p, q;
    byte not;

    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

    p = q = 1;

    if ( p != 1) {
      not = 1;
    } else {
      not = 0;
    };

    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + not);

    q = 0;

    if ( p != 1) {
      not = 1;
    } else {
      not = 0;
    };

    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + not);

    p = 0; q = 1;

    if ( p != 1) {
      not = 1;
    } else {
      not = 0;
    };

    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + not);

    q = 0;

    if ( p != 1) {
      not = 1;
    } else {
      not = 0;
    };

    System.out.print(p + "\t" + q + "\t");
    System.out.print((p&q) + "\t" + (p|q) + "\t");
    System.out.println((p^q) + "\t" + not);
  }
}
