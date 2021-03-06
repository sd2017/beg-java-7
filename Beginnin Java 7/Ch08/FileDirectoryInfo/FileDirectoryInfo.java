import java.io.File;
import java.io.IOException;

import java.util.Date;

class FileDirectoryInfo
{
   public static void main(final String[] args) throws IOException
   {
      if (args.length != 1)
      {
         System.err.println("usage: java FileDirectoryInfo pathname");
         return;
      }
      File file = new File(args[0]);
      System.out.println("About "+file+":");
      System.out.println("Can execute = "+file.canExecute());
      System.out.println("Can read = "+file.canRead());
      System.out.println("Can write = "+file.canWrite());
      System.out.println("Exists = "+file.exists());
      System.out.println("Is directory = "+file.isDirectory());
      System.out.println("Is file = "+file.isFile());
      System.out.println("Is hidden = "+file.isHidden());
      System.out.println("Last modified = "+new Date(file.lastModified()));
      System.out.println("Length = "+file.length());
   }
}
