package malek.parser.addingphase.symbol;

public class FileLocation {
    String packageLocation;
    String name;
    public FileLocation(String name) {
        this.name = name;
    }
    public FileLocation(String packageLocation, String name) {
        this.name = name;
        this.packageLocation = packageLocation;
    }
    public String getFileLocation() {
        if(packageLocation != null) {
            return packageLocation+":"+name;
        }
        return name;
    }
}
