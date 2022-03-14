package malek.parser.symbol;


public class FileType implements Type {
    private enum FileTypeEnum {
        INTERFACE,
        TYPE
    }
    FileTypeEnum fileTypeEnum;
    public static FileType INTERFACE_TYPE = new FileType(FileTypeEnum.INTERFACE);
    public static FileType TYPE_TYPE = new FileType(FileTypeEnum.TYPE);
    public FileType(FileTypeEnum fileTypeEnum) {
        this.fileTypeEnum = fileTypeEnum;
    }
    @Override
    public String getName() {
        return fileTypeEnum.toString();
    }

    @Override
    public String toString() {
        return fileTypeEnum.toString();
    }
}