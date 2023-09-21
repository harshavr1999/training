import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIODemo1 {
  public static void main(String[] args) throws IOException {
    DataOutputStream out = new DataOutputStream(new FileOutputStream(
        "Java.txt"));

    double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    int[] units = { 12, 8, 13, 29, 50 };
    String[] descs = { "Java", "Source ", "and",
        "Support.","Cool"};

    for (int i = 0; i < prices.length; i++) {
      out.writeDouble(prices[i]);
      out.writeChar('\t');
      out.writeInt(units[i]);
      out.writeChar('\t');
      out.writeChars(descs[i]);
      out.writeChar('\n');
    }
    out.close();

    // read it in again
    DataInputStream in = new DataInputStream(new FileInputStream(
        "Java.txt"));

    double price;
    int unit;
    String desc;
    double total = 0.0;

    try {
      while (true) {
        price = in.readDouble();
        in.readChar(); // throws out the tab
        unit = in.readInt();
        in.readChar(); // throws out the tab
        desc = in.readLine();
        System.out.println( unit );
        System.out.println( desc );
        System.out.println( price );
        total = total + unit * price;
      }
    } catch (EOFException e) {
    }
    in.close();
  }
}
