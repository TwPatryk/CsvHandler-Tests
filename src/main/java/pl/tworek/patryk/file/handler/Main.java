package pl.tworek.patryk.file.handler;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        String csvFile = "d:\\Sopra-Steria_File_Handling\\ItemX.csv";
        readAndReport(csvFile);
    }

    public static void readAndReport(String csvFile) {
        String delimiter = ",";
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            int supply = 0;
            int buy = 0;
            int result = 0;

            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr[0].equals("supply")) {
                    supply += Integer.valueOf(arr[1]);
                } else {
                    buy += Integer.valueOf(arr[1]);
                }
                result = supply - buy;
            }
            br.close();

            String csvReport = "d:\\Sopra-Steria_File_Handling\\report.csv";
            File reportFile = new File(csvReport);
            try {
                FileWriter fileWriter = new FileWriter(reportFile);
                fileWriter.append("buy," + buy)
                        .append("\n")
                        .append("supply," + supply)
                        .append("\n")
                        .append("result," + result);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
