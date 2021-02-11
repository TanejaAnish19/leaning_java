import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class MYDOS {
	
	public static void list_dir(String dirPath) {
		try {
			File directory = new File(dirPath);
			File filesList[] = directory.listFiles();
			System.out.println("The directory contents are : ");
			for(File file : filesList) {
				System.out.println("File Name : "+file.getName());
				System.out.println("File Path : "+file.getAbsolutePath());
				System.out.println("File Size : "+file.getTotalSpace());
				System.out.println();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void copy_file(String src, String dest) throws IOException{
		File source = new File(src);
		File destination = new File(dest);
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(destination);
			byte[] buffer = new byte[1024];
			int length;
			while((length = is.read(buffer)) > 0) {
				os.write(buffer,0,length);
			}
		}finally {
			is.close();
			os.close();
		}
	}
	

	public static void main(String[] args) throws IOException {
		String command = args[0];
		System.out.println(command);
		if(command.equals("dir")) {
			list_dir(args[1]);
		}
		else if(command.equals("copy")) {
			copy_file(args[1],args[2]);
		}
	}

}