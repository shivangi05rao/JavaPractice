package filehandling;

import java.io.File;

//using directories
public class DirList {
    public static void main(String[] args) {
        String dirName = "/java";
        File f1 = new File(dirName);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String[] s = f1.list();

            for (int i = 0; i < s.length; i++) {
                File file = new File(dirName + "/" + s[i]);
                if (file.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirName + " is not directory");
        }
    }
}
