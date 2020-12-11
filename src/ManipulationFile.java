import java.io.File;

public interface ManipulationFile {
  final public String urlInput = "./dir/input.txt";
  final public String urlOutput = "./dir/output.txt";
  final public String path = "./dir";

  public static void createFile() {
    File folder = new File(path);
    folder.mkdir();

  }

  public static void writeFIle(Object o) {

  }
}
