package infrastructure;

import domain.NoSuchDBException;
import domain.Order;

import java.io.*;

public class DatabaseToFile implements Database{
    String fileName;

    public DatabaseToFile(String fn) {
        this.fileName = fn;
    }

    @Override
    public int saveOrder(Order order) throws NoSuchDBException {
        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();
        try {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            sb.append(order.getPrice());
            sb.append(";");
            sb.append(order.isHasPaid());
            sb.append(";");
            sb.append(order.getDropTime());
            sb.append(";");
            bw.write(sb.toString());
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            throw new NoSuchDBException(e.getMessage());
        }
        return order.getId();
    }
}
