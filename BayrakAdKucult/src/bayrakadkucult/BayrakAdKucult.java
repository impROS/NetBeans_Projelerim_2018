package bayrakadkucult;

import java.io.File;

public class BayrakAdKucult {

    public static void main(String[] args) {
        String strTargetDir = "C:\\Users\\impROS\\Documents\\NetBeansProjects\\BayrakLink\\flags\\";
        File file = new File(strTargetDir);
        File[] arrFile = file.listFiles();
        for (int i = 0; i < arrFile.length; i++) {
            if (arrFile[i].isFile()) {
                System.out.println(new File(arrFile[i].getAbsolutePath().toLowerCase()));
                boolean isRename = arrFile[i].renameTo(new File(arrFile[i].getAbsolutePath().toLowerCase()));
                System.out.println(isRename);
            }
        }

    }

}
