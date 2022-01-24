import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {

    static String readTextFile(String fileName) {
        System.out.println("Reading file " + fileName);
        StringBuilder retStr = new StringBuilder();

        try {
            FileInputStream inStream = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(inStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                retStr.append(line);
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return retStr.toString();

    }

    static void writeTextFile(String fileName, String fileContents) {
        System.out.println("Writing file " + fileName);

        try {
            FileOutputStream outStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(fileContents);
            bufferedWriter.close();

            /* for (int i = 0; i < fileContents.length(); i++) {
                writer.write(fileContents.charAt(i));
            }
            writer.close(); */

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
