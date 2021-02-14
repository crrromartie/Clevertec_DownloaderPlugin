package ru.clevertec.downloader;

public class DownloadPluginExtension {
    private String templateUrl = "https://github.com/stebadmitriy/files/raw/main/Clevertec_Template.pdf";
    private String targetFile = "D:/templates/Clevertec_Template.pdf";

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }
}

