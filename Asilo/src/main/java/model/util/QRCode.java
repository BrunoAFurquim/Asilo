/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import dao.DAO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRCode {

   private final String qrCodeText;
   private final String arquivo;
   private final int tamanho;
   private final DAO dao;
   public static final String TIPO = "png";

    public QRCode() {
        dao = DAO.getInstance();
        qrCodeText = "00020126530014BR.GOV.BCB.PIX0131hospitaldocancerpp@hrcpp.org.br5204000053039865802BR5921Hospital da Esperanca6013Pres Prudente62100506Doacao6304450F";
        arquivo = "qrcode.png";
        tamanho = 200;
    }

    public String generateQRCodeImage()
            throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(this.qrCodeText, BarcodeFormat.QR_CODE, this.tamanho, this.tamanho);
        Path caminho = FileSystems.getDefault().getPath(arquivo);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", caminho);

        return this.arquivo;
    }

}
