package PrintPdf;



import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;


import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class print {
    private static void sendPdfToPrinter(String epsilon) throws IOException {
        FileInputStream psStream = null;
//        try {
//            psStream = new FileInputStream(epsilon);
//        } catch (FileNotFoundException ffne) {
//            ffne.printStackTrace();
//        }
//        if (psStream == null) {
//            return;
//        }
        DocFlavor psInFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        PDDocument myDoc = PDDocument.load(new File(epsilon));
//        Doc myDoc = new SimpleDoc(psStream, psInFormat, null);
        PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
        PrintService[] services = PrintServiceLookup.lookupPrintServices(psInFormat, aset);

        // this step is necessary because I have several printers configured
        PrintService myPrinter = null;
        for (PrintService service : services) {
            String svcName = service.toString();
            System.out.println("service found: " + svcName);
            if (svcName.contains("Canon")) {
                myPrinter = service;
                System.out.println("my printer found: " + svcName);
                break;
            }
        }

        if (myPrinter != null) {
            PrinterJob job = PrinterJob.getPrinterJob();
            try {
                job.setPrintService(myPrinter);
                job.setPageable(new PDFPageable(myDoc));
                job.print();
            } catch (PrinterException e) {
                JOptionPane.showConfirmDialog(null,e);
                // Handle the exception.
            }
        } else {
            System.out.println("no printer services found");
        }
    }

    public static void main(String[] args) throws IOException {
        //@SuppressWarnings("unused")
        //Testing t = new Testing();
        String test = ("C:\\Users\\dborisov\\Desktop\\rexton\\Basic.pdf");
        sendPdfToPrinter(test);
    }
}