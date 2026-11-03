public interface FileSystemItem {
   int getSize(); 
}
// Both File and Folder follow this, so we can treat them the same way