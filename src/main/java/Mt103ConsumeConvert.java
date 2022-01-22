import com.prowidesoftware.swift.io.ConversionService;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;
import com.prowidesoftware.swift.utils.Lib;

import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Mt103ConsumeConvert {

    public static void main(String[] args) throws IOException {

        String dirPath = "/home/shemuchemi/t24.KE.SWIFT.MT103/Dample_103";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0) {
            System.out.println("There are no files in the directory");
        } else {
            for (File aFile : files) {
                System.out.println(aFile.getName() + " - " + aFile.length());

                MT103 mt = MT103.parse(Lib.readResource("/home/shemuchemi/t24.KE.SWIFT.MT103/Dample_103/t24.KE.SWIFT.MT103.469-3663667.20191126065546435592.SWF"));
                System.out.println(mt);

            }
        }
    }

    public static MT103 fileToMT103(File file) throws IOException {
        if (file == null) {
            return null;
        }
        return new MT103(file);
    }
}

