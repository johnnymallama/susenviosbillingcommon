package co.com.surenvios.librarycommon.dto.facture.response.common;

import java.io.Serializable;

public class ResponseFacture implements Serializable {

    private String isSuccess;

    private boolean isDuplicateDocumentRequest;

    private String requestId;

    private String shortRequestId;

    private String fileNameInteroperability;

    private String UUID;

    private String documentNumber;

    private String LDF;

    private String URL;

    private String UBL;

    private String UrlPdf;

    private String UrlXml;

    private String UrlZip;

    private String AckXml;

    private String AckNumber;

    private String pdfFileName;

    private String xmlFileName;

    private String validatingErrorMessages;

    private String dianStatusCode;

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public boolean isDuplicateDocumentRequest() {
        return isDuplicateDocumentRequest;
    }

    public void setDuplicateDocumentRequest(boolean isDuplicateDocumentRequest) {
        this.isDuplicateDocumentRequest = isDuplicateDocumentRequest;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getShortRequestId() {
        return shortRequestId;
    }

    public void setShortRequestId(String shortRequestId) {
        this.shortRequestId = shortRequestId;
    }

    public String getFileNameInteroperability() {
        return fileNameInteroperability;
    }

    public void setFileNameInteroperability(String fileNameInteroperability) {
        this.fileNameInteroperability = fileNameInteroperability;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String uUID) {
        UUID = uUID;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getLDF() {
        return LDF;
    }

    public void setLDF(String lDF) {
        LDF = lDF;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String uRL) {
        URL = uRL;
    }

    public String getUBL() {
        return UBL;
    }

    public void setUBL(String uBL) {
        UBL = uBL;
    }

    public String getUrlPdf() {
        return UrlPdf;
    }

    public void setUrlPdf(String urlPdf) {
        UrlPdf = urlPdf;
    }

    public String getUrlXml() {
        return UrlXml;
    }

    public void setUrlXml(String urlXml) {
        UrlXml = urlXml;
    }

    public String getUrlZip() {
        return UrlZip;
    }

    public void setUrlZip(String urlZip) {
        UrlZip = urlZip;
    }

    public String getAckXml() {
        return AckXml;
    }

    public void setAckXml(String ackXml) {
        AckXml = ackXml;
    }

    public String getAckNumber() {
        return AckNumber;
    }

    public void setAckNumber(String ackNumber) {
        AckNumber = ackNumber;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }

    public String getXmlFileName() {
        return xmlFileName;
    }

    public void setXmlFileName(String xmlFileName) {
        this.xmlFileName = xmlFileName;
    }

    public String getValidatingErrorMessages() {
        return validatingErrorMessages;
    }

    public void setValidatingErrorMessages(String validatingErrorMessages) {
        this.validatingErrorMessages = validatingErrorMessages;
    }

    public String getDianStatusCode() {
        return dianStatusCode;
    }

    public void setDianStatusCode(String dianStatusCode) {
        this.dianStatusCode = dianStatusCode;
    }
}
