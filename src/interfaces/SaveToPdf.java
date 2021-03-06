/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfCopyFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author Dell
 */
public class SaveToPdf {
    
    //method 01
    public void addContent_ExistingPDF(String id, String description)
    {
           
            //create new file with the new description
            Document document = new Document(PageSize.A4);
            document.addAuthor(id);
            document.addTitle("Form I-3");
            System.out.println("doc created");
            
            try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\temp.pdf"));
            document.open();
            Paragraph para = new Paragraph(description);
            document.add(para);
            document.close();
            
            //merge existing file(id.pdf) and newly created file(temp.pdf)
            String f1 = "C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\"+id+".pdf";
            String f2 = "C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\temp.pdf";
            
            PdfReader reader1 = new PdfReader(f1);
            PdfReader reader2 = new PdfReader(f2);

            PdfCopyFields copy = new PdfCopyFields(new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\Merged.pdf")) ;

            copy.addDocument(reader1);
            copy.addDocument(reader2);
            copy.close();
            reader1.close();
            reader2.close();
            System.out.println("Copy saved");
            
            //delete old files
            File file1 = new File(f1);
            File file2 = new File(f2);
            boolean success1 = file1.delete();
            boolean success2 = file2.delete();
            
            //rename Merged.pdf file to StudentID
            File merged_file = new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\Merged.pdf");
            
            boolean rename = merged_file.renameTo(new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\"+id+".pdf"));
                
            System.out.println("All successful !! ");
        } 
        catch (Exception e) {
        }
    }
    
    public void addContent_ExistingPDF_Reject(String id, String description)
    {
           
            //create new file with the new description
            Document document = new Document(PageSize.A4);
            document.addAuthor(id);
            document.addTitle("Form I-3");
            System.out.println("doc created");
            
            try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\temp.pdf"));
            document.open();
            Paragraph para = new Paragraph(description);
            document.add(para);
            document.close();
            
            //merge existing file(id.pdf) and newly created file(temp.pdf)
            String f1 = "C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\"+id+".pdf";
            String f2 = "C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\temp.pdf";
            
            PdfReader reader1 = new PdfReader(f1);
            PdfReader reader2 = new PdfReader(f2);

            PdfCopyFields copy = new PdfCopyFields(new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\Rejected\\Merged.pdf")) ;

            copy.addDocument(reader1);
            copy.addDocument(reader2);
            copy.close();
            reader1.close();
            reader2.close();
            System.out.println("Copy saved");
            
            //delete old files
            File file1 = new File(f1);
            File file2 = new File(f2);
            boolean success1 = file1.delete();
            boolean success2 = file2.delete();
            
            //rename Merged.pdf file to StudentID
            File merged_file = new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\Rejected\\Merged.pdf");
            
            boolean rename = merged_file.renameTo(new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\Rejected\\"+id+".pdf"));
                
            System.out.println("All successful !! ");
        } 
        catch (Exception e) {
        }
    }
    
    //
    public void addContent_ExistingPDF_Accept(String id, String description)
    {
           
            //create new file with the new description
            Document document = new Document(PageSize.A4);
            document.addAuthor(id);
            document.addTitle("Form I-3");
            System.out.println("doc created");
            
            try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\temp.pdf"));
            document.open();
            Paragraph para = new Paragraph(description);
            document.add(para);
            document.close();
            
            //merge existing file(id.pdf) and newly created file(temp.pdf)
            String f1 = "C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\"+id+".pdf";
            String f2 = "C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\temp.pdf";
            
            PdfReader reader1 = new PdfReader(f1);
            PdfReader reader2 = new PdfReader(f2);

            PdfCopyFields copy = new PdfCopyFields(new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\Accepted\\Merged.pdf")) ;

            copy.addDocument(reader1);
            copy.addDocument(reader2);
            copy.close();
            reader1.close();
            reader2.close();
            System.out.println("Copy saved");
            
            //delete old files
            File file1 = new File(f1);
            File file2 = new File(f2);
            boolean success1 = file1.delete();
            boolean success2 = file2.delete();
            
            //rename Merged.pdf file to StudentID
            File merged_file = new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\Accepted\\Merged.pdf");
            
            boolean rename = merged_file.renameTo(new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\Accepted\\"+id+".pdf"));
                
            System.out.println("All successful !! ");
        } 
        catch (Exception e) {
        }
    }
    //method 02
    public void addContent_NewPDF(String id, String student_info)
    {
        //if not exists create directory
        System.out.println("directory "+id+" not exists");
        File dir = new File("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id);
        boolean successful = dir.mkdirs();
        System.out.println("directory "+id+" created");
                
        //store pdf in that dir
        //create Temp file with the new description
            Document document = new Document(PageSize.A4);
            document.addAuthor(id);
            document.addTitle("Form I-3");
            System.out.println("doc created");
            
        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\Documents\\Form I-3\\"+id+"\\"+id+".pdf"));
            document.open();
            Paragraph para = new Paragraph(student_info);
            document.add(para);
            document.close();
        } catch (Exception e) {
        }
    }
    
    //update first page of existing PDF
    public void updateFirstPage_PDF(String id, String student_info)
    {
        
    }
    
}
